package mascotas;

public class Mascota {

    protected String nombre;
    protected int edad;
    protected String color;

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

    //metodos propios
    public void sonido(){
        System.out.println("Las mascotas hacen este sonido");
    }
    
}