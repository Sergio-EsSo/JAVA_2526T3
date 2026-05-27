package gui5;

public class Habitacion {

	private int numeroHabitacion; /* Atributo que indica el número de la habitación */
	private boolean disponible; /* Atributo que indica la disponibilidad de la habitación */
	private double precioDia; /* Atributo que indica el precio por día de la habitación */
	private Huesped huesped; /* Atributo que indica el huésped que ocupa la habitación */

	public Habitacion(int numeroHabitacion, boolean disponible, double precioDia) {
		this.numeroHabitacion = numeroHabitacion;
		this.disponible = disponible;
		this.precioDia = precioDia;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}