package gui4;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    ListaEmpleados empleados;
    private JButton btnAgregar, btnCalcular, btnGuardar;

    public VentanaPrincipal() {
        empleados = new ListaEmpleados();
        setTitle("Nómina");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        inicio();
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        btnAgregar = new JButton("Agregar empleado");
        btnCalcular = new JButton("Calcular nómina");
        btnGuardar = new JButton("Guardar archivo");

        contenedor.add(btnAgregar);
        contenedor.add(btnCalcular);
        contenedor.add(btnGuardar);

        btnAgregar.addActionListener(this);
        btnCalcular.addActionListener(this);
        btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnAgregar) {
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true);
        } else if (evento.getSource() == btnCalcular) {
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true);
        } else if (evento.getSource() == btnGuardar) {
            JFileChooser fc = new JFileChooser(); // Crea un selector de archivo
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            // Es un selector de directorio
            int respuesta = fc.showOpenDialog(this); // Se muestra el selector de directorio en pantalla
            if (respuesta == JFileChooser.APPROVE_OPTION) { // Si se pulsa aceptar en el selector
                File directorioElegido = fc.getSelectedFile(); // Se obtiene el directorio seleccionado
                String nombre = directorioElegido.getName(); // Se obtiene el nombre del directorio
                try {
                    // Convierte los datos de los empleados en texto
                    String contenido = empleados.convertirTexto();
                    // Se asigna el nombre del archivo de texto
                    File file = new File(nombre + "\\" + "Nomina.txt");
                    file.createNewFile(); // Se crea el archivo de texto
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw); // Se crea el flujo de escritura de datos
                    bw.write(contenido); // Se escriben los datos en el archivo
                    bw.close(); // Se cierra el archivo
                    String texto = "El archivo de la nómina Nomina.txt se ha creado en " + nombre;
                    // Mensaje de confirmación
                    JOptionPane.showMessageDialog(this, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                } catch (Exception e) {
                    /*
                     * En caso que se presente una excepción en la creación y escritura del archivo
                     */
                    e.printStackTrace();
                }
            }
        }
    }
}