package bucle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testeoConDosEtapas{

	public static void main(String[] args) {
		
		int numeroEtapa=0;
		
		// 1. Creamos la lista de competidores
        List<Ciclista> peloton = new ArrayList<>();
        peloton.add(new Escalador(10, "Nairo Quintana",2.5d, 8));
        peloton.add(new Escalador(25, "Egan Bernal", 2.4d, 6.7d));
        peloton.add(new Velocista(7, "Tadej Pogačar", 11.7d, 16.4d));
        peloton.add(new Velocista(1, "Jonas Vingegaard", 12.4d, 18.3d));
        peloton.add(new ContraRelojista(44, "Rigoberto Urán", 18.8d));
        peloton.add(new ContraRelojista(66, "Raspidin Mac", 23.4d));

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