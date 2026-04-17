package mascotas;

public class Grande extends Perro{

    public enum razaG{
        pastor_aleman, doberman, rottweiller
    } protected razaG tipo;

    protected double porcentaje = 0.58;

    public Grande(String nom, int edad, String col, double peso, boolean muerde, razaG tipo) {
        super(nom, edad, col, peso, muerde);
        this.tipo = tipo;
    }
    
    public razaG getTipo() {
        return tipo;
    }
    public void setTipo(razaG tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecioVenta(){
        double subtotal = super.calcularPrecioVenta()*(1+porcentaje);
        return subtotal;
    }

    @Override
    public String toString() {
        return "Grande [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + ", tipo=" + tipo + ". Precio="+ calcularPrecioVenta()+ "]";
    }   
}