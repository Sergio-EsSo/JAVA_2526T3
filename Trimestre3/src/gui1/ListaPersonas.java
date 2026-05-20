package gui1;

import java.util.ArrayList;

public class ListaPersonas {
	ArrayList<Persona> listaPersonas; // Atributo que identifica un vector de personas

	public ListaPersonas() {
		listaPersonas = new ArrayList<>(); // Crea el vector de personas
	}

	public void añadirPersona(Persona p) {
		listaPersonas.add(p);
	}

	public void eliminarPersona(int i) {
		listaPersonas.remove(i);
	}

	public void borrarLista() {
		listaPersonas.clear();
	}

	public ArrayList<Persona> getListaPersonas(){
		return listaPersonas;
	}

	public void guardarEnFicher() throws java.io.IOException {
		try(java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(
			new java.io.FileOutputStream("personal.dat")
		)){
			oos.writeObject(listaPersonas);
		}
	}

	@SuppressWarnings("unchecked")
	public void cargarDesdeFichero() throws java.io.IOException, ClassNotFoundException {
		try(java.io.ObjectInputStream ois = new java.io.ObjectInputStream(
			new java.io.FileInputStream("personal.dat")
		)){
			listaPersonas = (ArrayList<Persona>) ois.readObject();
		}
	}
}