package peaje;

import java.util.ArrayList;
import java.util.List;

public class TesteoPeaje2 {

    public static void main(String[] args) {
        
        Peaje Rande = new Peaje("Peaje de Rande", "Pontevedra");
        List<Persona> personas = new ArrayList<>();

        Carro car1 = new Carro("6733 TPM");
        Carro car2 = new Carro("4892 GPT");
        Moto moto = new Moto("8237 PBS");
        Camion camion1 = new Camion("2893 MWB", 3);
        Camion camion2 = new Camion("4029 JSH", 6);

        Persona Paco = new Persona("Francisco", "Castro", 12345678, 12, 4, 1973);
        Persona Billy = new Persona("Guillermo", "Puertas", 34785690, 3, 3, 2005);
        Persona Olalla = new Persona("Eulalia", "Carballo", 89341267, 29, 11, 1969);
        Persona Lola = new Persona("Maria Dolores", "Trujillo", 11994455, 7, 6, 2001);

        personas.add(Paco);
        personas.add(Billy);
        personas.add(Olalla);
        personas.add(Lola);

        //asignacion vehiculos a cada persona en lugar del peaje
        Paco.asignarVehiculo(camion1);
        Paco.asignarVehiculo(car2);
        Billy.asignarVehiculo(moto);
        Olalla.asignarVehiculo(car1);
        Lola.asignarVehiculo(camion2);

        //calcular peaje para que salga en la factura
        Rande.calcularPeaje(camion1);
        Rande.calcularPeaje(camion2);
        Rande.calcularPeaje(moto);
        Rande.calcularPeaje(car1);
        Rande.calcularPeaje(car2);

        System.out.println("-------------------------------------------");
        System.out.println("TOTAL PEAJE:\n");

        Rande.imprimirMejorado(Paco);
        Rande.imprimirMejorado(Billy);
        Rande.imprimirMejorado(Olalla);
        Rande.imprimirMejorado(Lola);

        System.out.println("");
    }
}