package futbol;

public class Jugador extends Persona {

    protected boolean esTitular;

    public Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }

    public boolean isEsTitular() {
        return esTitular;
    }
    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        if(esTitular)
            System.out.println("Titular");
    }
}