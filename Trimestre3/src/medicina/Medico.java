package medicina;

public class Medico {

	public String nombre; // Atributo que define el nombre de un médico

	//const	
	public Medico(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Medico "+nombre+".\n";
	}

	
	
}