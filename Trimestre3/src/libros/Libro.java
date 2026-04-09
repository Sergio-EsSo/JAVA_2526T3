package libros;

public class Libro {
    
    // Atributos
    protected String titulo;
    protected String autor;
    protected double precio = 0d;

    //mejora para implementar una bibioteoocoeoaocoaocoaoaoo
    protected boolean prestado = false;

    // Constructor 
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return titulo+" de "+autor+", con precio de"+precio+"€";
    }

    // Métodos propios 

    // Prestar
    public void prestar(){
        if(prestado==false){
            System.out.println("ACABAS DE PRESTAR.....");
            System.out.println(this.toString());
            prestado = true;
        }
        else
            System.out.println("ESE LIBRO YA ESTÁ PRESTADO......");
    }

    // Devolver
    public void devolver(){
        if(prestado){
            System.out.println("NOS ACABAN DE DEVOLVER.......");
            System.out.println(this.toString());
            prestado = false;
        }
        else
            System.out.println("ESTE LIBRO NO ESTÁ PRESTADO");
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}