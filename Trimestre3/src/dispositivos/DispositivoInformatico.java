package dispositivos;

public class DispositivoInformatico {

    String marca = "Acer";

    DispositivoInformatico(){
        System.out.println("Marca: "+marca);
    }

    @Override
    public String toString(){
        return "Dispositivo informático:\n- Marca: "+marca;
    }
}