package cursos;

public class Testo2 {
    public static void main(String[] args) {
        // 1. Creamos el gestor auxiliar
        GestorAsignaturas gestor = new GestorAsignaturas();

        // 2. Creamos algunas asignaturas de prueba y las añadimos
        Asignatura asig1 = new Asignatura(101, "Programación Java", 6);
        Asignatura asig2 = new Asignatura(102, "Bases de Datos", 5);
        Asignatura asig3 = new Asignatura(103, "Desarrollo Web", 4);

        gestor.agregarAsignatura(asig1);
        gestor.agregarAsignatura(asig2);
        gestor.agregarAsignatura(asig3);

        // 3. Guardamos la colección en el archivo "coleccion.dat"
        System.out.println("Guardando asignaturas...");
        gestor.guardarColeccion();

        System.out.println("\n====================================\n");

        // 4. Creamos un NUEVO gestor para simular que la memoria se limpió
        GestorAsignaturas nuevoGestor = new GestorAsignaturas();
        
        // 5. Leemos el archivo desde el nuevo gestor
        System.out.println("Leyendo asignaturas desde el archivo...");
        nuevoGestor.leerColeccion();
    }
}