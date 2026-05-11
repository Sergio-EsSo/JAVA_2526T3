package peaje;

public abstract class Vehiculo {

    public String placa;
    public int peajeAcumulado = 0;

    public Vehiculo(String placa) {
        this.placa = placa;
    }
}