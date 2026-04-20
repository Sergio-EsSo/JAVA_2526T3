package dispositivos;

public class Tableta extends DispositivoInformatico {

    Tableta(String marca){
        super();
        System.out.println("Marca: "+marca+" (este es el parametro pero  no se asigna al atributo)");
    }

    @Override
    public String toString(){
        return "Tableta:\n- Marca: "+marca;
    }
}