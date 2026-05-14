package futbol;

public class EquipoFutbol {

    String nombre;
    String pais;
    
    Tecnico tecnico;
    Portero portero;
    Defensa[] defensas;
    Mediocampo[] mediocampos;
    Delantero[] delanteros;

    public EquipoFutbol(String nom, String pa){
        this.nombre = nom;
        this.pais = pa;
    }
    public EquipoFutbol(String nom, String pa, Tecnico tec, Portero port, Defensa[] def, Mediocampo[] med, Delantero[] del){
        this(nom, pa);
        this.tecnico = tec;
        this.portero = port;
        this.defensas = def;
        this.mediocampos = med;
        this.delanteros = del;
    }

    public void imprimir(){
        System.out.println(nombre+" ("+pais+")");
        System.out.println("----------------");
        System.out.print("· Técnico: "+tecnico.getNombre()+" "+tecnico.getApellidos()+", "
            +tecnico.getEdad()+" años, "+tecnico.getAnnosExperiencia()+" años de experiencia"
        );
        if(tecnico.isExtranjero()==true){
            System.out.println(" y es extranjero.");
        }
        else{
            System.out.println(".");
        }
        System.out.println("· Portero: "+portero.getNombre()+" "+portero.getApellidos()+", "+portero.getEdad()+" años y "+portero.getGolesRecibidos()+" goles recibidos.");
        System.out.println("· Defensas:");
        for(Defensa d : defensas)
            System.out.println("  - "+d.getNombre()+" "+d.getApellidos()+", "+d.getEdad()+" años.");
        System.out.println("· Mediocampos:");
        for(Mediocampo m : mediocampos)
            System.out.println("  - "+m.getNombre()+" "+m.getApellidos()+", "+m.getEdad()+" años, "+m.getAsistencias()+" asistencias.");
        System.out.println("· Delanteros:");
        for(Delantero d : delanteros)
            System.out.println("  - "+d.getNombre()+" "+d.getApellidos()+", "+d.getEdad()+" años, "+d.getGolesAnotados()+" goles anotados.");
    }
}