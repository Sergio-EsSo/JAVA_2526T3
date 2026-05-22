package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCubo extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lado, volumen, superficie;
    private JTextField campoLado;
    private JButton calcular;

    public VentanaCubo() {
        inicio();
        setTitle("Cubo");
        setSize(300, 230); // Se reduce un poco el alto al requerir menos campos
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lado = new JLabel("Lado (cms):");
        lado.setBounds(20, 20, 100, 23);
        campoLado = new JTextField();
        campoLado.setBounds(120, 20, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 60, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3): 0,00");
        volumen.setBounds(20, 110, 240, 23);

        superficie = new JLabel("Superficie (cm2): 0,00");
        superficie.setBounds(20, 145, 240, 23);

        contenedor.add(lado);
        contenedor.add(campoLado);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            try {
                double l = Double.parseDouble(campoLado.getText());
                
                Cubo c = new Cubo(l);
                                
                volumen.setText(String.format("Volumen (cm3): %.2f", c.calcularVolumen()));
                superficie.setText(String.format("Superficie (cm2): %.2f", c.calcularSuperficie()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}