package vehiculos;

public class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velAct, int velMax){
        this.velocidadActual=velAct;
        this.velocidadMaxima=velMax;
    }

    public void imprimir(){
        System.out.println();
    }

    

}
