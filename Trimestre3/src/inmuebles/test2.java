package inmuebles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import inmuebles.local.tipo;

public class test2 {

    public static void main(String[] args) {
        
        System.out.println("Poblamos el mapa de precios unitarios");
        inmueble.poblar();
        //ver mapa
        for(Map.Entry<String, Double> entrada : inmueble.valor_m2.entrySet()){
            String clave = entrada.getKey();
            Double valor = entrada.getValue();
            System.out.println("\nClave: "+clave+"\nValor: "+valor);
        }
        List<inmueble> lares = new ArrayList<inmueble>();

        //creamos una casa rural
        casaRural pitufo = new casaRural(1121, 55, "Petelos 11", 5, 2, 3, 3, 157);
        lares.add(pitufo);
        //casa en urbanizacion
        casaUrbanizacion montepinar = new casaUrbanizacion(666, 49, "Mirador de Montepinar 3", 4, 1, 1, 140, true, true);
        lares.add(montepinar);
        //casa independiente
        casaIndependiente puigdemont = new casaIndependiente(2020, 100, "Las Ramblas 32", 8, 2, 3);
        lares.add(puigdemont);
        //local Comercial
        localComercial geles = new localComercial(8989, 45, "O carallo 29", tipo.interno, "Jones & Misco Co.");
        lares.add(geles);
        //oficina
        oficina corruptos = new oficina(91, 430, "Diablo 54", tipo.calle, false);
        lares.add(corruptos);

        double valorTotal = 0d;

        //calcular pvp de todos
        for(inmueble inmo: lares)
            valorTotal+=inmo.calcularPrecioVenta();

        //impresion
        for(inmueble inmo: lares)
            System.out.println(inmo);

        System.out.println("total de propiedades de la imobiliaria: "+valorTotal);
    }
}