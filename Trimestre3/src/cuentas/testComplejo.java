package cuentas;

public class testComplejo {

    public static void main(String[] args) {
        
        Cuenta uno = new Cuenta(245.56f, 1.45f);
        System.out.println(uno);

        uno.consignar(120.5f);
        uno.retirar(23.78f);

        System.out.println(uno);

        uno.extractoMensual();
        System.out.println(uno);
        System.out.println("--------------");

        CuentaCorriente dos = new CuentaCorriente(566.34f, 1f);
        System.out.println(dos);

        dos.retirar(45f);
        System.out.println(dos);
        System.out.println("--------------");

        CuentaAhorro tres = new CuentaAhorro(12345f, 2.2f);
        System.out.println(tres);

        tres.consignar(1300f);
        tres.retirar(10f);
        tres.retirar(2f);
        tres.retirar(50f);
        tres.retirar(12f);
        tres.retirar(8f);
        tres.extractoMensual();
        System.out.println(tres);
    }
}