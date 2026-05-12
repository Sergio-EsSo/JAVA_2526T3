package municipal;

public class testBiblioteca {

    public static void main(String[] args) {
        
        Libro cien = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Sudamericana", "858.67/M566");
        Libro ray = new Libro("Rayuela", "Julio Cortázar", 1963, "Sudamericana", "863.55/J667");
        Libro jul = new Libro("La tía Julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");
        //mucho 67 suelto por aqui
        Biblioteca choza = new Biblioteca("La Choza del Libro");

        choza.anadirLibro(cien);
        choza.anadirLibro(ray);
        choza.anadirLibro(jul);

        choza.listarLibros();
    }
}