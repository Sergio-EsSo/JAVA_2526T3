package peaje;

public class TesteoPeaje {

    public static void main(String[] args) {
        
        Peaje Rande = new Peaje("Peaje de Rande", "Pontevedra");

        Carro car1 = new Carro("6733 TPM");
        Carro car2 = new Carro("4892 GPT");
        Moto moto = new Moto("8237 PBS");
        Camion camion1 = new Camion("2893 MWB", 3);
        Camion camion2 = new Camion("4029 JSH", 6);

        System.out.println("---COBROS PEAJE---");

        System.out.println("Cobro primer coche: $"+Rande.calcularPeaje(car1));
        Rande.anadirVehiculo(car1);

        System.out.println("Cobro segundo coche: $"+Rande.calcularPeaje(car2));
        Rande.anadirVehiculo(car2);

        System.out.println("Cobro moto: $"+Rande.calcularPeaje(moto));
        Rande.anadirVehiculo(moto);

        System.out.println("Cobro primer camion: $"+Rande.calcularPeaje(camion1));
        Rande.anadirVehiculo(camion1);

        System.out.println("Cobro segundo camion: $"+Rande.calcularPeaje(camion2));
        Rande.anadirVehiculo(camion2);

        System.out.println("---TOTAL---");

        Rande.imprimir();
    }
}