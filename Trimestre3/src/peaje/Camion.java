package peaje;

public class Camion extends Vehiculo {

	// Atributo estático que identifica el valor de peaje a pagar por un camión
	static int valorPeajeEje = 5000;
	// Atributo que identifica el número de ejes que tiene un camión
	int numeroEjes;

	Camion(String placa, int numeroEjes) {
		super(placa); // Invoca al constructor de la clase padre
		this.numeroEjes = numeroEjes;
	}

	public int getValorPeajeEje() {
		return valorPeajeEje;
	}
	static void setValorPeajeEje(int valorEje) {
		valorPeajeEje = valorEje;
	}
	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	

	void imprimir() {
		System.out.println("Placa = " + placa);
		System.out.println("Número de ejes = " + numeroEjes);
		System.out.println("Valor del peaje = " + valorPeajeEje);
	}
}