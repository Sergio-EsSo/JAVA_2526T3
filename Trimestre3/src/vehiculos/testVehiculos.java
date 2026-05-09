package vehiculos;

public class testVehiculos {

    public static void main(String[] args) {
        
        Terrestre camion = new Terrestre(110, 160, 10, "Civil");
        Acuatico lancha = new Acuatico(75, 90, "Superficie", 4);
        Aereo avion = new Aereo(0, 900);

        System.out.println("CAMION");
        camion.imprimir();
        System.out.println("Aceleramos... al MAXIMO");
        camion.acelerar(9999);
        camion.imprimir();
        System.out.println("Revoluciones: "+camion.calcularRevolucionesMotor(100, 2));

        System.out.println("-------");

        System.out.println("LANCHA");
        lancha.frenar(20);
        System.out.println("Miramos el viento...");
        lancha.recomendarVelocidad(67);
        lancha.imprimir();
        System.out.println("Miramos el viento... otra vez...");
        lancha.recomendarVelocidad(81);
        lancha.imprimir();

        System.out.println("-------");

        System.out.println("AVION");
        avion.encender();
        avion.subirTrenAterrizaje();
        avion.despegar();
        avion.acelerar(500);
        avion.imprimir();
        avion.volar();
        avion.soltarTrenAterrizaje();
        avion.frenar(9999999);
        avion.aterrizar();
        avion.apagar();
    }
}