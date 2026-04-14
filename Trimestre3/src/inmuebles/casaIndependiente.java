package inmuebles;

public class casaIndependiente extends casaUrbana {

    protected static double valorArea = 3e3;

    public casaIndependiente(int id, int area, String dir, int nH, int nB, int nP){
        super(id, area, dir, nH, nB, nP);
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area * valor_m2.get("Casa independiente");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\nPisos: "+numPisos
        +"\n-------\n"+precioVenta+"$";
    }

}
