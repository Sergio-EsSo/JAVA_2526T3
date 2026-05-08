package peaje;

public class Camion extends Vehiculo {

	// Atributo estático que identifica el valor de peaje a pagar por un camión
	static int valorPeajeEje = 5000;
	// Atributo que identifica el número de ejes que tiene un camión
	int numeroEjes;

	/**
	 * Constructor de la clase Camión
	 * 
	 * @param placa      Parámetro que define la placa de un camión
	 * @param númeroEjes Parámetro que define el número de ejes de un camión
	 */
	Camion(String placa, int numeroEjes) {
		super(placa); // Invoca al constructor de la clase padre
		this.numeroEjes = numeroEjes;
	}

	/**
	 * Método que devuelve el valor del peaje para un camión
	 * 
	 * @return El valor del peaje para un camión
	 */
	public int getValorPeajeEje() {
		return valorPeajeEje;
	}

	/**
	 * Método que establece el valor del peaje para un camión
	 * 
	 * @param Parámetro que define el valor del peaje para un camión
	 */
	static void setValorPeajeEje(int valorEje) {
		valorPeajeEje = valorEje;
	}

	/**
	 * Método que muestra en pantalla la placa, el número de ejes y el valor del
	 * peaje de un camión
	 */
	void imprimir() {
		System.out.println("Placa = " + placa);
		System.out.println("Número de ejes = " + numeroEjes);
		System.out.println("Valor del peaje = " + valorPeajeEje);
	}

}