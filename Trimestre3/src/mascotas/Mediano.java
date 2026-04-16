package mascotas;

public class Mediano extends Perro {

    public enum razaM{
        collie, dalmata, bulldog, galgo, sabueso
    } protected razaM tipo;

    public Mediano(String nom, int edad, String col, double peso, boolean muerde, razaM tipo) {
        super(nom, edad, col, peso, muerde);
        this.tipo = tipo;
    }
    
    public razaM getTipo() {
        return tipo;
    }
    public void setTipo(razaM tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Mediano [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + ", tipo=" + tipo + "]";
    }
}