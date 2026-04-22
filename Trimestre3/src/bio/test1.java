package bio;

public class test1 {

    public static void main(String[] args) {
        
        //Animal sobera = new Animal("ewrg!", "kiwis", "navideño", "homo hispanicus");

        //Canido toralla = new Canido("brupp", "bichotas", "marino", "carolus maritimus");

        //Upcasting

        Canido mafalda = new Perro("Miau", "Sugus", "Xunta", "Mafaldus Galaicus");
        Animal feroz = new Lobo("argh!", "abuelas", "altas esferas", "Canis Ninis");
        Felido scar = new Leon("Roar", "Bifidus", "Gran Via", "Panthera Espetera");
        Animal conbotas = new Gato("ekekeke", "Whiskas", "Teis", "Catus Combotus");

        System.out.println(mafalda);
        System.out.println(feroz);
        System.out.println(scar);
        System.out.println(conbotas);

        System.out.println("x-x-x-x-x-x-x-x-x-x-x");

        System.out.println(mafalda instanceof Perro); //true
        System.out.println(feroz instanceof Animal); //true
        System.out.println(feroz instanceof Lobo); //true
        System.out.println(mafalda instanceof Lobo); //false
        System.out.println(conbotas instanceof Animal); //true

        System.out.println("x-x-x-x-x-x-x-x-x-x-x");

        //Downcasting de las cuatro referencias

        Perro pe = (Perro) mafalda;
        Lobo lo = (Lobo) feroz;
        Leon le = (Leon) scar;
        Gato ga = (Gato) conbotas;
        Felido fe = (Felido) conbotas;

        System.out.println(pe);
        System.out.println(lo);
        System.out.println(le);
        System.out.println(ga);
        System.out.println(fe);
    }
}
