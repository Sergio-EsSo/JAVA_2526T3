package inmuebles;

public class oficina extends local {

    protected boolean esPublica;

    public oficina(int id, int area, String dir, tipo loc, boolean pub){
        super(id, area, dir, loc);
        this.esPublica = pub;
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area * valor_m2.get("Oficina");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion
        +"\nTipo: "+local+"\nPública: "+esPublica
        +precioVenta+"$";
    }

}
