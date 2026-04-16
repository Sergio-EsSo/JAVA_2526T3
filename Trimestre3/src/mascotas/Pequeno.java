package mascotas;

public class Pequeno extends Perro {

    public enum razaP{
        caniche, yorkshire, terrier, schnauzer, chihuahua
    } protected razaP tipo;

    public Pequeno(String nom, int edad, String col, double peso, boolean muerde, razaP tipo) {
        super(nom, edad, col, peso, muerde);
        this.tipo = tipo;
    }

    public razaP getTipo() {
        return tipo;
    }
    public void setTipo(razaP tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pequeno [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + ", tipo=" + tipo + "]";
    }
}