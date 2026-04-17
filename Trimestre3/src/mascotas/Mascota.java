package mascotas;

public class Mascota {

    protected String nombre;
    protected int edad;
    protected String color;
    protected double precioBase = 340.0d;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Mascota(String nom, int edad, String col){
        this.nombre = nom;
        this.edad = edad;
        this.color = col;
    }

    public double calcularPrecioVenta(){
        return precioBase;
    }

    //metodos propios
    public void sonido(){
        System.out.println("Las mascotas hacen este sonido");
    }
    
}