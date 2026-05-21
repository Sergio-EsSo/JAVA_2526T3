package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro;
    private JButton esfera;
    private JButton piramide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(450, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));

        cilindro = new JButton("Cilindro");
        cilindro.addActionListener(this);

        esfera = new JButton("Esfera");
        esfera.addActionListener(this);

        piramide = new JButton("Pirámide");
        piramide.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == cilindro) {
            VentanaCilindro vCilindro = new VentanaCilindro();
            vCilindro.setVisible(true);
        } else if (evento.getSource() == esfera) {
            VentanaEsfera vEsfera = new VentanaEsfera();
            vEsfera.setVisible(true);
        } else if (evento.getSource() == piramide) {
            VentanaPiramide vPiramide = new VentanaPiramide();
            vPiramide.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}