package bucle;

import java.util.Random;

public class ContraRelojista extends Ciclista {

	// Atributo que define la velocidad máxima de un contrarrelojista
	private double velocidadMaxima;
	
	public ContraRelojista(int dorsal, String nombre, double velocidadMaxima) {
		super(dorsal, nombre);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	protected double getVelocidadMáxima() {
	return velocidadMaxima;
	}
	protected void setVelocidadMáxima(double velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
	}
	protected void imprimir() {
		super.imprimir(); // Invoca el método imprimir de la clase padre
		System.out.println("Velocidad MAXIMA = " + 	velocidadMaxima);
	}
	protected String imprimirTipo() {
		return "Es un constraRelojista";
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