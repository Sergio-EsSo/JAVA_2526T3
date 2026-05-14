package futbol;

public class Portero extends Jugador {

    private int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellidos, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }    

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Goles recibidos: "+golesRecibidos);
    }
}