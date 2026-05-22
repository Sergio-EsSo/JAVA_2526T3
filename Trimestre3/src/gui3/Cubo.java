package gui3;

public class Cubo extends FiguraGeometrica {
    
    //atributos propios
    private double lado;
    
    //constructor
    public Cubo(double lado) {
        this.lado = lado;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodos propios
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
    public double calcularSuperficie() {
        return (Math.pow(lado, 2))*6d;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCubo [lado=" + lado + "]";
    }
}