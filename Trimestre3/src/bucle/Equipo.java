package bucle;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    private String nombre;
    private int tiempo;
    private int tiempoAcumulado;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nom, String pais){
        this.nombre = nom;
        this.pais = pais;
        tiempo = 0;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getTotalTiempo() {
        return tiempo;
    }
    public void setTotalTiempo(int totalTiempo) {
        this.tiempo = totalTiempo;
    }
    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    void annadirCiclista(Ciclista ista){
        listaCiclistas.add(ista);
    }

    public void buscarCiclista(){
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        boolean esta = false;
        for(int i=0; i<listaCiclistas.size(); i++){
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if(c.getNombre().equals(nombre)){
                System.out.println(c.getNombre()+" - "+c.getDorsal());
                esta=true;
            }
        }
        if(!esta){
            System.out.println("No está en el equipo....");
        }
        sc.close();
    }

    public void calcularTotalTiempo(){
        int tiempoE=0, tiempoAE=0;
        for(int i=0; i<listaCiclistas.size(); i++){
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            tiempoE += c.getTiempo();
            tiempoAE += c.getTiempoAcumulado();
        }
        this.tiempo = tiempoE;
        this.tiempoAcumulado= tiempoAE;
    }

    public void imprimir() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempo);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);

        System.out.println("Clasificacion de ciclsitas");
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            System.out.println("- " + c.getNombre() + " (Dorsal: " + c.getDorsal() + ")");
        }
    }
}