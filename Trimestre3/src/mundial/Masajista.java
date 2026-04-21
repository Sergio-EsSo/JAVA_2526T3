package mundial;

public class Masajista extends SeleccionFutbol {

    protected String titulacion;
    protected int aniosExperiencia;

    public Masajista(int id, String nom, String ape, int edad, String titulacion, int aniosExperiencia) {
        super(id, nom, ape, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //metodos propios
    public void darMasaje(){
        System.out.println("El objeto Masajista da un masaje...");
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTitulación: "+titulacion+"\nAños de experiencia: "+aniosExperiencia;
    }

    @Override
    public void Viajar(){
        super.Viajar();
        System.out.println("El masajista viaja en la bodega..");
    }
}