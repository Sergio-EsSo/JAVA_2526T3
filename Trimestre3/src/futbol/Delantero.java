package futbol;

public class Delantero extends Jugador {

    private int golesAnotados;

    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }
    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Goles anotados: "+golesAnotados);
    }
}