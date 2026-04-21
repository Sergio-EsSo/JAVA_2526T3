package mundial;

public class Futbolista extends SeleccionFutbol {

    
    //atributos
    protected int dorsal;
    protected String demarcacion;

    //constructor
    public Futbolista(int id, String nom, String ape, int edad, int dor, String dem) {
        super(id, nom, ape, edad);
        this.dorsal = dor;
        this.demarcacion = dem;
    }

    //getter y setter
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    //metodos propios
    public void jugarPartido(){
        System.out.println("El objeto Futbolista juega un partido...");
    }
    public void entrenar(){
        System.out.println("El objeto Futbolista realiza un entrenamiento...");
    }

    @Override
    public String toString(){
        return super.toString()+"\nFutbolista con dorsal "+dorsal+" y "+demarcacion;
    }

    @Override
    public void Viajar(){
        super.Viajar();
        System.out.println("El futbolista viaja en turista...");
    }
}