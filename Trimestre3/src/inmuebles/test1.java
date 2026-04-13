package inmuebles;

public class test1 {

    public static void main(String[] args) {

        System.out.println("Poblamos el mapa de precios unitarios\n");
        inmueble.poblar();
        //creamos una casa rural
        casaRural pitufo = new casaRural(1121, 55, "Petelos 11", 5, 2, 3, 3, 157);
        pitufo.calcularPrecioVenta();
        System.out.println(pitufo);        
    }
}