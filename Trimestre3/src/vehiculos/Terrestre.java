package vehiculos;

public class Terrestre extends Vehiculo implements Motor {

    private int cantidadLlantas;
    private String uso; //militar o civil

    public Terrestre(int velAct, int velMax, int cantidadLlantas, String uso) {
        super(velAct, velMax);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    @Override
    public void acelerar(int inc){
        velocidadActual = Math.min(velocidadActual+inc, velocidadMaxima); //asi no se pasa
    }

    @Override
    public void frenar(int dec){
        velocidadActual = Math.max(velocidadActual-dec, 0); //asi no es negativo
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de llantas: "+cantidadLlantas);
        System.out.println("Uso: "+uso);
    }
}