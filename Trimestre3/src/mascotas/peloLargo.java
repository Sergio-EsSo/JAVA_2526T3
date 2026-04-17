package mascotas;

public class peloLargo extends Gato {

    public enum peloL{
        angora, himalayo, balines, somali
    } protected peloL raza;

    protected double porcentaje = 0.38;

    public peloL getRaza() {
        return raza;
    }
    public void setRaza(peloL raza) {
        this.raza = raza;
    }

    public peloLargo(String nombre, int edad, String color, double alt, double lon, peloL raza) {
        super(nombre, edad, color, alt, lon);
        this.raza = raza;
    }

    @Override
    public double calcularPrecioVenta(){
        return super.calcularPrecioVenta()*(1+porcentaje);
    }

    @Override
    public String toString() {
        return "peloLargo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", color=" + color
                + ", longitud=" + longitud + ", raza=" + raza + ". Precio="+ calcularPrecioVenta()+ "]";
    }   
}