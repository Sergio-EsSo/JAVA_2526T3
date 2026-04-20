package universidad;

public class Profesor extends Persona {

    protected String departamento;
    protected String categoria;

    public Profesor(String nom, String dir, String dep, String cat){
        super(nom, dir);
        this.departamento = dep;
        this.categoria = cat;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String dep) {
        this.departamento = dep;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String cat) {
        this.categoria = cat;
    }
    @Override
    public String toString(){
        return "Sr/Sra. "+nombre+", con dirección: "+direccion
        +"\nDepartamento: "+departamento
        +"\nCategoría: "+categoria;
    }
    

}
