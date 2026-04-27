package bucle;

import java.util.Random;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int dor, String nom, double pot, double vel){
        super(dor, nom);
        this.potenciaPromedio = pot;
        this.velocidadPromedio = vel;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio: "+potenciaPromedio);
        System.out.println("Velocidad promedio: "+velocidadPromedio);
    }

    protected String imprimirTipo(){
        return "Es velocista\n";
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
