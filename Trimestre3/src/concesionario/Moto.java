package concesionario;

import java.time.Year;

/**
 * Moto (clase) dentro de un concesionario (paquete)
 * Gestiona atributos simples como la marca, modelo, año de fabricación
 * y modelo de la moto
 * 
 * @author ?? no sé, no hice el códgio
 * @version 1.0
 * @since 2026
 * @see
 */

public class Moto {

    //marca de la moto
    private String marca;
    //modelo de la moto
    private String modelo;
    //año de fabricacion de la moto
    private int anio;
    //kilometraje de la moto
    private double kilometros;

    /**
     * Constructor con todos los parametros de la moto
     * @param marca         marca de la moto (Honda)
     * @param modelo        modelo de la moto (Hornet)
     * @param anio          año de fabricacion (2007)
     * @param kilometros    kilometros iniciales de la moto (numero mayor o igual a 0)
     * @throws IllegalArgumentException si el año es menor a 1886 o mayor al actual
     * o si los kilometros un numero negativo
     */
    public Moto(String marca, String modelo, int anio, double kilometros) {
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
     * Obtiene la marca de la moto
     * @return un String
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Modifica la marca de la moto
     * @param marca la nueva marca de la moto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene el modelo de la moto
     * @return String
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Calcula la antigüedad de la moto restando el año actual 
     * con el año de fabricación
     * @return un entero
     */
    public int calcularAntiguedad() {
        return Year.now().getValue() - anio;
    }
    /**
     * Incrementa el kilometraje de la moto
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
     * Muestra un mensaje por pantalla que muestra que la moto ha arrancado
     */
    public void arrancar() {
        System.out.println("La moto ha arrancado.");
    }
    /**
     * Muestra por pantalla que la moto ha frenado
     */
    public void frenar(){
        System.out.println("La moto ha frenado.");
    }
    /**
     * Muestra por pantalla cuantos litros ha repostado la moto
     * @param litros    Cantidad de combustible a repostar
     */
    public void repostar(double litros){
        System.out.println("Se han repostado "+litros+" litros de combustible");
    }
    /**
     * Muestra por pantalla el nuevo color de la moto
     * @param color     el nuevo color de la moto
     */
    public void pintar(String color){
        System.out.println("La moto ha sido pintada de color "+color);
    }

    /**
     * Muestra la información de la moto por pantalla
     * @deprecated el método es antiguo, se recomienda usar toString
     */
    @Deprecated
        public void mostrarInformacion() {
        System.out.println(this);
    }
    /**
     * Devuelve los atributos de la clase moto
     * @return un String
     */
    @Override
    public String toString() {
        return "Moto{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", anio=" + anio +
        ", kilometros=" + kilometros +'}';
    }
}