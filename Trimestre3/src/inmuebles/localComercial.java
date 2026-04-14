package inmuebles;

public class localComercial extends local {

    String centroComercial;

    public localComercial(int id, int area, String dir, tipo loc, String CC){
        super(id, area, dir, loc);
        this.centroComercial = CC;
    }

    @Override
    protected double calcularPrecioVenta(){
        return precioVenta = area*valor_m2.get("Local Comercial");
    }

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+", Centro Comercial "+centroComercial
        +"\nTipo: "+local
        +precioVenta+"$";
    }

}
