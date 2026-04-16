package mascotas;

public class Gato extends Mascota {

    protected double altura; //altura de salto
    protected double longitud; //longitud de salto

    public Gato(String nombre, int edad, String color, double alt, double lon){
        super(nombre, edad, color);
        this.altura = alt;
        this.longitud = lon;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void sonido(){
        super.sonido();
        System.out.println("Los gatos maúllan y ronronean");
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", color=" + color + ", longitud="
                + longitud + "]";
    }
}