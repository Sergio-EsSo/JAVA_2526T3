package gui5;

import java.util.Date;

public class Huesped {

	private String nombre; /* Atributo que identifica los nombres del 	huésped */
	private String apellidos; /* Atributo que identifica los apellidos del 	huésped */
	private int documentoIdentidad; /* Atributo que identifica el número de documento de identidad del 	huésped */
	private Date fechaIngreso; /* Atributo que identifica la fecha de 	ingreso del huésped */
	private Date fechaSalida; /* Atributo que identifica la fecha de salida 	del huésped */
	
	public Huesped(String nom, String ape, int DNI) {
		this.nombre = nom;
		this.apellidos = ape;
		this.documentoIdentidad = DNI;
	}

	public void setFechaSalida(Date fecha) {
		fechaSalida = fecha;
	}
	public void setFechaIngreso(Date fecha) {
		fechaIngreso = fecha;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public int obtenerDiasAlojamiento() {
		/*
		 * Resta la fecha de ingreso de la fecha de salida utilizando el método getTime
		 */
		int dias = (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
		return dias;
	}

    @Override
    public String toString() {
        return "Huesped [nombre=" + nombre + ", apellidos=" + apellidos + ", documentoIdentidad=" + documentoIdentidad
                + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + "]";
    }
}