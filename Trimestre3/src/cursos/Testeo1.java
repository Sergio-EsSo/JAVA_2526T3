package cursos;

public class Testeo1 {

    public static void main(String[] args) {
        
        Asignatura asignatura = new Asignatura(4698234, "POO", 4);

        asignatura.escribirAsignatura();
        asignatura.leerAsignatura();
    }
}