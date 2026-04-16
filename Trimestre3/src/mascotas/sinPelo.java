package mascotas;

public class sinPelo extends Gato {

    public enum razaSP{
        esfinge, elfo, donskoy
    } protected razaSP raza;

    public sinPelo(String nombre, int edad, String color, double alt, double lon, razaSP raza) {
        super(nombre, edad, color, alt, lon);
        this.raza = raza;
    }

    public razaSP getRaza() {
        return raza;
    }
    public void setRaza(razaSP raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "sinPelo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", color=" + color
                + ", longitud=" + longitud + ", raza=" + raza + "]";
    }
}