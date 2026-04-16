package mascotas;

import java.util.ArrayList;

import mascotas.Grande.razaG;
import mascotas.Mediano.razaM;
import mascotas.Pequeno.razaP;

public class test1 {

    public static void main(String[] args) {
        
        ArrayList<Perro> canes = new ArrayList<Perro>();

        Grande dog1 = new Grande("Manolo", 8, "jaspeado", 23d, true, razaG.rottweiller);
        canes.add(dog1);
        
        Mediano dog2 = new Mediano("Pepe", 3, "indefinido", 12d, false, razaM.collie);
        canes.add(dog2);

        Pequeno dog3 = new Pequeno("Carlos", 6, "manchas", 6d, true, razaP.chihuahua);
        canes.add(dog3);

        System.out.println("Perretes:");

        for(Perro perro: canes){
            perro.sonido();
            System.out.println(perro.toString());
            System.out.println("-----------------");
        }
    }
}