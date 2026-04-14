package inmuebles;

public class local extends inmueble {

    public enum tipo{
        interno, calle
    } protected tipo local;

    public local(int id, int area, String dir, tipo loc){
        super(id, area, dir);
        this.local = loc;
    }

    //local es una clase buffer por lo que no hay calcularPrecioVenta()
    //está heredado y devuelve 0, por lo que no se puede aplicar

    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion
        +"\nTipo: "+local
        +precioVenta+"$";
    }
}