package compoCarro;

public class Llanta {
	
	String marca; // Atributo que identifica la marca de una llanta
	int diametroRin; // Atributo que identifica el diámetro del rin de una llanta
	int altura; // Atributo que identifica la altura de una llanta
	int anchura; // Atributo que identifica la anchura de una llanta
	
	Llanta(String marca, int diametroRin, int altura, int anchura) {
		this.marca = marca;
		this.diametroRin = diametroRin;
		this.altura = altura;
		this.anchura = anchura;
	}
    
	void imprimir() {
	System.out.println("Marca = " + marca);
	System.out.println("Diámetro del rin = " + diametroRin);
	System.out.println("Altura = " + altura);
	System.out.println("Anchura = " + anchura);
	}
}