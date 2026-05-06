package mamiferos;

import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) {
        
        ArrayList<Mamifero> lista = new ArrayList<>();

        Ballena ba = new Ballena();
        lista.add(ba);
        Ornitorrinco or = new Ornitorrinco();
        lista.add(or);

        for(Mamifero mam: lista){
            mam.amamantarCrias();
            mam.comer();
            if(mam instanceof Ornitorrinco){
                ((Ornitorrinco) mam).ponerHuevos(); //casteado, porque solo ornitorrinco lo tiene
            }
            if(mam instanceof Murcielago){
                ((Murcielago) mam).volar();
            }
            System.out.println("-------");
        }
    }
}