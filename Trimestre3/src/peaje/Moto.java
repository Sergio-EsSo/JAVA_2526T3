package peaje;

public class Moto extends Vehiculo {

	// Atributo estático que identifica el valor de peaje a pagar por una moto
	static int valorPeaje = 5000;

	Moto(String placa) {
		super(placa); // Invoca al constructor de la clase padre
	}

	public int getValorPeaje() {
		return valorPeaje;
	}

	static void setValorPeaje(int valor) {
		valorPeaje = valor;
	}

	void imprimir() {
	System.out.println("Placa = " + placa);
	System.out.println("Valor del peaje = " + valorPeaje);
	}
}