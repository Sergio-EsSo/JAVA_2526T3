package inmuebles;

public class apartamento extends vivienda {

    public apartamento(int id, int area, String dir, int nH, int nB){
        super(id, area, dir, nH, nB);        
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\n-------\n"
        +precioVenta+"$";
    }
}
