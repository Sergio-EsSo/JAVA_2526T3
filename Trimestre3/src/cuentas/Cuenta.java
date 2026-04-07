package cuentas;

public class Cuenta {

	private float saldo;
	private int numeroConsignaciones = 0;
	private int numeroRetiros = 0;
	private float tasaAnual; // en porcentaje
	
	/* Atributo que define la comisión mensual que se cobra a una cuenta bancaria */
	protected float comisionMensual = 0;	
	
	/*
	 * La clase Cuenta tiene un constructor que inicializa los atributos saldo y
	 * tasa anual con valores pasados como parámetros.
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public void consignar(float cantidad) {
		saldo = saldo + cantidad;
		/* Se actualiza el saldo con la cantidad consignada */
		// Se actualiza el número de consignaciones realizadas en la cuenta
		numeroConsignaciones = numeroConsignaciones + 1;
	}

	public void retirar(float cantidad) {
		float nuevoSaldo = saldo - cantidad;
		/* Si la cantidad a retirar no supera el saldo, el retiro no se puede realizar
		 */
		if (nuevoSaldo >= 0) {
			saldo -= cantidad;
			numeroRetiros = numeroRetiros + 1;
		} else {
			System.out.println("la cantidad a retirar excede el saldo actual.");
		}
	}
	public void calcularInteres() {
		float tasaMensual = tasaAnual / 12; 
		/* Convierte la tasa anual en mensual */
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual; /* Actualiza el saldo aplicando el interés mensual */
	}

	/**
	 * Método que genera un extracto aplicando al saldo actual una comisión y
	 * calculando sus intereses
	 */
	public void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
	}

	
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	// Imprimir: muestra en pantalla los valores de los atributos.
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
				+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comision=" + comisionMensual + "]";
	}

}