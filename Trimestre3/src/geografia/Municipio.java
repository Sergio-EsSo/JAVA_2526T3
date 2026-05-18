package geografia;

public class Municipio {
	
	private String nombre;
	private int población;
	private double temperaturaMedia;
	private double altitud;

	public Municipio(String nombre, int población, double
	temperaturaMedia, double altitud) {
		this.nombre = nombre;
		this.población = población;
		this.temperaturaMedia = temperaturaMedia;
		this.altitud = altitud;
	}

	public String getNombre() {
		return nombre;
	}

	/*private void setNombre(String nombre) {
		this.nombre = nombre;
	}*/

	public int getPoblación() {
		return población;
	}
	
	/*private void setPoblación(int población) {
		this.población = población;
	}*/

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	/*private void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}*/

	public double getAltitud() {
		return altitud;
	}

	/*private void setAltitud(double altitud) {
		this.altitud = altitud;
	}*/

	public void imprimir() {
		System.out.println("Nombre = " + getNombre());
		System.out.println("Población = " + getPoblación());
		System.out.println("Temperatura promedio = " + getTemperaturaMedia()+"ºC");
		System.out.println("Altitud = " + getAltitud()+"m");
	}
}