package inmuebles;

import java.util.Map;
import java.util.HashMap;

public class inmueble {

    public static final Map<String, Double> valor_m2 = new HashMap<>();

    public static void poblar(){
        valor_m2.put("Casa rural", 1500.0);
        valor_m2.put("Casa urbanizacion", 2500d);
        valor_m2.put("Casa independiente", 3000d);
        valor_m2.put("Apartaestudio", 1500000d);
        valor_m2.put("Apartamento familiar", 2000d);
        valor_m2.put("Local comercial", 3000d);
        valor_m2.put("Oficina", 3500d);
    }

    protected int id;
    protected int area;
    protected String direccion;
    protected double precioVenta = 0d;

    //constructor
    public inmueble(int identificadorInm, int area, String dir){
        this.id = identificadorInm;
        this.area = area;
        this.direccion = dir;
    }
    protected double calcularPrecioVenta(){
        return precioVenta;
    }
    //getters setters
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getArea(){
        return this.area;
    }
    public void setArea(int ar){
        this.area = ar;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String dir){
        this.direccion = dir;
    }
    public double getPrecio(){
        return this.precioVenta;
    }
    public void setPrecio(double p){
        this.precioVenta = p;
    }
    @Override
    public String toString(){
        return id+":\n"+area+"m² en "+direccion+"\n-------\n"
        +precioVenta+"$";
    }
}