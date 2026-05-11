package compo;

public class Recta {

    Punto punto1;
    Punto punto2;

    public Recta(int x1, int y1, int x2, int y2){
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
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

    public double calculaPendiente(){
        return (punto2.getY()-punto1.getY())/(punto2.getX()-punto1.getX());
    }

    public double longitudSegmento(){
        double absi2 = Math.pow((punto2.getX()-punto1.getX()), 2);
        double ord2 = Math.pow((punto2.getY()-punto1.getY()), 2);
        return Math.sqrt((absi2+ord2));
    }

    void imprimir(){
        System.out.println("Recta con puntos en ("+punto1.getX()+","+punto1.getY()+") y "
    +"("+punto2.getX()+","+punto2.getY()+")");
    }
}