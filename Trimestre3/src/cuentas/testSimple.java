package cuentas;

public class testSimple {

    public static void main(String[] args) {
        
        Cuenta uno = new Cuenta(245.56f, 1.45f);
        System.out.println(uno);

        uno.consignar(120.5f);
        uno.retirar(23.78f);

        System.out.println(uno);

        uno.extractoMensual();
        System.out.println(uno);

        CuentaCorriente dos = new CuentaCorriente(566.34f, 1f);
        System.out.println(dos);

        dos.retirar(45f);
        System.out.println(dos);

        CuentaAhorro tres = new CuentaAhorro(12345f, 2.2f);
        System.out.println(tres);

        tres.consignar(1300f);
        tres.extractoMensual();
        System.out.println(tres);
    }
}