package mascotas;

import java.util.ArrayList;

import mascotas.peloCorto.peloC;
import mascotas.peloLargo.peloL;
import mascotas.sinPelo.razaSP;

public class test2 {

    public static void main(String[] args) {
        
        ArrayList<Gato> felis = new ArrayList<Gato>();

        sinPelo cat1 = new sinPelo("Michi", 2, null, 2d, 1.2d, razaSP.esfinge);

        peloCorto cat2 = new peloCorto("Pepino", 7, "gris oscuro", 1.59d, 1.2d, peloC.azul_ruso);

        peloLargo cat3 = new peloLargo("Sushi", 5, "gris claro", 1.3d, 1.6d, peloL.himalayo);

        felis.add(cat1);
        felis.add(cat2);
        felis.add(cat3);

        System.out.println("Michis:");

        for(Gato cat: felis){
            cat.sonido();
            System.out.println(cat.toString());
            System.out.println("------------");
        }
    }
}