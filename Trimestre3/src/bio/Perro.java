package bio;

public class Perro extends Canido {

    public Perro(String son, String al, String hab, String nomC){
        super(son, al, hab, nomC);
    }

    public String getSonido(){
        return "Ladrido";
    }
    public String getAlimentos(){
        return "Carnívoro";
    }
    public String getHabitat(){
        return "Doméstico";
    }
    public String getNombreCientifico(){
        return "Canis Lupus Familiaris";
    }

    @Override
    public String toString(){
        return "\nEsto es un perro"+super.toString();
    }    
}