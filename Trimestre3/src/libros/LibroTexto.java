package libros;

public class LibroTexto extends Libro{
    protected int curso;

    // Constructor
    public LibroTexto(String t, String a, int c) {
        super(t, a);
        this.curso = c;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        String papa = super.toString();
        return "Libro texto\n"+ papa + "\nCurso: " + curso;
    }
}