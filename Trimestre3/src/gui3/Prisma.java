package gui3;

public class Prisma extends FiguraGeometrica {
    
    //atributos propios
    private double ladoB;
    private double altura;
    
    //constructor
    public Prisma(double lB, double alt) {
        this.ladoB = lB;
        this.altura = alt;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double getLadoBase() {
        return ladoB;
    }
    public void setLadoBase(double lado) {
        this.ladoB = lado;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double alt) {
        this.altura = alt;
    }

    //metodos propios
    public double calcularVolumen() {
        double areaBase = Math.pow(ladoB, 2);
        return areaBase*altura;
    }
    public double calcularSuperficie() {
        double areaBase = Math.pow(ladoB, 2);
        double areaLateral = (4d*ladoB)*altura;
        return (2*areaBase)+areaLateral;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPrisma [lado de la base=" + ladoB + ", altura=" + altura + "]";
    }
}