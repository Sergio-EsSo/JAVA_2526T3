package universidad;

public class TestUP {

    public static void main(String[] args) {
        
        // estudiantes
        Estudiante est1 = new Estudiante("Ana García", "Calle Mayor 10", "Ingeniería de Software", 4);
        Estudiante est2 = new Estudiante("Luis Pérez", "Avenida Libertad 5", "Medicina", 2);

        // profesores
        Profesor prof1 = new Profesor("Dr. Roberto Gómez", "Paseo del Prado 22", "Matemáticas", "Titular");
        Profesor prof2 = new Profesor("Dra. Marta Ruiz", "Calle Roble 45", "Sistemas Informáticos", "Asociado");

        // mostrar
        if(est1 instanceof Estudiante){
            System.out.println(est1+"\n");
        }
        if(est2 instanceof Estudiante){
            System.out.println(est2+"\n");
        }
        if(prof1 instanceof Profesor){
            System.out.println(prof1+"\n");
        }
        if(prof2 instanceof Profesor){
            System.out.println(prof2+"\n");
        }
    }
}