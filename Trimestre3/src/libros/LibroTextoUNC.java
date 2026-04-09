package libros;

public class LibroTextoUNC extends Libro {

    protected String facultad;
    protected int curso;

    public LibroTextoUNC(String titulo, String autor, int curso, String facultad){
        super(titulo, autor);
        this.facultad = facultad;
        this.curso = curso;
    }

    public String getFacultad(){
        return this.facultad;
    }
    public void setFacultad(String fac){
        this.facultad = fac;
    }

    @Override
    public String toString(){
        return titulo+" de "+autor+" para la "+facultad+" del curso "+curso;
    }

}
