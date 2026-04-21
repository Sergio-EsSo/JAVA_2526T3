package mundial;

public class SeleccionFutbol {

    // atributos
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    // constructor, getter, setter
    public SeleccionFutbol(int id, String nom, String ape, int edad) {
        this.id = id;
        this.nombre = nom;
        this.apellidos = ape;
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos propios
    public void Concentrarse(){
        System.out.println("El objeto se está concentrando...");
    }
    public void Viajar(){
        System.out.println("El objeto está viajando...");
    }

    @Override
    public String toString(){
        return "\n_"+id+"\n"+nombre+" "+apellidos+"\nEdad: "+edad;
    }
}