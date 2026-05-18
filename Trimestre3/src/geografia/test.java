package geografia;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        Municipio coruna = new Municipio("A Coruña", 244700, 14.8, 5);
        Municipio santiago = new Municipio("Santiago de Compostela", 97839, 13.0, 260);
        
        ArrayList<Municipio> listaCoruna = new ArrayList<>();
        listaCoruna.add(coruna);
        listaCoruna.add(santiago);
        Departamento provinciaCoruna = new Departamento("A Coruña", listaCoruna);

        ArrayList<Municipio> listaLugo = new ArrayList<>();
        Departamento provinciaLugo = new Departamento("Lugo", listaLugo);
        provinciaLugo.agregarMunicipio(new Municipio("Lugo", 97211, 12.0, 465));
        provinciaLugo.agregarMunicipio(new Municipio("Monforte de Lemos", 18081, 13.5, 297));

        Departamento provinciaOurense = new Departamento("Ourense", new ArrayList<Municipio>());

        //probiñas

        System.out.println("-----GALICIA------");
        
        //Calcular población total
        System.out.println(provinciaCoruna.getNombre() + ": " + provinciaCoruna.calcularCensoPoblaciónDepartamento() + " habitantes.");
        
        System.out.println("------");

        //Buscar municipio con población mayor a un límite
        System.out.println("Municipios en Lugo con más de 50.000 habitantes:");
        provinciaLugo.buscarMunicipioConPoblaciónMayor(50000);

        System.out.println("------");
        
        // Buscar un municipio específico
        System.out.println("Buscando información de Santiago:");
        provinciaCoruna.buscarMunicipio("Santiago de Compostela");

        System.out.println("------");

        //Eliminar un municipio y recalcular
        System.out.println("Censo de Lugo: " + provinciaLugo.calcularCensoPoblaciónDepartamento());
        System.out.println("Eliminando Monforte de Lemos de Lugo...");
        provinciaLugo.eliminarMunicipio("Monforte de Lemos");
        System.out.println("Nuevo censo de Lugo: " + provinciaLugo.calcularCensoPoblaciónDepartamento());

        System.out.println("------");

        // Departamento vacio
        System.out.println("Censo de " + provinciaOurense.getNombre() + ": " + provinciaOurense.calcularCensoPoblaciónDepartamento());
    }
}