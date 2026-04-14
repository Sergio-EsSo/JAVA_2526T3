package inmuebles;

public class apartaestudio extends apartamento {

    protected static double valorArea = 1500;

    public apartaestudio(int id, int area, String dir, int nH, int nB){
        super(id, area, dir, nH, nB);        
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area * valor_m2.get("Apartaestudio");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\n-------\n"
        +precioVenta+"$";
    }

}
