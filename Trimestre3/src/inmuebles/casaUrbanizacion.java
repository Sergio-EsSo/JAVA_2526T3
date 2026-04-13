package inmuebles;

public class casaUrbanizacion extends casa {

    protected int valorComunidad;
    protected boolean tienePiscina;
    protected boolean tieneCanchas;

    public casaUrbanizacion(int id, int area, String dir, int nH, int nB, int nP, int vA,
    boolean tienePiscina, boolean tieneCanchas){
        super(id, area, dir, nH, nB, nP);
        this.valorComunidad = vA;
        this.tieneCanchas = tienePiscina;
        this.tieneCanchas = tieneCanchas;
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area * valor_m2.get("Casa urbanizacion");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan+"\nPisos: "+numPisos
        +"\nValor comunidad: "+valorComunidad+"\nPiscina: "+tienePiscina
        +"\nCampos deportivos: "+tieneCanchas
        +"\n-------\n"+precioVenta+"$";
    }
}