package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, cono, cubo, prisma;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(450, 200);
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

        cono = new JButton("Cono");
        cono.addActionListener(this);

        cubo = new JButton("Cubo");
        cubo.addActionListener(this);

        prisma = new JButton("Prisma");
        prisma.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(cono);
        contenedor.add(cubo);
        contenedor.add(prisma);
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
        } else if (evento.getSource() == cono) {
            VentanaCono vCono = new VentanaCono();
            vCono.setVisible(true);
        } else if (evento.getSource() == cubo) {
            VentanaCubo vCubo = new VentanaCubo();
            vCubo.setVisible(true);
        } else if (evento.getSource() == prisma) {
            VentanaPrisma vPrisma = new VentanaPrisma();
            vPrisma.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}