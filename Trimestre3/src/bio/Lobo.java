package bio;

public class Lobo extends Canido {

    public Lobo(String son, String al, String hab, String nomC) {
        super(son, al, hab, nomC);
    }

    public String getSonido(){
        return "Aullido";
    }
    public String getAlimentos(){
        return "Carnívoro";
    }
    public String getHabitat(){
        return "Bosque";
    }
    public String getNombreCientifico(){
        return "Canis Lupus Lupus";
    }

    @Override
    public String toString(){
        return "\nEsto es un lobo"+super.toString();
    }
}