package inmuebles;

public class apartamentoFamiliar extends apartamento {
    
    protected int valorComunidad;
    protected boolean tienePiscina;
    protected boolean tieneCanchas;

    public apartamentoFamiliar(int id, int area, String dir, int nH, int nB, int vA,
    boolean tienePiscina, boolean tieneCanchas){
        super(id, area, dir, nH, nB);
        this.valorComunidad = vA;
        this.tieneCanchas = tienePiscina;
        this.tieneCanchas = tieneCanchas;
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area * valor_m2.get("Apartamento familiar");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\nHabitaciones: "
        +numHab+"\nBaños: "+numBan
        +"\nValor comunidad: "+valorComunidad+"\nPiscina: "+tienePiscina
        +"\nCampos deportivos: "+tieneCanchas
        +"\n-------\n"+precioVenta+"$";
    }

}
