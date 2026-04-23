package bucle;

import java.util.Random;

public class Ciclista {

    protected int dorsal;
    protected String nombre;
    protected int tiempo =0; //en segundos
    protected int tiempoAcumulado =0;
    protected int posicionGeneral =0;

    public Ciclista(int id, String nombre){
        this.dorsal = id;
        this.nombre = nombre;
    }

    //abstract String imprimirTipo();

    protected int getDorsal() {
        return dorsal;
    }
    protected void setDorsal(int id) {
        this.dorsal = id;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected int getTiempo(){
        return tiempo;
    }
    protected void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }

    //metodos PROPIOS
    protected int getPosicionGeneral(int posGen){
        return posGen;
    }
    protected void setPosicionGeneral(int posGen){
        this.posicionGeneral = posGen;
    }
    protected int getTiempoAcumulado(){
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tAc){
        this.tiempoAcumulado = tAc;
    }
    protected void imprimir(){
        System.out.println("ID: "+dorsal
            +"\n-----------\nNombre: "+nombre
            +"\nTiempo parcial: "+tiempo
            +"\nTiempo acumulado: "+tiempoAcumulado
        );
    }

    public void correrEtapa(int tiempoMin, int tiempoMax){
        Random rn = new Random();

        //Generamos un numero aleatorio entre el mínimo y el máximo inclusive
        //formula: rn.nextInt((max-min)+1)+min
        int tiempoEtapa = rn.nextInt((tiempoMax-tiempoMin)+1)+tiempoMin;

        this.tiempo=tiempoEtapa;
        this.tiempoAcumulado+=tiempoEtapa;

        System.out.println(nombre+" ha terminado la etapa en "+tiempoEtapa+" segundos.");
    }   
}