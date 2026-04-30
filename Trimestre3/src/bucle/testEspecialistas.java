package bucle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testEspecialistas{

	public static void main(String[] args) {
		
		int numeroEtapa=0;
        List<Equipo> listaEquipos = new ArrayList<>();
        List<Ciclista> peloton = new ArrayList<>();
		
		// Definición de equipos
        Equipo e1 = new Equipo("Movistar", "España");
        e1.annadirCiclista(new Escalador(10, "Nairo Quintana", 2.5, 8));
        e1.annadirCiclista(new Velocista(7, "Tadej Pogačar", 11.7, 16.4));
        e1.annadirCiclista(new ContraRelojista(44, "Rigoberto Urán", 18.8));

        Equipo e2 = new Equipo("Gamusines", "Francia");
        e2.annadirCiclista(new Escalador(25, "Egan Bernal", 2.4, 6.7));
        e2.annadirCiclista(new Velocista(1, "Jonas Vingegaard", 12.4, 18.3));
        e2.annadirCiclista(new ContraRelojista(66, "Raspidin Mac", 23.4));

        Equipo e3 = new Equipo("Kurwa", "Polonia");
        e3.annadirCiclista(new Escalador(13, "Richard Carapaz", 2.6, 7.5));
        e3.annadirCiclista(new Velocista(19, "Mark Cavendish", 15.2, 22.1));
        e3.annadirCiclista(new ContraRelojista(11, "Remco Evenepoel", 25.6));     

        listaEquipos.add(e1);
        listaEquipos.add(e2);
        listaEquipos.add(e3);

        for(Equipo e : listaEquipos){
            peloton.addAll(e.listaCiclistas);
        }

        //ETAPA 1
        System.out.println("--- INICIANDO ETAPA 1 (Montaña) ---");
        numeroEtapa=1;
        
        //RECORRER
        for (Equipo e : listaEquipos) {
        	//correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            for(Ciclista c : e.listaCiclistas){
                c.correrEtapa(3000, 5000);
            }
            e.calcularTotalTiempo();
        }

        //CLASIFICACIÓN DE LA ETAPA
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        //CLASIFICACIÓN GENERAL
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            c.setPosicionGeneral(i + 1);
            System.out.println("Pos " + c.getPosicionGeneral(i+1) + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }

        //CLASIFACION DE EQUIPOS POR ETAPA
        listaEquipos.sort(Comparator.comparingInt(Equipo::getTotalTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            System.out.println((i + 1) + ". " + e.getNombre() + " - Tiempo Etapa: " + e.getTotalTiempo() + "s");
        }

        //CLASIFICACION DE EQUIPOS GENERAL
        listaEquipos.sort(Comparator.comparingInt(Equipo::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            System.out.println((i+1) + ": " + e.getNombre() + " | Total: " + e.getTiempoAcumulado() + "s");
        }

        System.out.println("------------------------------------------");

        // Segunda ETAPA
        System.out.println("--- INICIANDO ETAPA 2 (Ciudad) ---");

        numeroEtapa++;

        //RECORRER
        for (Equipo e : listaEquipos) {
        	//correr etapa asigna el tiempo parcial Y Actualiza el acumulado
            for(Ciclista c : e.listaCiclistas){
                c.correrEtapa(3000, 5000);
            }
            e.calcularTotalTiempo();
        }

        //CLASIFICACIÓN DE LA ETAPA
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            System.out.println((i + 1) + ". " + c.getNombre() + " - Tiempo Etapa: " + c.getTiempo() + "s");
        }

        //CLASIFICACIÓN GENERAL
        peloton.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < peloton.size(); i++) {
            Ciclista c = peloton.get(i);
            c.setPosicionGeneral(i + 1);
            System.out.println("Pos " + c.getPosicionGeneral(i+1) + ": " + c.getNombre() + " | Total: " + c.getTiempoAcumulado() + "s");
        }

        //CLASIFACION DE EQUIPOS POR ETAPA
        listaEquipos.sort(Comparator.comparingInt(Equipo::getTotalTiempo));
        System.out.println("\nCLASIFICACIÓN ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            System.out.println((i + 1) + ". " + e.getNombre() + " - Tiempo Etapa: " + e.getTotalTiempo() + "s");
        }

        //CLASIFICACION DE EQUIPOS GENERAL
        listaEquipos.sort(Comparator.comparingInt(Equipo::getTiempoAcumulado));
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numeroEtapa + ":");
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            System.out.println((i+1) + ": " + e.getNombre() + " | Total: " + e.getTiempoAcumulado() + "s");
        }

        System.out.println("------------------------------------------");
	}
}