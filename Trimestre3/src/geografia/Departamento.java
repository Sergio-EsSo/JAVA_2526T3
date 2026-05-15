package geografia;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	String nombre;
	List<Municipio> municipios;

	public Departamento(String nombre, ArrayList<Municipio> mun) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>(mun);
	}

	public String getNombre() {
	    return nombre;
	}
	private void setNombre(String nombre) {
	    this.nombre = nombre;
	}
    
	public void agregarMunicipio(Municipio municipio) {
	    municipios.add(municipio);
	}

	public void eliminarMunicipio(String nombre) {
        Municipio municipio;

        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.get(i);

            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break;
            }
        }
	}

	public void buscarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.get(i);

            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir();
                break;
            }
            if (!nombre.equals(municipio.getNombre())) { 
                System.out.println("Municipio no encontrado.");
            }
        }
	}

	public void buscarMunicipioConPoblaciónMayor(int población) {
        Municipio municipio;
        boolean encontróMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) { 
            municipio = (Municipio) municipios.get(i);
            if (municipio.getPoblación() >= población) {
                System.out.println(municipio.getNombre());
                encontróMunicipios = true;
            }
        }
        if (!encontróMunicipios) {
            System.out.println("No existen municipios con esta población");
        }
	}

	public int calcularCensoPoblaciónDepartamento() {
        Municipio municipio;
        int totalCenso = 0;
        for (int i = 0; i < municipios.size(); i++) { 
            municipio = (Municipio) municipios.get(i);
            totalCenso += municipio.getPoblación(); 
        }
	    return totalCenso; 
	}
}