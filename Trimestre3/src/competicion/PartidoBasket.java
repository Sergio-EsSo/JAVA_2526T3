package competicion;

public interface PartidoBasket extends MatchDeportivo {

    public static final int DURACION_PARTIDO_BASKET=40;

    public void setGolesEquipoLocal(int numero);
    public void setGolesEquipoVisitante(int numero);
}