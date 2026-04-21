package universidad;

public class Test3 {

    public static void main(String[] args) {
        
        Persona p = new Estudiante("Carlos", "O carallo 29", "ADE", 3);

        if(p instanceof Estudiante){
            Estudiante e = (Estudiante) p;

            System.out.println("Carrera recuperada: "+e.getCarrera());
            System.out.println("Semestre: "+e.getSemestre());
        }

        Persona p2 = new Profesor("Ana", "Gran Vía Madrid", "Física", "Titular");

        if(p2 instanceof Profesor){
            Profesor profe = (Profesor) p2;
            System.out.println("Departamento: "+profe.getDepartamento());
            System.out.println("Categoria: "+profe.getCategoria());
        }

        // NOS PODEMOS EQUIVOCAR !!! CUIDADO AAAAAAAA

        Estudiante bueno = (Estudiante) p2; //me deja porque me odian y me quieren matar con martillos
        System.out.println("Semestre: "+bueno.getSemestre()); //esto falla porque p2 es un Profesor
    }

}
