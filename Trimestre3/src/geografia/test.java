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

        // --- PRUEBAS DE FUNCIONAMIENTO ---

        System.out.println("--- Informe de Galicia ---");
        
        // Prueba 1: Calcular población total
        System.out.println("Censo en " + provinciaCoruna.getNombre() + ": " + 
                           provinciaCoruna.calcularCensoPoblaciónDepartamento() + " habitantes.");
        
        // Prueba 2: Buscar municipio con población mayor a un límite
        System.out.println("\nMunicipios en Lugo con más de 50.000 habitantes:");
        provinciaLugo.buscarMunicipioConPoblaciónMayor(50000);

        // Prueba 3: Buscar un municipio específico
        System.out.println("\nBuscando información de Santiago:");
        provinciaCoruna.buscarMunicipio("Santiago de Compostela");

        // Prueba 4: Eliminar un municipio y recalcular
        System.out.println("\nEliminando Monforte de Lemos de Lugo...");
        provinciaLugo.eliminarMunicipio("Monforte de Lemos");
        System.out.println("Nuevo censo de Lugo: " + provinciaLugo.calcularCensoPoblaciónDepartamento());

        // Prueba 5: Departamento vacío
        System.out.println("\nCenso de " + provinciaOurense.getNombre() + ": " + 
                           provinciaOurense.calcularCensoPoblaciónDepartamento());
    }
}