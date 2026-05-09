package vehiculos;

public class Acuatico extends Vehiculo implements Vela {

    private String tipo; //superficie o submarino
    private int capacidad; //de pasajeros

    public Acuatico(int velAct, int velMax, String tipo, int pasajeros){
        super(velAct, velMax);
        this.tipo=tipo;
        this.capacidad=pasajeros;
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
    public void recomendarVelocidad(int velocidadViento){
        if(velocidadViento>80 || velocidadViento<10){
            System.out.println("Viento no apto.\nDeteniendo vehiculo.");
            this.velocidadActual=0;
        }
        else{
            System.out.println("Viento apto.");
        }
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: "+tipo);
        System.out.println("Capacidad de pasajeros: "+capacidad);
    }
}