package universidad;

public class Estudiante extends Persona {

    protected String carrera;
    protected int semestre;

    public Estudiante(String nom, String dir, String car, int sem){
        super(nom, dir);
        this.carrera = car;
        this.semestre = sem;
    }

    public String getCarrera(){
        return this.carrera;
    }
    public void setCarrera(String car){
        this.carrera = car;
    }
    public int getSemestre(){
        return this.semestre;
    }
    public void setSemestre(int sem){
        this.semestre = sem;
    }
    @Override
    public String toString(){
        return "Sr/Sra. "+nombre+", con dirección: "+direccion
        +"\nCarrera: "+carrera
        +"\nSemestre: "+semestre;
    }
}