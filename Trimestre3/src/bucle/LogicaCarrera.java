package bucle;

//import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LogicaCarrera {

    // Ordenar por Tiempo Parcial (de menor a mayor)
    public void ordenarPorTiempo(List<Ciclista> lista) {
        lista.sort(Comparator.comparingInt(Ciclista::getTiempo));
    }

    // Ordenar por Tiempo Acumulado (de menor a mayor)
    public void ordenarPorTiempoAcumulado(List<Ciclista> lista) {
        lista.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
    }

    public void actualizarClasificacionGeneral(List<Ciclista> lista) {
        // Primero ordenamos por el acumulado
        lista.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        
        // Luego asignamos la posición según el orden de la lista
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setPosicionGeneral(i + 1);
        }
    }
}