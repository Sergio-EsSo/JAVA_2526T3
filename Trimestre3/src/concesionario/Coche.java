package concesionario;

import java.time.Year;

/**
 * Coche (clase) dentro de un concesionario (paquete)
 * Gestiona atributos simples como la marca, modelo, año de fabricación
 * y modelo del coche
 * 
 * @author ?? no sé, no hice el códgio
 * @version 1.0
 * @since 2026
 * @see
 */

public class Coche {

    //marca del coche
    private String marca;
    //modelo del coche
    private String modelo;
    //año de fabricacion del coche
    private int anio;
    //kilometraje del coche
    private double kilometros;

    /**
     * Constructor con todos los parametros del coche
     * @param marca         marca del coche (Citröen)
     * @param modelo        modelo del coche (C3)
     * @param anio          año de fabricacion (2002)
     * @param kilometros    kilometros iniciales del coche (numero mayor o igual a 0)
     * @throws IllegalArgumentException si el año es menor a 1886 o mayor al actual
     * o si los kilometros un numero negativo
     */
    public Coche(String marca, String modelo, int anio, double kilometros) {
        if ((anio < 1886 || anio > Year.now().getValue()) || kilometros < 0) {
            throw new IllegalArgumentException("El año introducido no es válido");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometros = kilometros;
    }

    //getters y setters

    /**
     * Obtiene la marca del coche
     * @return un String
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Modifica la marca del coche
     * @param marca la nueva marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene el modelo del coche
     * @return String
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Calcula la antigüedad del coche restando el año actual 
     * con el año de fabricación
     * @return un entero
     */
    public int calcularAntiguedad() {
        return Year.now().getValue() - anio;
    }
    /**
     * Incrementa el kilometraje del coche
     * @param nuevosKm cantidad de kilometros a añadir (debe ser positivo)
     * @throws IllegalArugmentException si la cantidad de kilometros es negativa
     */
    public void actualizarKilometros(double nuevosKm) {
        if (nuevosKm < 0) {
            throw new IllegalArgumentException("Los kilómetros no pueden ser negativos");
        }
        kilometros += nuevosKm;
    }

    /**
     * Muestra un mensaje por pantalla que muestra que el coche ha arrancado
     */
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }
    /**
     * Muestra por pantalla que el coche ha frenado
     */
    public void frenar(){
        System.out.println("El coche ha frenado.");
    }
    /**
     * Muestra por pantalla cuantos litros ha repostado el coche
     * @param litros    Cantidad de combustible a repostar
     */
    public void repostar(double litros){
        System.out.println("Se han repostado "+litros+" litros de combustible");
    }
    /**
     * Muestra por pantalla el nuevo color del coche
     * @param color     el nuevo color del coche
     */
    public void pintar(String color){
        System.out.println("El coche ha sido pintado de color "+color);
    }

    /**
     * Muestra la información del coche por pantalla
     * @deprecated el me´todo es antiguo, se recominda usar toString
     */
    @Deprecated
        public void mostrarInformacion() {
        System.out.println(this);
    }
    /**
     * Devuelve los atributos de la clase coche
     * @return un String
     */
    @Override
    public String toString() {
        return "Coche{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", anio=" + anio +
        ", kilometros=" + kilometros +'}';
    }
}