package libros;

public class Novela extends Libro {

    //atributo
    public enum genero{
        historica, romantica, policiaca, relista, ciencia_ficcion, aventuras
    }protected genero tipoNovela;

    public Novela(String t, String a, genero tipoN){
        super(t,a);
        this.tipoNovela = tipoN;
    }
    public genero getTipoNovela(){
        return tipoNovela;
    }
    public void setTipoNovela(genero tipoNovela){
        this.tipoNovela = tipoNovela;
    }
    @Override
    public String toString(){
        return titulo+" de "+autor+" es una novela "+tipoNovela;
    }

}
