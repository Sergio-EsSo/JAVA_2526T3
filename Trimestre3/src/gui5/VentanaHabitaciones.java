package gui5;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaHabitaciones extends JFrame implements ActionListener {

    private Container contenedor;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemMenu1, itemMenu2;
    private Hotel hotel;

    public VentanaHabitaciones(Hotel hotel){
        this.hotel = hotel;
    }
}