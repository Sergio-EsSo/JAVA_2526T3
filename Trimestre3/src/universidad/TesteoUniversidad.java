package universidad;

public class TesteoUniversidad {

    public static void main(String[] args) {
        
        // estudiantes
        Estudiante est1 = new Estudiante("Ana García", "Calle Mayor 10", "Ingeniería de Software", 4);
        Estudiante est2 = new Estudiante("Luis Pérez", "Avenida Libertad 5", "Medicina", 2);

        // profesores
        Profesor prof1 = new Profesor("Dr. Roberto Gómez", "Paseo del Prado 22", "Matemáticas", "Titular");
        Profesor prof2 = new Profesor("Dra. Marta Ruiz", "Calle Roble 45", "Sistemas Informáticos", "Asociado");

        // mostrar
        System.out.println(est1);
        System.out.println(est2);
        System.out.println(prof1);
        System.out.println(prof2);
    }
}