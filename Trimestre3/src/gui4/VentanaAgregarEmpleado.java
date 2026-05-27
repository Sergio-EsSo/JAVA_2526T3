package gui4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaAgregarEmpleado extends JFrame implements ActionListener {
	private Container contenedor;
	private ListaEmpleados lista;
	
	// Etiquetas (JLabels)
	private JLabel nombre, apellidos, cargo, salarioDia, numeroDias, genero, otrosIngresos, aportesSalud, pensiones;
	
	// Campos de texto y componentes de captura
	private JTextField campoNombre, campoApellidos, campoSalarioDia, campoOtrosIngresos, campoAportesSalud, campoPensiones;
	private ButtonGroup grupoGenero;
	private JRadioButton masculino, femenino;
	private JComboBox<TipoCargo> campoCargo;
	private JSpinner campoNumeroDias;
	private SpinnerNumberModel modeloSpinner;
	
	// Botones
	private JButton agregar, limpiar;

	/**
	 * Constructor de la ventana Agregar Empleado
	 */
	public VentanaAgregarEmpleado(ListaEmpleados lista) {
		this.lista = lista;
		inicio();
		setTitle("Agregar Empleado");
		setSize(320, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana, no la principal
		setResizable(false);
	}

	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		// Inicialización de etiquetas y campos

		//NOMBRE
		nombre = new JLabel("Nombre:");
		nombre.setBounds(20, 20, 100, 23);
		campoNombre = new JTextField();
		campoNombre.setBounds(140, 20, 140, 23);
		contenedor.add(nombre);
		contenedor.add(campoNombre);

		//APELLIDOS
		apellidos = new JLabel("Apellidos:");
		apellidos.setBounds(20, 50, 100, 23);
		campoApellidos = new JTextField();
		campoApellidos.setBounds(140, 50, 140, 23);
		contenedor.add(apellidos);
		contenedor.add(campoApellidos);

		//CARGO
		cargo = new JLabel("Cargo:");
		cargo.setBounds(20, 80, 100, 23);
		campoCargo = new JComboBox<>(TipoCargo.values());
		campoCargo.setBounds(140, 80, 140, 23);
		contenedor.add(cargo);
		contenedor.add(campoCargo);

		//GENERO
		genero = new JLabel("Género:");
		genero.setBounds(20, 110, 100, 23);

		masculino = new JRadioButton("Masculino", true);
		masculino.setBounds(140, 110, 140, 23);

		femenino = new JRadioButton("Femenino");
		femenino.setBounds(140, 135, 140, 23);

		grupoGenero = new ButtonGroup();
		grupoGenero.add(masculino);
		grupoGenero.add(femenino);
		contenedor.add(genero);
		contenedor.add(masculino);
		contenedor.add(femenino);

		//SALARIO
		salarioDia = new JLabel("Salario por día:");
		salarioDia.setBounds(20, 165, 100, 23);
		campoSalarioDia = new JTextField();
		campoSalarioDia.setBounds(140, 165, 140, 23);
		contenedor.add(salarioDia);
		contenedor.add(campoSalarioDia);

		//DIAS TRABAJDOS
		numeroDias = new JLabel("Días trabajados al mes:");
		numeroDias.setBounds(20, 195, 130, 23);
		modeloSpinner = new SpinnerNumberModel(30, 1, 30, 1); // Valor inicial 30, min 1, max 30, paso 1
		campoNumeroDias = new JSpinner(modeloSpinner);
		campoNumeroDias.setBounds(160, 195, 120, 23);
		contenedor.add(numeroDias);
		contenedor.add(campoNumeroDias);

		//PLUS Y EXTRAS
		otrosIngresos = new JLabel("Otros ingresos:");
		otrosIngresos.setBounds(20, 225, 100, 23);
		campoOtrosIngresos = new JTextField();
		campoOtrosIngresos.setBounds(140, 225, 140, 23);
		contenedor.add(otrosIngresos);
		contenedor.add(campoOtrosIngresos);

		//APORTES DE SALUD
		aportesSalud = new JLabel("Pagos por salud:");
		aportesSalud.setBounds(20, 255, 100, 23);
		campoAportesSalud = new JTextField();
		campoAportesSalud.setBounds(140, 255, 140, 23);
		contenedor.add(aportesSalud);
		contenedor.add(campoAportesSalud);

		//PENSIONES
		pensiones = new JLabel("Aportes pensiones:");
		pensiones.setBounds(20, 285, 120, 23);
		campoPensiones = new JTextField();
		campoPensiones.setBounds(140, 285, 140, 23);
		contenedor.add(pensiones);
		contenedor.add(campoPensiones);

		// Botones
		agregar = new JButton("Agregar");
		agregar.setBounds(40, 340, 100, 23);
		agregar.addActionListener(this);
		contenedor.add(agregar);

		limpiar = new JButton("Borrar"); // Siguiendo el texto visual de la captura "Borrar"
		limpiar.setBounds(160, 340, 100, 23);
		limpiar.addActionListener(this);
		contenedor.add(limpiar);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == agregar) {
			try {
				// Captura de datos de los campos de la interfaz
				String nom = campoNombre.getText();
				String ape = campoApellidos.getText();
				TipoCargo carg = (TipoCargo) campoCargo.getSelectedItem();
				TipoGenero gen = masculino.isSelected() ? TipoGenero.MASCULINO : TipoGenero.FEMENINO;
				
				double salDia = Double.parseDouble(campoSalarioDia.getText());
				int dias = (int) campoNumeroDias.getValue();
				double otros = Double.parseDouble(campoOtrosIngresos.getText());
				double salud = Double.parseDouble(campoAportesSalud.getText());
				double pens = Double.parseDouble(campoPensiones.getText());

				// Instanciación y agregación del nuevo empleado
				Empleado nuevo = new Empleado(nom, ape, carg, gen, salDia, dias, otros, salud, pens);
				lista.agregarEmpleado(nuevo);

				JOptionPane.showMessageDialog(this, "Empleado agregado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				limpiarCampos();
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Error: Verifique que los campos numéricos contengan valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		if (evento.getSource() == limpiar) {
			limpiarCampos();
		}
	}

	public void limpiarCampos() {
		campoNombre.setText("");
		campoApellidos.setText("");
		campoCargo.setSelectedIndex(0);
		masculino.setSelected(true);
		campoSalarioDia.setText("");
		campoNumeroDias.setValue(30);
		campoOtrosIngresos.setText("");
		campoAportesSalud.setText("");
		campoPensiones.setText("");
	}
}