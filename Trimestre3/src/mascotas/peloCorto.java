package mascotas;

public class peloCorto extends Gato {

    public enum peloC{
        azul_ruso, britanico, manx, devon_rex
    } protected peloC raza;

    protected double porcentaje = 0.3;

    public peloCorto(String nombre, int edad, String color, double alt, double lon, peloC raza) {
        super(nombre, edad, color, alt, lon);
        this.raza = raza;
    }

    public peloC getRaza() {
        return raza;
    }
    public void setRaza(peloC raza) {
        this.raza = raza;
    }

    @Override
    public double calcularPrecioVenta(){
        return super.calcularPrecioVenta()*(1+porcentaje);
    }

    @Override
    public String toString() {
        return "peloCorto [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", color=" + color
                + ", longitud=" + longitud + ", raza=" + raza + ". Precio="+ calcularPrecioVenta()+ "]";
    }
}