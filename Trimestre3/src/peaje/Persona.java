package peaje;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private String DNI;
    private String DOB;
    private List<Vehiculo> vehiculosPropiedad;

    StringBuilder sb = new StringBuilder();

    public Persona(String nom, String ap, int id, int dia, int mes, int anno){
        this.nombre = nom;
        this.apellido = ap;

        sb.append(id);
        sb.append(calcularDNI(id));
        this.DNI = sb.toString();

        this.DOB = dia+"/"+mes+"/"+anno;
        this.vehiculosPropiedad = new ArrayList<>();
    } //PD: no enseñarle este constructo a Angel

    public char calcularDNI(int num){
        int cifras = (int) (Math.log10(Math.abs(num))+1); //log10 +1 para sacar las cifras

        if(cifras == 8){ //si da 8 cifras hago esto, si no, me arriesgo a que esto explote
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            return letras[num%23];
        }
        else{
            return 'Z';
        }
    }

    public void asignarVehiculo(Vehiculo vclo){
        if(!vehiculosPropiedad.contains(vclo)){
            vehiculosPropiedad.add(vclo);
            System.out.println("Vehiculo con placa"+vclo.placa+" asignado a "+nombre);
        }
    }

    public void desasignarVehiculo(Vehiculo vclo){
        if(vehiculosPropiedad.isEmpty()){
            System.out.println(nombre+" no tiene vehiculos.");
        }
        else if(vehiculosPropiedad.remove(vclo)){
            System.out.println("Vehiculo con placa "+vclo.placa+" desasignado para "+nombre);
        }
        else{
            System.out.println("Este vehiculo no pertenece a "+nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        this.DNI = dNI;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String dOB) {
        this.DOB = dOB;
    }
    public List<Vehiculo> getVehiculosPropiedad() {
        return vehiculosPropiedad;
    }
    public void setVehiculosPropiedad(List<Vehiculo> vehiculosPropiedad) {
        this.vehiculosPropiedad = vehiculosPropiedad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", DOB=" + DOB+"]";
    }
}