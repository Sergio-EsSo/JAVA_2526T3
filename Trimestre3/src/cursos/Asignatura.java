package cursos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Asignatura implements Serializable {

    int codigo;
    String nombre;
    int creditos;

    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    void imprimir(){
        System.out.println("Código asignatura: "+codigo);
        System.out.println("Nombre asignatura: "+nombre);
        System.out.println("Créditos asignatura: "+creditos);
    }

    public void escribirAsignatura(){
        try{
            FileOutputStream archivo = new FileOutputStream("Asignatura.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
        }
        catch (IOException e){
            System.out.println("No se puede escribir en el archivo");
        }
    }

    public void leerAsignatura(){
        try{
            FileInputStream archivo = new FileInputStream("Asignatura.dat"); //define el archivo
            ObjectInputStream entrada = new ObjectInputStream(archivo); //crea el objeto flujo de entrada para lectura del objeto
            Asignatura asignatura = (Asignatura) entrada.readObject(); //Lee el objeto
            asignatura.imprimir();
            entrada.close();
        }
        catch(FileNotFoundException e){ //no se encuentra el archivo
            System.out.println("No se pudo leer el archivo");
        }
        catch(IOException e){ //erro entrada/salida
            System.out.println("Error de entrada/salida");
        }
        catch(Exception e){ //excepcion general
            System.out.println("Error al leer el archivo");
        }
    }

    

}
