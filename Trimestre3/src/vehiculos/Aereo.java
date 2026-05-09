package vehiculos;

public class Aereo extends Vehiculo implements Reactor, Alas {

    public Aereo(int velAct, int velMax){
        super(velAct, velMax);
    }

    //metodos
    public void despegar(){
        System.out.println("Despegando...");
    }
    public void volar(){
        System.out.println("Volando voy...\n\n\n...Volando vengo.");
    }
    public void aterrizar(){
        System.out.println("Aterrizando...");
    }

    //interfaces
    public void encender(){
        System.out.println("Reactor ENCENDIDO");
    }
    public void apagar(){
        System.out.println("Reactor APAGADO");
    }
    public void soltarTrenAterrizaje(){
        System.out.println("Soltando tren de aterrizaje");
    }
    public void subirTrenAterrizaje(){
        System.out.println("Subiendo tren de aterrizaje");
    }

    @Override
    public void acelerar(int inc){
        velocidadActual = Math.min(velocidadActual+inc, velocidadMaxima); //asi no se pasa
    }

    @Override
    public void frenar(int dec){
        velocidadActual = Math.max(velocidadActual-dec, 0); //asi no es negativo
    }

    /*@Override
    public void imprimir(){
        super.imprimir();
    }*/
   //no me hace falta porque no tengo atributos propios de esta clase
   //como tengo en vehiculo terrestre y acuatico
}
