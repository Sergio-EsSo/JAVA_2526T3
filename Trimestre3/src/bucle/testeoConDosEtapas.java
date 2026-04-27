package bucle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testeoConDosEtapas{

	public static void main(String[] args) {
		
		int numeroEtapa=0;
		
		// 1. Creamos la lista de competidores
        List<Ciclista> peloton = new ArrayList<>();
        peloton.add(new Ciclista(10, "Nairo Quintana"));
        peloton.add(new Ciclista(25, "Egan Bernal"));
        peloton.add(new Ciclista(7, "Tadej Pogačar"));
        peloton.add(new Ciclista(1, "Jonas Vingegaard"));
        peloton.add(new Ciclista(44, "Rigoberto Urán"));

        //2. SIMULACIÓN ETAPA 1
        System.out.println("--- INICIANDO ETAPA 1 (Montaña) ---");
        //simularEtapaYMostrar(peloton, 1);
        numeroEtapa=1;
        
        // A /Cada ciclista corre la etapa (entre 3000 y 5000 segundos)
        for (Ciclista c : peloton) {
        	//correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            c.correrEtapa(3000, 5000); // tu decides los valores en segundos
        }

        // --- CLASIFICACIÓN DE LA ETAPA ---
        // B / Ordenamos por tiempo de la etapa actual (atributo 'tiempo')
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        // --- CLASIFICACIÓN GENERAL ---
        // C/ Ordenamos por tiempo acumulado
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
           //IMPORTANTE!!!!!!!!!!!!
            // Actualizamos la posición general en el objeto
            c.setPosicionGeneral(i + 1);
            System.out.println("Pos " + c.getPosicionGeneral(i+1) + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }
        System.out.println("------------------------------------------");

        // Segunda ETAPA

        numeroEtapa++;

        // A /Cada ciclista corre la etapa (entre 3000 y 5000 segundos)
        for (Ciclista c : peloton) {
        	//correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            c.correrEtapa(3000, 5000); // tu decides los valores en segundos
        }

        // --- CLASIFICACIÓN DE LA ETAPA ---
        // B / Ordenamos por tiempo de la etapa actual (atributo 'tiempo')
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        peloton.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
           //IMPORTANTE!!!!!!!!!!!!
            // Actualizamos la posición general en el objeto
            c.setPosicionGeneral(i + 1);
            System.out.println("Pos " + c.getPosicionGeneral(i+1) + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }
        System.out.println("------------------------------------------");
		
	}
}