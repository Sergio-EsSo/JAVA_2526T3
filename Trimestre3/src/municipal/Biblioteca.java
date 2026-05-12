package municipal;

import java.util.ArrayList;

 //OJO CON ECLIPSEEEEEEE

public class Biblioteca {

	// Atributo que identifica el nombre de la biblioteca
	String nombre;
	/*
	 * Atributo que identifica la colección de libros de la biblioteca como un
	 * vector de libros
	 */
	ArrayList<Libro> coleccionLibros;

	Biblioteca(String nombre) {
		this.nombre = nombre;
		coleccionLibros = new ArrayList<Libro>(); // Crea el vector de libros
	}
	void anadirLibro(Libro libro) {
		coleccionLibros.add(libro); 
	}

	void listarLibros() {
		// Se recorre el vector de libros
		for (int i = 0; i < coleccionLibros.size(); i++) {
			/*
			 * Se extrae un elemento del vector en la posición i. Se debe realizar un
			 * casting para extraer un objeto Libro
			 */
			Libro libro = (Libro) coleccionLibros.get(i);
			libro.imprimir();
		}
	}
}