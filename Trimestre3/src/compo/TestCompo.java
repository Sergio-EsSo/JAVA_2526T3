package compo;

public class TestCompo {

    public static void main(String[] args) {
        
        Circulo circ = new Circulo(4, 5, 3);
        Triangulo tri = new Triangulo(3, 4, 2, 1, -5, 0);
        Recta rec = new Recta(2, 0, 1, 1);

        Punto punto = circ.getCentro();
        System.out.println("El centro está en: "+punto.toString());
        
        System.out.println("INFO CIRCULO: ");
        circ.imprimir();

        System.out.println("INFO TRIANGULO: ");
        tri.imprimir();

        System.out.println("INFO RECTA: ");
        rec.imprimir();
        System.out.println("Tiene una pendiente "+rec.calculaPendiente());
        System.out.println("Tiene un segmento con longitud: "+rec.longitudSegmento());
    }
}
