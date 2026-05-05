package medicina;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        ArrayList<Medico> listaMedicos = new ArrayList<>();

        //creamos una instancia (objeto) de cada clase de la jerarquia
        Medico med1 = new Medico("Juan Gonzalez");
        listaMedicos.add(med1);        
        Ortopedista med2 = new Ortopedista("Carlos Pineda", 
            medicina.Ortopedista.tipologia.MAXILOFACIAL);
        listaMedicos.add(med2);
        Pediatra med3 = new Pediatra("Ana Matilde",
            medicina.Pediatra.tipologia.PSICOLOGO);
        listaMedicos.add(med3);

        for(int i=0; i<listaMedicos.size(); i++){
            
            Medico med = (Medico) listaMedicos.get(i);
            if(med instanceof Ortopedista){
                System.out.println("El objeto con indice "+i+" es de la clase Ortopedista");
                continue; //salta al siguiente
            }
            if(med instanceof Pediatra){
                System.out.println("El objeto con indice "+i+" es de la clase Pediatra");
                continue; //salta al siguiente
            }
            if(med instanceof Medico){
                System.out.println("El objeto con indice "+i+" es de la clase Medico");
                continue; //salta al siguiente
            }
        }
    }
}