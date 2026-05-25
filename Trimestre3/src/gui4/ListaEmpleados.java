package gui4;

import java.util.ArrayList;

public class ListaEmpleados {
    public ArrayList<Empleado> lista;
    public double totalNomina = 0;

    public ListaEmpleados() {
        lista = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado a) {
        lista.add(a);
    }

    public double calcularTotalNomina() {
        double total = 0;
        for (Empleado e : lista) {
            total += e.calcularNomina();
        }
        return total;
    }

    public String[][] obtenerMatriz() {
        String datos[][] = new String[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            Empleado e = (Empleado) lista.get(i);
            datos[i][0] = e.getNombre();
            datos[i][1] = e.getApellidos();
            datos[i][2] = Double.toString(e.calcularNomina());
        }
        return datos;
    }

    public String convertirTexto() {
        StringBuilder texto = new StringBuilder();
        for (Empleado e : lista) {
            texto.append("Nombre = ").append(e.getNombre()).append("\n")
                 .append("Total nómina = $").append(String.format("%.2f", calcularTotalNomina()));
        }
        return texto.toString();
    }
}