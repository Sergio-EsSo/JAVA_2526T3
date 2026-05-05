package mamiferos;

public class Ballena extends Mamifero {

    void amamantarCrias(){
        System.out.println("La ballena amamanta a sus crias en ALTA MAR.");
    }

    @Override
    public void comer(){
        super.comer();
        System.out.println("La ballena abre sus fauces para comer");
    }
}
