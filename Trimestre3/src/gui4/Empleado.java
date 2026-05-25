package gui4;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double salarioDia; 
	private double otrosIngresos; 
	private double pagosSalud; 
	private double aportePensiones; 
	private int diasTrabajados;
	private TipoCargo cargo; 
	private TipoGenero genero; 

	/**
	 * Constructor de la clase Empleado
	 * 
	 * @param nombre          Parámetro que define el nombre de un empleado
	 * @param apellidos       Parámetro que define los apellidos de un empleado
	 * @param cargo           Parámetro que define el cargo de un empleado
	 * @param género          Parámetro que define el género de un empleado
	 * @param salarioDía      Parámetro que define el salario por día de un empleado
	 * @param díasTrabajados  Parámetro que define la cantidad de días trabajados de
	 *                        un empleado
	 * @param pagosSalud      Parámetro que define los pagos por salud de un
	 *                        empleado
	 * @param aportePensiones Parámetro que define el aporte de pensiones de un
	 *                        empleado
	 */
	public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGenero genero, double salarioDia, 
		int diasTrabajados, double otrosIngresos, double pagosSalud, double aportePensiones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.genero = genero;
		this.salarioDia = salarioDia;
		this.diasTrabajados = diasTrabajados;
		this.otrosIngresos = otrosIngresos;
		this.pagosSalud = pagosSalud;
		this.aportePensiones = aportePensiones;
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public TipoCargo getCargo() {
		return cargo;
	}
	public TipoGenero getGenero() {
		return genero;
	}
	public double getSalarioDia() {
		return salarioDia;
	}
	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	public double getOtrosIngresos() {
		return otrosIngresos;
	}
	public double getPagosSalud() {
		return pagosSalud;
	}
	public double getAportePensiones() {
		return aportePensiones;
	}

	/**
	 * Método que calcula el salario mensual de un empleado
	 * @return Salario mensual de un empleado
	 */
	public double calcularNomina() {
		return ((salarioDia * diasTrabajados) + otrosIngresos - pagosSalud - aportePensiones);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", salarioDia=" + salarioDia
				+ ", otrosIngresos=" + otrosIngresos + ", pagosSalud=" + pagosSalud + ", aportePensiones="
				+ aportePensiones + ", diasTrabajados=" + diasTrabajados + ", cargo=" + cargo + ", genero=" + genero
				+ "]";
	}	
}