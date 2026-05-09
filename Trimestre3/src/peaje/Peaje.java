package peaje;

import java.util.ArrayList;
import java.util.List;

public class Peaje {

	String nombre;
	String departamento;
	
	List<Vehiculo> vehiculos = new ArrayList<>();
	
	int totalPeaje = 0;
	static int totalCamiones = 0;
	static int totalMotos = 0;
	static int totalCarros = 0;

    //constructor
	Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.vehiculos = new ArrayList<>();
	}

    //getters + setters
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nom) {
		this.nombre = nom;
	}
	public String getDepartamento() {
		return departamento;
	}
	private void setDepartamento(String dept) {
		this.departamento = dept;
	}
	public void anadirVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public int calcularPeaje(Vehiculo vehiculo) {
		if (vehiculo instanceof Carro) {
			totalCarros++;
			totalPeaje += Carro.valorPeaje;
			return Carro.valorPeaje;
		} 
        else if (vehiculo instanceof Moto) {
			totalMotos++;
			totalPeaje += Moto.valorPeaje;
			return Moto.valorPeaje;
		} 
        else if (vehiculo instanceof Camion) {
			totalCamiones++;
			Camion camion = (Camion) vehiculo;
			int peajeCamion = camion.numeroEjes * camion.valorPeajeEje;
			totalPeaje += peajeCamion;
			return peajeCamion;
		} 
        else {
			return -1;
		}
	}

	public void imprimir() {
		System.out.println("Peaje = " + getNombre());
		System.out.println("Ubicación = " + getDepartamento());
		System.out.println("Total de carros = " + totalCarros);
		System.out.println("Total de motos = " + totalMotos);
		System.out.println("Total de camiones = " + totalCamiones);
		
		int totalVehiculos = totalCarros + totalMotos + totalCamiones;
		System.out.println("Total de vehículos = " + totalVehiculos);
		System.out.println("Dinero total = $" + totalPeaje);
	}
}