package bio;

public class Leon extends Felido {

    public Leon(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }

    public String getSonido(){
        return "Ruge";
    }
    public String getAlimentos(){
        return "Carnívoro";
    }
    public String getHabitat(){
        return "Sabana";
    }
    public String getNombreCientifico(){
        return "Panthera Leo";
    }
    
    @Override
    public String toString(){
        return "\nEsto es un leon"+super.toString();
    }  
}