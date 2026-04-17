package mascotas;

public class Pequeno extends Perro {

    public enum razaP{
        caniche, yorkshire, terrier, schnauzer, chihuahua
    } protected razaP tipo;

    protected double porcentaje = 0.18;

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
    public double calcularPrecioVenta(){
        return super.calcularPrecioVenta()*(1+porcentaje);
    }

    @Override
    public String toString() {
        return "Pequeno [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + ", tipo=" + tipo + ". Precio="+ calcularPrecioVenta()+ "]";
    }
}