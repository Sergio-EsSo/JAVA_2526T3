package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel("Base (cms):");
        base.setBounds(20, 20, 100, 23);
        campoBase = new JTextField();
        campoBase.setBounds(120, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 60, 100, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 60, 135, 23);

        apotema = new JLabel("Apotema (cms):");
        apotema.setBounds(20, 100, 100, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 100, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 140, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3): 0,00");
        volumen.setBounds(20, 180, 240, 23);

        superficie = new JLabel("Superficie (cm2): 0,00");
        superficie.setBounds(20, 215, 240, 23);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                double b = Double.parseDouble(campoBase.getText());
                double h = Double.parseDouble(campoAltura.getText());
                
                Piramide p = new Piramide(b, h);
                
                volumen.setText(String.format("Volumen (cm3): %.2f", p.calcularVolumen()));
                superficie.setText(String.format("Superficie (cm2): %.2f", p.calcularSuperficie()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}