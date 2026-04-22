package bio;

public class Gato extends Felido {

    public Gato(String son, String al, String hab, String nomC) {
        super(son, al, hab, nomC);
    }

    public String getSonido(){
        return "Maullido";
    }
    public String getAlimentos(){
        return "Carnívoro";
    }
    public String getHabitat(){
        return "Doméstico";
    }
    public String getNombreCientifico(){
        return "Felis Catus";
    }

    @Override
    public String toString(){
        return "\nEsto es un gato"+super.toString();
    }
}
