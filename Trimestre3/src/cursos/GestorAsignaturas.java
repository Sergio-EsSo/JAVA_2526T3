package cursos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GestorAsignaturas {

    private List<Asignatura> listaAsignaturas;
    private final String NOMBRE_ARCHIVO = "coleccion.dat";

    // Constructor: Inicializa la lista vacía
    public GestorAsignaturas() {
        this.listaAsignaturas = new ArrayList<>();
    }

    // Método para añadir asignaturas a la lista en memoria
    public void agregarAsignatura(Asignatura asignatura) {
        this.listaAsignaturas.add(asignatura);
    }

    // Método para obtener la lista actual
    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    // --- OPERACIONES DE ARCHIVO ---

    /**
     * Guarda la lista completa de asignaturas en "coleccion.dat"
     */
    public void guardarColeccion() {
        try {
            FileOutputStream archivo = new FileOutputStream(NOMBRE_ARCHIVO);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            
            // Escribimos toda la lista de un solo golpe
            salida.writeObject(this.listaAsignaturas);
            
            salida.close();
            System.out.println("Colección guardada con éxito en " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo coleccion.dat: " + e.getMessage());
        }
    }

    /**
     * Lee la lista completa de asignaturas desde "coleccion.dat"
     */
    @SuppressWarnings("unchecked")
    public void leerColeccion() {
        try {
            FileInputStream archivo = new FileInputStream(NOMBRE_ARCHIVO);
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            
            // Leemos el objeto y lo casteamos a una Lista de Asignaturas
            this.listaAsignaturas = (List<Asignatura>) entrada.readObject();
            
            entrada.close();
            System.out.println("Colección leída correctamente.");
            
            // Mostramos el contenido recuperado
            imprimirColeccion();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + NOMBRE_ARCHIVO + " no existe todavía.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo.");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al deserializar los datos.");
        }
    }

    /**
     * Método auxiliar para mostrar todas las asignaturas cargadas
     */
    public void imprimirColeccion() {
        if (listaAsignaturas.isEmpty()) {
            System.out.println("La lista de asignaturas está vacía.");
        } else {
            System.out.println("--- LISTA DE ASIGNATURAS ---");
            for (Asignatura asig : listaAsignaturas) {
                asig.imprimir();
                System.out.println("----------------------------");
            }
        }
    }
}