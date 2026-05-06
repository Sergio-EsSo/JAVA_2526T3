package mamiferos;

public class Murcielago extends Mamifero implements Volador {

    public void amamantarCrias(){
        System.out.println("El murciélago amamanta a sus crias COLGADOS.");
    }

    @Override
    public void comer(){
        super.comer();
        System.out.println("Salen por la noche como la gente de 20 años");
    }

    public void volar(){
        System.out.println("El murciélago vuela");
    }
}