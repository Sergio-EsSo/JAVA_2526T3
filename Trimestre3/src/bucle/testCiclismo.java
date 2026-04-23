package bucle;

import java.util.ArrayList;
import java.util.List;

public class testCiclismo {

    public static void main(String[] args) {
        
        List<Ciclista> ciclista = new ArrayList<>();
        LogicaCarrera logi = new LogicaCarrera();

        ciclista.add(new Ciclista(204, "Eugenio Pinares"));
        ciclista.add(new Ciclista(196, "Manuel Jimenez"));
        ciclista.add(new Ciclista(120, "Anxo del Hierro"));
        ciclista.add(new Ciclista(305, "Sergio Carballo"));
        ciclista.add(new Ciclista(88, "Ioritz Aibalaostia Aguirre"));

        System.out.println("Ciclistas:\n");
        for(Ciclista ista: ciclista){
            ista.imprimir();
        }

        System.out.print("\nx-x-x-x-x-x-x-x-x-x\n");
        System.out.print("\nx-x-x-x-x-x-x-x-x-x\n");
        System.out.print("\nx-x-x-x-x-x-x-x-x-x\n\n");

        System.out.println("RESULTADOS de la etapa 1:");
        for(Ciclista ista: ciclista){
            ista.correrEtapa(3600, 7200);
        }

        System.out.print("\nClasificación de ciclistas...\n");
        System.out.print("PRIMERA etapa:\n");
        logi.ordenarPorTiempo(ciclista);
        for(Ciclista ista: ciclista){
            ista.imprimir();
        }

        System.out.print("\nx-x-x-x-x-x-x-x-x-x\n\n");

        System.out.println("RESULTADOS de la etapa 2:");
        for(Ciclista ista: ciclista){
            int acumPrevio = ista.getTiempoAcumulado();
            ista.correrEtapa(3600, 7200);
            ista.setTiempoAcumulado(acumPrevio+ista.getTiempo());
        }
        
        System.out.print("\nClasificación de ciclistas...\n");
        System.out.print("SEGUNDA etapa:\n");
        System.out.print("Por tiempo:\n");
        logi.ordenarPorTiempo(ciclista);
        for(Ciclista ista: ciclista){
            ista.imprimir();
        }
        System.out.print("\n");
        System.out.print("Por tiempo acumulado:\n");
        logi.ordenarPorTiempoAcumulado(ciclista);
        for(Ciclista ista: ciclista){
            ista.imprimir();
        }

        System.out.print("\nx-x-x-x-x-x-x-x-x-x\n\n");

        System.out.print("Clasificación de ciclistas...\n");
        System.out.print("FINAL:\n\n");
        logi.actualizarClasificacionGeneral(ciclista);
        for(Ciclista ista: ciclista){
            ista.imprimir();
        }    
    }
}