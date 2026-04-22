package bio;

public abstract class Animal {

    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    //sin constructor
    public Animal(String sonido, String alimentos, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    //cuatro metodos abstractos
    public abstract String getNombreCientifico();

    public abstract String getSonido();

    public abstract String getHabitat();

    public abstract String getAlimentos();

    @Override
    public String toString(){
        return "\n------------\nNombre Científico: "+nombreCientifico+"Sonido: "+sonido+"\nDieta: "+alimentos
        +"\nHabitat: "+habitat;
    }

}