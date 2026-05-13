package compoCarro;

public class testeoCarro {

    public static void main(String[] args) {
        
        //se instancia DENTRO del constructor
        Carro carruaje = new Carro(2, tipoChasis.MONOCASCO, "Rojo", tipoCarroceria.TUBULAR, "Goodyear", 25, 20, 15);

        //como hay 4 llantas, se imprime 4 veces
        carruaje.imprimir();
    }
}