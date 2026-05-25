package gui4;

import java.awt.Container;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaNomina extends JFrame {
	private Container contenedor;
	private JLabel empleados, nomina;
	private JTable tabla;

	/**
	 * Constructor de la ventana Nómina
	 */
	public VentanaNomina(ListaEmpleados lista) {
		inicio(lista);
		setTitle("Calcular Nómina Total");
		setSize(450, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana
		setResizable(false);
	}

	public void inicio(ListaEmpleados lista) {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		empleados = new JLabel("Lista de Empleados:");
		empleados.setBounds(20, 15, 200, 23);
		contenedor.add(empleados);

		// Títulos de las columnas de la tabla
		String[] columnas = {"Nombre", "Apellidos", "Salario Mensual"};
		
		// Obtiene la matriz con los datos procesados desde ListaEmpleados
		String[][] datos = lista.obtenerMatriz();

		// Se inicializa el modelo de la tabla de forma no editable
		DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tabla = new JTable(modelo);
		
		// Agrega barras de desplazamiento automáticas a la tabla
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(20, 45, 400, 180);
		contenedor.add(scroll);

		// Muestra el total de la nómina calculado por la lista
		// Nota: Reiniciamos la llamada para evitar la duplicación acumulativa si el atributo 'totalNomina' no se limpia
		lista.totalNomina = 0; 
		double total = lista.calcularTotalNomina();
		
		nomina = new JLabel("Total nómina mensual de la empresa: $" + String.format("%.2f", total));
		nomina.setBounds(20, 245, 400, 23);
		contenedor.add(nomina);
	}
}