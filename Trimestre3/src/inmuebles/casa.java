package inmuebles;

public class casa extends vivienda {

    protected int numPisos;

    public casa(int id, int area, String dir, int numH, int numB, int numP){
        super(id, area, dir, numH, numB);
        this.numPisos = numP;
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\nPisos: "+numPisos
        +"\n-------\n"+precioVenta+"€";
    }

}
