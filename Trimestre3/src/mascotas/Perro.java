package mascotas;

public class Perro extends Mascota {

    protected double peso;
    protected boolean muerde;

    public Perro(String nom, int edad, String col, double peso, boolean muerde) {
        super(nom, edad, col);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean isMuerde() {
        return muerde;
    }
    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + "]";
    }    

    @Override
    public void sonido(){
        super.sonido(); //"Las mascotas hacen bla bla bla..."
        System.out.println("Los perros ladran..");
    }

}
