package gui3;

public class Cono extends FiguraGeometrica {

    final double PI = 3.141592;

    //atributos propios
    private double radio;
    private double altura;

    public Cono(double r, double h){
        this.radio = r;
        this.altura = h;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    //getters setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos propios
    public double calcularGeneratriz(){
        return Math.sqrt(((Math.pow(radio, 2))+Math.pow(altura, 2)));
    }

    public double calcularVolumen(){
        return (1/3d * altura * PI * Math.pow(radio, 2d));
    }
    
    public double calcularSuperficie(){
        double areaBase = PI*Math.pow(radio, 2);
        double areaLateral = PI*radio*calcularGeneratriz();
        return areaBase+areaLateral;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCono [radio=" + radio + ", altura=" + altura + ", generatriz="+calcularGeneratriz()+"]";
    }
}
