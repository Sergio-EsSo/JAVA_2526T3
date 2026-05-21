package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, volumen, superficie;
    private JTextField campoRadio;
    private JButton calcular;

    public VentanaEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(300, 220);
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

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 55, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3): 0,00");
        volumen.setBounds(20, 100, 240, 23);

        superficie = new JLabel("Superficie (cm2): 0,00");
        superficie.setBounds(20, 135, 240, 23);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                double r = Double.parseDouble(campoRadio.getText());
                
                Esfera e = new Esfera(r);
                
                volumen.setText(String.format("Volumen (cm3): %.2f", e.calcularVolumen()));
                superficie.setText(String.format("Superficie (cm2): %.2f", e.calcularSuperficie()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}