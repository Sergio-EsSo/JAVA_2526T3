package municipal;

public class Libro {

	String titulo; // Atributo que identifica el título de un libro
	String autor; // Atributo que identifica el autor de un libro
	int anoPublicacion; /* Atributo que identifica el año de publicación de un libro */
	String editorial; // Atributo que identifica la editorial que publicó el libro
	String ISBN; /* Atributo que identifica la referencia bibligráfica del libro */

	Libro(String titulo, String autor, int anoPublicacion, String editorial, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.ISBN = isbn;
	}

	void imprimir() {
		System.out.println("Título del libro = " + titulo);
		System.out.println("Autor = " + autor);
		System.out.println("Año de publicación = " + anoPublicacion);
		System.out.println("Editorial = " + editorial);
		System.out.println("ISBN = " + ISBN);
		System.out.println();
	}
}