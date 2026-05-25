package gui4;

import java.util.ArrayList;

public class ListaEmpleados {

	public ArrayList<Empleado> lista; // Atributo que identifica un vector de empleados
	public double totalNomina = 0; /* Atributo que identifica el total de la nómina de la empresa */

	public ListaEmpleados() {
		lista = new ArrayList<Empleado>(); // Crea el vector de empleados
	}

	public void agregarEmpleado(Empleado a) {
		lista.add(a);
	}

	/**
	 * Método que calcula la nómina total mensual de la empresa
	 * 
	 * @return La nómina total mensual de la empresa
	 */

	public double calcularTotalNomina() {
		for (int i = 0; i < lista.size(); i++) { /* Recorre el vector de empleados */
			// Obtiene un elemento de la lista de empleados
			Empleado e = (Empleado) lista.get(i);
			// Calcula el salario de un empleado y lo totaliza
			totalNomina = totalNomina + e.calcularNomina();
		}
		return totalNomina;
	}

	/**
	* Método que convierte los datos de la lista de empleados en una matriz
	*/
	public String[][] obtenerMatriz() {
		String datos[][] = new String[lista.size()][3]; // Se crea la matriz 
		for (int i = 0; i < lista.size(); i++) { // Recorre el vector de empleados
		Empleado e = (Empleado) lista.get(i); // Obtiene un elemento de la lista de empleados
		/* Coloca el nombre del empleado en la primera columna de 	la matriz */
		datos[i][0] = e.getNombre();
		/* Coloca los apellidos del empleado en la segunda columna 	de la matriz */
		datos[i][1] = e.getApellidos();
		/* Coloca el salario del empleado en la tercera columna de la 	matriz */
		datos[i][2] = Double.toString(e.calcularNomina());
		}
		return datos;
	}

/**
* Método que convierte los datos de la lista de empleados a texto
*/
	public String convertirTexto() {
	    StringBuilder texto = new StringBuilder();

	    // Recorre la lista de empleados
	    for (int i = 0; i < lista.size(); i++) {
	        // Obtiene un elemento de la lista de empleados
	        Empleado e = (Empleado) lista.get(i);

	        // Concatena en el StringBuilder los datos de un empleado
	        texto.append("Nombre = ").append(e.getNombre()).append("\n")
	             .append("Apellidos = ").append(e.getApellidos()).append("\n")
	             .append("Cargo = ").append(e.getCargo()).append("\n")
	             .append("Género = ").append(e.getGenero()).append("\n")
	             .append("Salario = $").append(e.getSalarioDia()).append("\n")
	             .append("Días trabajados = ").append(e.getDiasTrabajados()).append("\n")
	             .append("Otros ingresos = $").append(e.getOtrosIngresos()).append("\n")
	             .append("Pagos salud = $").append(e.getPagosSalud()).append("\n")
	             .append("Aportes pensiones = $").append(e.getAportePensiones()).append("\n")
	             .append("---------\n");
	    }

	    // Concatena el total de la nómina al final
	    texto.append("Total nómina = $").append(String.format("%.2f", calcularTotalNomina()));

	    return texto.toString();
	}
}