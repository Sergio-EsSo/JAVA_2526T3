package gui1;

import java.io.Serializable;

public class Persona implements Serializable {
	
	String nombre; // Atributo que identifica el nombre de una persona
	String apellidos; /* Atributo que identifica los apellidos de una persona */
	String telefono; // Atributo que identifica el teléfono de una persona
	String direccion; /* Atributo que identifica la dirección de una persona */

	public Persona(String nombre, String apellidos, String telefono, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
	}
}