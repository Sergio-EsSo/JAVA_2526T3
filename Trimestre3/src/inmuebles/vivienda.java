package inmuebles;

public class vivienda extends inmueble {

    protected int numHab;
    protected int numBan;

    public vivienda(int id, int area, String dir, int numH, int numB){
        super(id, area, dir); //incova el constructor de la clase papa
        this.numHab = numH;
        this.numBan = numB;
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\n-------\n"
        +precioVenta+"€";
    }

}
