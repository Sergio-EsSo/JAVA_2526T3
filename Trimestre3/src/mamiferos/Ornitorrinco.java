package mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo {

    void amamantarCrias(){
        System.out.println("El ornitorrinco amamanta a sus crias en el LAGO.");
    }

    @Override
    public void comer(){
        super.comer();
        System.out.println("Nos dedicamos a robar las peras...");
    }

    //metodo de la interfaz
    @Override
    public void ponerHuevos(){
        System.out.println("El ornitorrinco pone huevos");
    }
}
