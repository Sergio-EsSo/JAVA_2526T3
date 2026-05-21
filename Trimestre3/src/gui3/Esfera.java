package gui3;

public class Esfera extends FiguraGeometrica {
    private double radio; // Atributo que identifica el radio de una esfera
    /**
    * Constructor de la clase Esfera
    * @param radio Parámetro de define el radio de una esfera500 Ejercicios de programación orientada a objetos con Java y UML
    */
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(this.calcularVolumen()); /* Calcula el volumen y establece su atributo */
        this.setSuperficie(this.calcularSuperficie()); /* Calcula la superficie y establece su atributo */
    }
    /**
    * Método para calcular el volumen de una esfera
    * @return El volumen de una esfera
    */
    public double calcularVolumen() {
        double volumen = 4/3d * Math.PI * Math.pow(this.radio, 3d);
        return volumen;
    }
    /**
    * Método para calcular la superficie de una esfera
    * @return La superficie de una esfera
    */
    public double calcularSuperficie() {
        double superficie = 4d * Math.PI * Math.pow(this.radio, 2d);
        return superficie;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEsfera [radio=" + radio + "]";
    }
}