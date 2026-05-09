package peaje;

public class Carro extends Vehiculo {

	// Atributo estático que identifica el valor de peaje a pagar por un carro
	static int valorPeaje = 10000;

	Carro(String placa) {
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