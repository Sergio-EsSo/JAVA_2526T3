package charlin;

public class LineaPedido {

    private int id;
    private int cantidad;
    private Producto producto;
    
    public LineaPedido(int id, int cantidad, Producto prod) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = prod;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setPrecioUd(Producto pdt) {
        this.producto = pdt;
    }

    //metodo propio
    public double calcularSubtotal(){
        return this.cantidad*producto.getPrecio();
    }

    @Override
    public String toString() {
        return "Linea Pedido\nID:"+id+"\nCantidad: "+cantidad+"\nProducto: "+producto.toString()+"\n";
    }
}