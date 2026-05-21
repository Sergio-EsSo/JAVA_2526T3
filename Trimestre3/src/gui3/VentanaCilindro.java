package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, altura, volumen, superficie;
    private JTextField campoRadio, campoAltura;
    private JButton calcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(300, 260);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel("Radio (cms):");
        radio.setBounds(20, 20, 100, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(120, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 60, 100, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 60, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 100, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3): 0,00");
        volumen.setBounds(20, 140, 240, 23);

        superficie = new JLabel("Superficie (cm2): 0,00");
        superficie.setBounds(20, 175, 240, 23);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                double r = Double.parseDouble(campoRadio.getText());
                double h = Double.parseDouble(campoAltura.getText());
                
                Cilindro c = new Cilindro(r, h);
                
                volumen.setText(String.format("Volumen (cm3): %.2f", c.calcularVolumen()));
                superficie.setText(String.format("Superficie (cm2): %.2f", c.calcularSuperficie()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}