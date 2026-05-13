package compoCarro;

public class Carro {
	
	Motor motor; // Atributo que identifica el motor de un automóvil
	Chasis chasis; // Atributo que identifica el chasis de un automóvilRelaciones de asociación, agregación y composición 335
	Llanta[] llantas; /* Atributo que identifica las llantas de un automóvil como un array */
	Carroceria carroceria; // Atributo que identifica la carrocería de un 	automóvil
	
	public Carro(int volumen, tipoChasis claseChasis, String color, 
			tipoCarroceria claseCarroceria, String marca, int diametro, int altura, int anchura) {
	
		motor = new Motor(volumen); // Crea el motor de un automóvil
		chasis = new Chasis(claseChasis); // Crea el chasis de un automóvil
		llantas = new Llanta[4]; // Crea un array de 4 llantas
			for (int i = 0; i < llantas.length; i++) {
				// Crea cada una de las cuatro llantas de un automóvil
				llantas[i] = new Llanta(marca,diametro,altura,anchura);
			}
			carroceria = new Carroceria(color,claseCarroceria); /* Crea la 	carrocería de un automóvil */
	}
	/**
	* Método que muestra en pantalla los datos de un automóvil y sus
	* diferentes componentes
	*/
	void imprimir() {
	System.out.println("Datos del Carro");
	System.out.println("Motor - Cilindros = " + motor.volumen);
	System.out.println("Chasis - Tipo = " + chasis.tipo);
	System.out.println("Carrocería - Tipo = " + carroceria.tipo + "	Color = " + carroceria.color);
	System.out.println("Llantas - Cantidad = " + llantas.length);
	for (int i = 0; i < llantas.length; i++)
		llantas[i].imprimir(); // Imprime los datos de cada llanta
	}
}