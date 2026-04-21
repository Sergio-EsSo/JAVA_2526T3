package mundial;

public class Entrenador extends SeleccionFutbol {

    protected String idFederacion;

    //constructor
    public Entrenador(int id, String nom, String ape, int edad, String idFederacion) {
        super(id, nom, ape, edad);
        this.idFederacion = idFederacion;
    }

    //getters y setters
    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    //metodos propios
    public void dirigirPartido(){
        System.out.println("El objeto Entrenador dirige un partido...");
    }
    public void dirigirEntreno(){
        System.out.println("El objeto Entreador dirige un entrenamiento...");
    }

    @Override
    public String toString(){
        return super.toString()+"\nID Federación: "+idFederacion;
    }

    @Override
    public void Viajar(){
        super.Viajar();
        System.out.println("El entrenador viaja en business...");
    }
}