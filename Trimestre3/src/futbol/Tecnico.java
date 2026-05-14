package futbol;

public class Tecnico extends Persona {

    protected int annosExperiencia;
    protected boolean esExtranjero;

    public Tecnico(String nombre, String apellidos, int edad, int annosExp, boolean esExt) {
        super(nombre, apellidos, edad);
        this.annosExperiencia = annosExp;
        this.esExtranjero = esExt;
    }

    public int getAnnosExperiencia() {
        return annosExperiencia;
    }
    public void setAnnosExperiencia(int annosExperiencia) {
        this.annosExperiencia = annosExperiencia;
    }
    public boolean isExtranjero() {
        return esExtranjero;
    }
    public void setExtranjero(boolean esExtranjero) {
        this.esExtranjero = esExtranjero;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Años de experiencia: "+annosExperiencia);
        System.out.println("Extranjero: "+esExtranjero);
    }
}