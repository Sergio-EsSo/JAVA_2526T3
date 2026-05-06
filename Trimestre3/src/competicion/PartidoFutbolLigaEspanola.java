package competicion;

public class PartidoFutbolLigaEspanola implements PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    //getters
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    //cuatro metodos por la interfaz
    public void setEquipoLocal(String nombreEquipo){
        this.equipoLocal = nombreEquipo;
    }
    public void setEquipoVisitante(String nombreEquipo){
        this.equipoVisitante = nombreEquipo;
    }
    public void setGolesEquipoLocal(int marcador){
        this.golesEquipoLocal = marcador;
    }
    public void setGolesEquipoVisitante(int marcador){
        this.golesEquipoVisitante = marcador;
    }

    void imprimirMarcador(){
        System.out.println("Equipo local: "+equipoLocal+" : "+golesEquipoLocal+"\n-------\n"
        +"Equipo visitante: "+equipoVisitante+" : "+golesEquipoVisitante);
    }
}