package gui5;

import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VentanaHabitaciones extends JFrame implements ActionListener {

	private Container contenedor;
	
	// Arreglos de etiquetas para mostrar el número de habitación y su estado dinámicamente
	private JLabel[] lblTitulosHabitaciones;
	private JLabel[] lblEstadosHabitaciones;
	
	private JLabel lblSeleccion;
	private JSpinner spnHabitacion;
	private JButton btnAceptar;
	
	private Hotel hotel;

	/**
	 * Constructor de la clase VentanaHabitaciones
	 * @param hotel Instancia compartida que contiene el estado de las habitaciones
	 */
	public VentanaHabitaciones(Hotel hotel) {
		this.hotel = hotel;
		
		inicio();
		
		setTitle("Habitaciones"); // Título de la ventana
		setSize(680, 280); // Ancho extendido para ajustarse a la distribución horizontal de la imagen
		setLocationRelativeTo(null); // Centrar en la pantalla
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana independiente
		setResizable(false);
	}

	/**
	 * Método que distribuye los componentes en la ventana imitando la estructura de la captura
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null); // Absolute layout utilizado para calzar la posición exacta de las imágenes

		lblTitulosHabitaciones = new JLabel[10];
		lblEstadosHabitaciones = new JLabel[10];
		
		Font fuenteNegrita = new Font("Arial", Font.BOLD, 12);

		// Recorremos las 10 habitaciones de la lista global del hotel para pintar sus estados
		for (int i = 0; i < 10; i++) {
			Habitacion hab = Hotel.listaHabitaciones.get(i);
			
			// Determinar las coordenadas X e Y para simular la grilla de 2 filas x 5 columnas
			int fila = (i < 5) ? 0 : 1;
			int columna = i % 5;
			
			int posX = 30 + (columna * 125);
			int posY = 30 + (fila * 65);

			// Etiqueta del título (ej: Habitación 1)
			lblTitulosHabitaciones[i] = new JLabel("Habitación " + hab.getNumeroHabitacion());
			lblTitulosHabitaciones[i].setFont(fuenteNegrita);
			lblTitulosHabitaciones[i].setBounds(posX, posY, 100, 20);
			contenedor.add(lblTitulosHabitaciones[i]);

			// Etiqueta del estado (ej: Disponible o No disponible)
			String textoEstado = hab.getDisponible() ? "Disponible" : "No disponible";
			lblEstadosHabitaciones[i] = new JLabel(textoEstado);
			lblEstadosHabitaciones[i].setBounds(posX, posY + 20, 100, 20);
			contenedor.add(lblEstadosHabitaciones[i]);
		}

		// Componente inferior: Etiqueta "Habitación a reservar:"
		lblSeleccion = new JLabel("Habitación a reservar:");
		lblSeleccion.setFont(fuenteNegrita);
		lblSeleccion.setBounds(230, 180, 140, 25);
		contenedor.add(lblSeleccion);

		// Componente inferior: JSpinner restringido con valores del 1 al 10
		SpinnerNumberModel modeloSpinner = new SpinnerNumberModel(1, 1, 10, 1);
		spnHabitacion = new JSpinner(modeloSpinner);
		spnHabitacion.setBounds(370, 180, 45, 25);
		contenedor.add(spnHabitacion);

		// Componente inferior: Botón "Aceptar"
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(460, 178, 110, 28);
		btnAceptar.addActionListener(this);
		contenedor.add(btnAceptar);
	}

	/**
	 * Gestión del evento del botón Aceptar
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnAceptar) {
			// Obtener el número de habitación seleccionado desde el Spinner
			int numeroSeleccionado = (Integer) spnHabitacion.getValue();
			
			// Validar si la habitación seleccionada ya se encuentra ocupada
			if (hotel.buscarHabitacionOcupada(numeroSeleccionado)) {
				// Mensaje de error solicitado por el enunciado si ya está ocupada
				JOptionPane.showMessageDialog(this, 
						"La habitación seleccionada ya se encuentra ocupada o no está disponible.", 
						"Error", 
						JOptionPane.ERROR_MESSAGE);
			} else {
				// Si está disponible, se abre la VentanaIngreso pasando el número y la referencia de esta ventana
				VentanaIngreso ventanaIngreso = new VentanaIngreso(hotel, numeroSeleccionado, this);
				ventanaIngreso.setVisible(true);
			}
		}
	}
}