package gui5;

import java.awt.Container;
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

public class VentanaIngreso extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel lblHabitacion, lblFecha, lblHuesped, lblNombre, lblApellidos, lblDoc;
	private JTextField txtFecha, txtNombre, txtApellidos, txtDoc;
	private JButton btnAceptar, btnCancelar;
	
	private Hotel hotel;
	private int numeroHabitacion;
	private JFrame ventanaPadre; // Para poder interactuar o refrescar la ventana anterior si fuera necesario

	/**
	 * Constructor de la Ventana de Ingreso
	 * @param hotel Instancia compartida del hotel
	 * @param numeroHabitacion Número de la habitación seleccionada
	 * @param ventanaPadre Ventana desde la que se invoca (VentanaHabitaciones)
	 */
	public VentanaIngreso(Hotel hotel, int numeroHabitacion, JFrame ventanaPadre) {
		this.hotel = hotel;
		this.numeroHabitacion = numeroHabitacion;
		this.ventanaPadre = ventanaPadre;
		
		inicio();
		
		setTitle("Ingreso"); // Título de la ventana
		setSize(320, 280); // Tamaño similar a la captura de pantalla
		setLocationRelativeTo(null); // Centrado en pantalla
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana
		setResizable(false);
	}

	/**
	 * Configuración y distribución de los componentes visuales (Absolute Layout)
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null); // Layout nulo para emular la distribución exacta de la imagen

		// Etiqueta de Habitación fija
		lblHabitacion = new JLabel("Habitación: " + numeroHabitacion);
		lblHabitacion.setBounds(20, 20, 150, 20);
		contenedor.add(lblHabitacion);

		// Campo de Fecha de Ingreso
		lblFecha = new JLabel("Fecha (aaaa-mm-dd):");
		lblFecha.setBounds(20, 50, 140, 20);
		contenedor.add(lblFecha);

		txtFecha = new JTextField();
		txtFecha.setBounds(160, 50, 120, 20);
		contenedor.add(txtFecha);

		// Subtítulo Sección Huésped
		lblHuesped = new JLabel("Huésped");
		lblHuesped.setBounds(20, 80, 100, 20);
		contenedor.add(lblHuesped);

		// Campo Nombre
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 110, 100, 20);
		contenedor.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(160, 110, 120, 20);
		contenedor.add(txtNombre);

		// Campo Apellidos
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(20, 140, 100, 20);
		contenedor.add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setBounds(160, 140, 120, 20);
		contenedor.add(txtApellidos);

		// Campo Documento de Identidad
		lblDoc = new JLabel("Doc. Identidad:");
		lblDoc.setBounds(20, 170, 100, 20);
		contenedor.add(lblDoc);

		txtDoc = new JTextField();
		txtDoc.setBounds(160, 170, 120, 20);
		contenedor.add(txtDoc);

		// Botón Aceptar
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(30, 210, 100, 25);
		btnAceptar.addActionListener(this);
		contenedor.add(btnAceptar);

		// Botón Cancelar
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(160, 210, 100, 25);
		btnCancelar.addActionListener(this);
		contenedor.add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnCancelar) {
			this.dispose(); // Cierra la ventana actual sin realizar cambios
		}
		
		if (evento.getSource() == btnAceptar) {
			procesarRegistro();
		}
	}

	/**
	 * Realiza las validaciones de los campos obligatorios, formatos y registra al huésped
	 */
	private void procesarRegistro() {
		String stringFecha = txtFecha.getText().trim();
		String nombre = txtNombre.getText().trim();
		String apellidos = txtApellidos.getText().trim();
		String stringDoc = txtDoc.getText().trim();

		// 1. Validar que los campos de entrada no estén vacíos (Obligatorios)
		if (stringFecha.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || stringDoc.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// 2. Validar el formato numérico del Documento de Identidad
		int documentoIdentidad = 0;
		try {
			documentoIdentidad = Integer.parseInt(stringDoc);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "El documento de identidad debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// 3. Validar el formato de la Fecha (aaaa-mm-dd -> cambiado a yyyy-MM-dd internamente)
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		formatoFecha.setLenient(false); // Evita que acepte fechas ilógicas (ej: 2021-02-31)
		Date fechaIngreso = null;
		try {
			fechaIngreso = formatoFecha.parse(stringFecha);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Utilice el formato aaaa-mm-dd", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// 4. Buscar la habitación en la lista global del hotel y modificar sus datos de asignación
		for (Habitacion hab : Hotel.listaHabitaciones) {
			if (hab.getNumeroHabitacion() == numeroHabitacion) {
				
				// Crear la instancia del Huésped con los datos validados
				Huesped nuevoHuesped = new Huesped(nombre, apellidos, documentoIdentidad);
				nuevoHuesped.setFechaIngreso(fechaIngreso);
				
				// Asignar huésped y cambiar disponibilidad
				hab.setHuesped(nuevoHuesped);
				hab.setDisponible(false); // Pasa a estar "No disponible"
				
				// Mensaje de éxito idéntico al de la imagen
				JOptionPane.showMessageDialog(this, "El huésped ha sido registrado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				
				// Cerrar esta ventana de ingreso
				this.dispose();
				
				// Opcional: Si deseas cerrar o refrescar la ventana de selección de habitaciones tras el éxito
				if (ventanaPadre != null) {
					ventanaPadre.dispose(); 
				}
				return;
			}
		}
	}
}