package inmuebles;

public class casaUrbana extends casa {

    public casaUrbana(int id, int area, String dir, int nH, int nB, int nP){
        super(id, area, dir, nH, nB, nP);
    }

    //el toString no hace falta porque es igual al de la clase padre y se hereda exacto a este
}