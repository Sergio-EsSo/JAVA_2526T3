package universidad;

public class Persona {

    protected String nombre;
    protected String direccion;

    public Persona(String nom, String dir){
        this.nombre = nom;
        this.direccion = dir;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String dir){
        this.direccion = dir;
    }
    @Override
    public String toString(){
        return "Sr/Sra. "+nombre+", con dirección: "+direccion;
    }
}