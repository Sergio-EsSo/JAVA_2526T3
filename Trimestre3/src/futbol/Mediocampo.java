package futbol;

public class Mediocampo extends Jugador {

    private int asistencias;

    public Mediocampo(String nombre, String apellidos, int edad, boolean esTitular, int asistencias) {
        super(nombre, apellidos, edad, esTitular);
        this.asistencias = asistencias;
    }

    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Asistencias: "+asistencias);
    }
}