package compo;

public class Triangulo {

    Punto punto1;
    Punto punto2;
    Punto punto3;

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3){
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
        this.punto3 = new Punto(x3, y3);
    }

    public Punto getPunto1() {
        return punto1;
    }
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    public Punto getPunto2() {
        return punto2;
    }
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    public Punto getPunto3() {
        return punto3;
    }
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    void imprimir(){
        System.out.println("Triangulo: ("+punto1.getX()+","+punto1.getY()+"), "
    +"("+punto2.getX()+","+punto2.getY()+"), ("+punto3.getX()+","+punto3.getY()+")");
    }
}