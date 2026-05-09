package vehiculos;

abstract class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velAct, int velMax){
        this.velocidadActual=velAct;
        this.velocidadMaxima=velMax;
    }

    public void imprimir(){
        System.out.println("Velocidad actual: "+velocidadActual+"km/h");
        System.out.println("Velocidad máxima: "+velocidadMaxima+"km/h");
    }

    public abstract void acelerar(int incremento);
    public abstract void frenar(int decremento);
}