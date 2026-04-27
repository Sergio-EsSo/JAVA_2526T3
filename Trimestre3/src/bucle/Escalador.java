package bucle;

import java.util.Random;

public class Escalador extends Ciclista {

	private double aceleracionPromedio;
	private double gradoRampa;

	public Escalador(int dorsal, String nombre, double aceleraciónPromedio, double gradoRampa) {
		super(dorsal, nombre);
		this.aceleracionPromedio = aceleraciónPromedio;
		this.gradoRampa = gradoRampa;
	}

	protected double getAceleraciónPromedio() {
		return aceleracionPromedio;
	}
	protected void setAceleraciónPromedio(double aceleraciónPromedio) {
		this.aceleracionPromedio = aceleraciónPromedio;
	}
	protected double getGradoRampa() {
		return gradoRampa;
	}
	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	protected void imprimir() {
		super.imprimir(); // Invoca el método imprimir de la clase padre
		System.out.println("Aceleración promedio = " + aceleracionPromedio);
		System.out.println("Grado de rampa = " + gradoRampa);
	}

	protected String imprimirTipo() {
		return "Es un escalador";
	}

	@Override
    public void correrEtapa(int tiempoMin, int tiempoMax){
        Random rn = new Random();

        //Generamos un numero aleatorio entre el mínimo y el máximo inclusive
        //formula: rn.nextInt((max-min)+1)+min
        int tiempoEtapa = rn.nextInt((tiempoMax-tiempoMin)+1)+tiempoMin;

        this.tiempo=tiempoEtapa;
        this.tiempoAcumulado+=tiempoEtapa;

        System.out.println(nombre+" ha terminado la etapa en "+tiempoEtapa+" segundos.");
    }
}