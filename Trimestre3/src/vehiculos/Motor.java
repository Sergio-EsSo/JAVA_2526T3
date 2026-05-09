package vehiculos;

public interface Motor {

    default int calcularRevolucionesMotor(int fuerza, int radio){
        return fuerza*radio;
    }
}