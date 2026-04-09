package libros;

import java.util.ArrayList;
import java.util.List;
import libros.Novela.genero;

public class testLibros {

    public static void main(String[] args) {
        
        List<Libro> coleccion = new ArrayList<Libro>();

        Libro libroG = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libroG.setPrecio(45000);

        LibroTexto libroT = new LibroTexto("Cálculo Diferencial", "James Stewart", 1);
        libroT.setPrecio(85000);

        LibroTextoUNC libroUNC = new LibroTextoUNC("Fundamentos de Programación", "S. Arévalo", 2, "Facultad de Ingeniería");
        libroUNC.setPrecio(32000);

        Novela novelaH = new Novela("El nombre de la rosa", "Umberto Eco", genero.historica);
        novelaH.setPrecio(52000);

        coleccion.add(libroG);
        coleccion.add(libroT);
        coleccion.add(libroUNC);
        coleccion.add(novelaH);

        for(Libro lib: coleccion)
            System.out.println(lib+"\n------");

    }
}