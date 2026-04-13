package inmuebles;

public class casaRural extends casa {

    protected static double valorArea = 1.5e6d;
    protected int distCentro;
    protected int altitud;

    public casaRural(int id, int area, String dir, int nH, int nB,
    int nP, int dC, int alt){
        super(id, area, dir, nH, nB, nP);
        this.distCentro = dC;
        this.altitud = alt;
    }

    @Override
    protected double calcularPrecioVenta(){
        precioVenta = area*valor_m2.get("Casa rural");
        return precioVenta;
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\nPisos: "+numPisos
        +"\nDistancia al centro: "+distCentro+"km\nAltitud: "+altitud
        +"m\n-------\n"+precioVenta+"$";
    }

}
