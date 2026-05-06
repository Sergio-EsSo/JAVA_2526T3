package competicion;

public interface PartidoFutbol extends MatchDeportivo {

    public static final int DURACION_PARTIDO_FUTBOL=90;

    public void setGolesEquipoLocal(int numero);
    public void setGolesEquipoVisitante(int numero);
}