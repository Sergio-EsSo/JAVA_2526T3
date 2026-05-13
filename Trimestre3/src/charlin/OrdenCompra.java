package charlin;

import java.util.ArrayList;
import java.util.List;

public class OrdenCompra {

    private int id;
    private List<LineaPedido> lineas;

    public OrdenCompra(int id) {
        this.id = id;
        this.lineas = new ArrayList<>(); //se inicializa dentro del construcotr para evitar NullPointerException
    }                                       //y tambien para la relacion de agregación

    public void anadirItem(LineaPedido lin){
        lineas.add(lin);
    }

    public double calcularTotalOrden(){
        double total = 0d;
        for(LineaPedido lin: lineas){
            total += lin.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Orden de compra ID: ").append(id).append("\n");
        sb.append("Detallles:\n");
        for(LineaPedido lin: lineas){
            sb.append("- ").append(lin.toString()).append("\n");
        }
        sb.append("Total orden: $").append(calcularTotalOrden());
        return sb.toString();
    }
}