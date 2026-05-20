package gui2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Notas notas;
    private Container contenedor;

    private JLabel nota1, nota2, nota3, nota4, nota5;
    private JLabel promedio, desviación, mayor, menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar;

    public VentanaPrincipal() {
        notas = new Notas();
        inicio();
        setTitle("Cálculo de Notas");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // labels y textfeilds
        nota1 = new JLabel("Nota 1:");
        nota1.setBounds(20, 20, 100, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(120, 20, 120, 23);

        nota2 = new JLabel("Nota 2:");
        nota2.setBounds(20, 50, 100, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(120, 50, 120, 23);

        nota3 = new JLabel("Nota 3:");
        nota3.setBounds(20, 80, 100, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(120, 80, 120, 23);

        nota4 = new JLabel("Nota 4:");
        nota4.setBounds(20, 110, 100, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(120, 110, 120, 23);

        nota5 = new JLabel("Nota 5:");
        nota5.setBounds(20, 140, 100, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(120, 140, 120, 23);

        // botones
        calcular = new JButton("Calcular");
        calcular.setBounds(20, 180, 100, 23);
        calcular.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(140, 180, 100, 23);
        limpiar.addActionListener(this);

        // resultaods
        promedio = new JLabel("Promedio:");
        promedio.setBounds(20, 220, 220, 23);

        desviación = new JLabel("Desviación:");
        desviación.setBounds(20, 245, 220, 23);

        mayor = new JLabel("Mayor:");
        mayor.setBounds(20, 270, 220, 23);

        menor = new JLabel("Menor:");
        menor.setBounds(20, 295, 220, 23);

        // componentes del contenedor
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        
        contenedor.add(calcular);
        contenedor.add(limpiar);
        
        contenedor.add(promedio);
        contenedor.add(desviación);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            
            // Asignacion de notas
            notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());

            // calculos
            promedio.setText(String.format("Promedio: %.2f", notas.calcularPromedio()));
            desviación.setText(String.format("Desviación: %.2f", notas.calcularDesviacion()));
            mayor.setText(String.format("Mayor: %.2f", notas.calcularMayor()));
            menor.setText(String.format("Menor: %.2f", notas.calcularMenor()));
            
        } else if (evento.getSource() == limpiar) {
            
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            
            promedio.setText("Promedio:");
            desviación.setText("Desviación:");
            mayor.setText("Mayor:");
            menor.setText("Menor:");
        }
    }
}