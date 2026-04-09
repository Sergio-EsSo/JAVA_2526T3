package libros;

public class Libro {
    
    // Atributos
    protected String titulo;
    protected String autor;
    protected double precio = 0d;

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

    // Devolver
    
}