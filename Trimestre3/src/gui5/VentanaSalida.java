package gui5;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaSalida extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel lblHabitacion, lblFechaIngreso, lblFechaSalida, lblCantidadDias, lblTotal;
	private JTextField txtFechaSalida;
	private JButton btnCalcular, btnRegistrarSalida;

	private Hotel hotel;
	private int numeroHabitacion;
	private Habitacion habitacionActual;
	private Huesped huespedActual;
	private SimpleDateFormat formatoFecha;

	/**
	 * Constructor de la ventana de salida de huéspedes
	 * @param hotel Instancia compartida del hotel
	 * @param numero Número de la habitación que entrega el huésped
	 */
	public VentanaSalida(Hotel hotel, int numero) {
		this.hotel = hotel;
		this.numeroHabitacion = numero;
		this.formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
		this.formatoFecha.setLenient(false); // Evita fechas inválidas como 31 de febrero

		// Recuperar la habitación y el huésped correspondiente de la lista
		buscarDatosHabitacion();

		inicio();

		setTitle("Salida huésp..."); // Título truncado como en la captura
		setSize(300, 380); // Dimensiones adecuadas para la distribución vertical
		setLocationRelativeTo(null); // Centrar en pantalla
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
	}

	/**
	 * Busca la habitación y extrae la información del huésped asignado
	 */
	private void buscarDatosHabitacion() {
		for (Habitacion hab : Hotel.listaHabitaciones) {
			if (hab.getNumeroHabitacion() == numeroHabitacion) {
				this.habitacionActual = hab;
				this.huespedActual = hab.getHuesped();
				break;
			}
		}
	}

	/**
	 * Inicializa y posiciona los componentes gráficos recreando las imágenes h) e i)
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		Font fuenteNegrita = new Font("Arial", Font.BOLD, 13);

		// 1. Etiqueta Habitación
		lblHabitacion = new JLabel("Habitación: " + numeroHabitacion, SwingConstants.CENTER);
		lblHabitacion.setFont(fuenteNegrita);
		lblHabitacion.setBounds(20, 20, 245, 20);
		contenedor.add(lblHabitacion);

		// 2. Etiqueta Fecha de Ingreso (Obtenida dinámicamente del hotel)
		String stringFechaIngreso = hotel.buscarFechaIngresoHabitacion(numeroHabitacion);
		lblFechaIngreso = new JLabel("Fecha de ingreso: " + stringFechaIngreso, SwingConstants.CENTER);
		lblFechaIngreso.setFont(fuenteNegrita);
		lblFechaIngreso.setBounds(20, 50, 245, 20);
		contenedor.add(lblFechaIngreso);

		// 3. Etiqueta Fecha de Salida informativa
		lblFechaSalida = new JLabel("Fecha de salida (aaaa-mm-dd):", SwingConstants.CENTER);
		lblFechaSalida.setFont(fuenteNegrita);
		lblFechaSalida.setBounds(20, 80, 245, 20);
		contenedor.add(lblFechaSalida);

		// 4. Campo de texto para ingresar la fecha de salida (Formato aaaa-mm-dd convertido a yyyy/MM/dd internamente)
		txtFechaSalida = new JTextField();
		txtFechaSalida.setHorizontalAlignment(JTextField.CENTER);
		txtFechaSalida.setBounds(40, 110, 205, 25);
		contenedor.add(txtFechaSalida);

		// 5. Botón Calcular
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 145, 205, 30);
		btnCalcular.addActionListener(this);
		contenedor.add(btnCalcular);

		// 6. Etiqueta Cantidad de días
		lblCantidadDias = new JLabel("Cantidad de días:");
		lblCantidadDias.setFont(fuenteNegrita);
		lblCantidadDias.setBounds(40, 190, 205, 20);
		contenedor.add(lblCantidadDias);

		// 7. Etiqueta Total a pagar
		lblTotal = new JLabel("Total: $");
		lblTotal.setFont(fuenteNegrita);
		lblTotal.setBounds(40, 220, 205, 20);
		contenedor.add(lblTotal);

		// 8. Botón Registrar Salida (Inhabilitado inicialmente hasta que se calcule el total)
		btnRegistrarSalida = new JButton("RegistrarSalida");
		btnRegistrarSalida.setBounds(40, 260, 205, 35);
		btnRegistrarSalida.setEnabled(false);
		btnRegistrarSalida.addActionListener(this);
		contenedor.add(btnRegistrarSalida);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnCalcular) {
			procesarCalculo();
		} else if (evento.getSource() == btnRegistrarSalida) {
			procesarSalida();
		}
	}

	/**
	 * Valida las fechas, calcula los días de alojamiento y el precio total
	 */
	private void procesarCalculo() {
		String inputFechaSalida = txtFechaSalida.getText().trim();

		// Adaptamos el formato visual "aaaa-mm-dd" reemplazando guiones por barras si es necesario
		inputFechaSalida = inputFechaSalida.replace("-", "/");

		if (inputFechaSalida.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Debe ingresar la fecha de salida.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			Date fechaSalida = formatoFecha.parse(inputFechaSalida);
			Date fechaIngreso = huespedActual.getFechaIngreso();

			// Validar estrictamente que la fecha de salida sea posterior a la de ingreso
			if (!fechaSalida.after(fechaIngreso)) {
				JOptionPane.showMessageDialog(this, "La fecha de salida debe ser mayor a la fecha de ingreso al hotel.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Guardar la fecha en el objeto Huésped y calcular los días
			huespedActual.setFechaSalida(fechaSalida);
			int diasEstancia = huespedActual.obtenerDiasAlojamiento();

			// Si por horas el cálculo da 0 días, se asume mínimo 1 día de cobro
			if (diasEstancia <= 0) {
				diasEstancia = 1;
			}

			// Calcular el precio total en base al precio por día asignado en la clase Hotel
			double precioPorDia = habitacionActual.getPrecioDia();
			double totalPagar = diasEstancia * precioPorDia;

			// Actualizar las etiquetas visuales de la interfaz de forma exacta a la imagen i)
			lblCantidadDias.setText("Cantidad de días: " + diasEstancia);
			lblTotal.setText("Total: $" + totalPagar);

			// Habilitar el botón final de salida
			btnRegistrarSalida.setEnabled(true);

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "Formato de fecha de salida incorrecto. Use aaaa-mm-dd", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Libera la habitación volviendo a dejarla disponible y desvinculando al huésped
	 */
	private void procesarSalida() {
		// La habitación queda disponible para futuros registros
		habitacionActual.setDisponible(true);
		habitacionActual.setHuesped(null);

		JOptionPane.showMessageDialog(this, "La salida del huésped ha sido registrada con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		this.dispose(); // Cerrar ventana
	}
}