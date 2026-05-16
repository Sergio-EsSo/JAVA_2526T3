package concesionario;

/**
 * Clase que ejecuta la simulación del concesionario
 * @autor yo no
 * @version 1.0
 * @since 2026
 */

public class Main {

    /**
     * Metodo principal, crea una instancia de dos coches y una de moto 
     * y ejecuta sus acciones (metodos propios de cada clase)
     * @param args  Argumentos de la linea de comandos que no se utilizan
     */
    public static void main(String[] args) {

        //instanciación de la clase para crear un objeto coche1
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 18000);
        Coche coche2 = new Coche("Citröen", "C3", 2009, 35000);
        Moto moto = new Moto("Yamaha", "Hornet", 2015, 20560);

        //prueba de los metodos de coche1
        coche1.arrancar();
        coche1.actualizarKilometros(167);
        System.out.println(coche1);
        System.out.println("Antigüedad: " + coche1.calcularAntiguedad() + " años");
        coche1.frenar();
        coche1.repostar(5.5);
        coche1.pintar("rojo");

        System.out.println("");

        //prueba de los metodos de coche2
        coche2.arrancar();
        coche2.actualizarKilometros(250);
        System.out.println(coche2);
        System.out.println("Antigüedad: " + coche2.calcularAntiguedad() + " años");
        coche2.frenar();
        coche2.repostar(5.5);
        coche2.pintar("rojo");

        System.out.println("");

        //prueba de los metodos moto
        moto.setMarca("Honda");
        moto.arrancar();
        moto.actualizarKilometros(20);
        moto.frenar();
        System.out.println(moto);
        System.out.println("Antigüedad: "+moto.calcularAntiguedad()+" años");
        moto.repostar(8.0);
        moto.arrancar();
        moto.actualizarKilometros(13);
        moto.frenar();
        System.out.println(moto);

    }
}