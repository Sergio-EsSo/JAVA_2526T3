package gui1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private ListaPersonas lista; // El objeto ListaPersonas de la aplicación
    private Container contenedor; /*
                                   * Un contenedor de elementos
                                   * gráficos
                                   */
    // Etiquetas estáticas para los nombres de los atributos
    private JLabel nombre, apellidos, telefono, direccion;
    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    private JButton annadir, eliminar, borrarLista, cargar, guardar; // Botones
    private JList<String> listaNombres; // Lista de personas
    private DefaultListModel<String> modelo; // Objeto que modela la lista
    private JScrollPane scrollLista; // Barra de desplazamiento verticalInterfaz gráfica de usuario 471

    /**
    * Constructor de la clase VentanaPrincipal
    */
    public VentanaPrincipal(){
        lista = new ListaPersonas(); // Crea la lista de personas

        //LLAMADA A LA PREPARACION DE LA VENTANA
        inicio();

        setTitle("Personas"); // Establece el título de la ventana
        setSize(270,390); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el
        centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); /* Establece que el tamaño de la ventana no
        se puede cambiar */
    }

    /**
    * Método que crea la ventana con sus diferentes componentes
    * gráficos
    */
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de
        contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el panel no tiene
        asociado ningún layout */
        // Establece la etiqueta y el campo nombre
        nombre = new JLabel();
        nombre.setText("Nombre: ");
        nombre.setBounds(20, 20, 135, 23); /* Establece la posición de
        la etiqueta nombre */
        campoNombre = new JTextField();
        // Establece la posición del campo de texto nombre
        campoNombre.setBounds(105, 20, 135, 23);
        // Establece la etiqueta y el campo apellidos
        apellidos = new JLabel();
        apellidos.setText("Apellidos: "); /* Establece la posición de la
        etiqueta apellidos */
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        // Establece la posición del campo de texto apellidos
        campoApellidos.setBounds(105, 50, 135, 23);
        // Establece la etiqueta y el campo teléfono
        telefono = new JLabel();
        telefono.setText("Teléfono: ");
        telefono.setBounds(20, 80, 135, 23); /* Establece la posición de
        la etiqueta teléfono */
        campoTelefono = new JTextField();
        // Establece la posición del campo de texto teléfono
        campoTelefono.setBounds(105, 80, 135, 23);
        // Establece la etiqueta y el campo dirección
        direccion = new JLabel();
        direccion.setText("Dirección: ");
        direccion.setBounds(20, 110, 135, 23); /* Establece la posición
        de la etiqueta dirección */
        campoDireccion = new JTextField();
        // Establece la posición del campo de texto dirección
        campoDireccion.setBounds(105, 110, 135, 23);
        // Establece el botón Añadir persona
        annadir = new JButton();
        annadir.setText("Añadir");
        annadir.setBounds(105, 150, 80, 23); /* Establece la posición del
        botón Añadir persona */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        annadir.addActionListener(this);
        // Establece el botón Eliminar persona
        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23); /* Establece la posición del
        botón Eliminar persona */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        eliminar.addActionListener(this);
        // Establece el botón Borrar lista
        borrarLista= new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23); /* Establece la
        posición del botón Borrar lista */
        /* Agrega al botón un ActionListener para que gestione eventos
        del botón */
        borrarLista.addActionListener(this);

        //NUEVO

        // Establece el botón cargar lista
        cargar = new JButton();
        cargar.setText("Cargar Lista");
        cargar.setBounds(20, 280, 80, 23); 
        cargar.addActionListener(this);

        // Establece el botón guardar lista
        guardar = new JButton();
        guardar.setText("Guardar Lista");
        guardar.setBounds(120, 280, 120, 23); 
        guardar.addActionListener(this);

        //boton añadir
        annadir = new JButton();
        annadir.setText("Añadir");
        annadir.setBounds(105, 150, 80, 23);
        annadir.addActionListener(this);

        // Botón Eliminar
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 280, 80, 23);
        eliminar.addActionListener(this);

        // Botón Borrar Lista
        borrarLista = new JButton("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23);
        borrarLista.addActionListener(this);

        // Botón Cargar Lista (Movido hacia abajo para que no se superponga)
        cargar = new JButton("Cargar");
        cargar.setBounds(20, 315, 80, 23); 
        cargar.addActionListener(this);

        // Botón Guardar Lista (Movido hacia abajo para que no se superponga)
        guardar = new JButton("Guardar");
        guardar.setBounds(120, 315, 120, 23); 
        guardar.addActionListener(this);


        // Establece la lista gráfica de personas
        listaNombres = new JList<>();
        /* Establece que se pueda seleccionar solamente un elemento de
        la lista */
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel<>();
        // Establece una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        // Establece la posición de la barra de desplazamiento vertical
        scrollLista.setBounds(20, 190 ,220, 80);
        // Asocia la barra de desplazamiento vertical a la lista de personas
        scrollLista.setViewportView(listaNombres);
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(annadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);

        //añade los botones
        contenedor.add(cargar);
        contenedor.add(guardar);
    }

    /**
    * Método que gestiona los eventos generados en la ventana principal
    */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == annadir) { // Si se pulsa el botón añadir
            añadirPersona(); // Se invoca añadir persona
        }
        if (evento.getSource() == eliminar) { /* Si se pulsa el botón
            eliminar */
            /* Se invoca el método eliminarNombre que elimina el
            elemento seleccionado */
            eliminarNombre(listaNombres.getSelectedIndex() );
        }
        if (evento.getSource() == borrarLista) { /* Si se pulsa el botón
            borrar lista */
            borrarLista(); // Se invoca borrar lista
        }

        //NUEVOS
        if (evento.getSource() == guardar) { // <--- NUEVO
            guardarListaEnArchivo();
        }
        if (evento.getSource() == cargar) {  // <--- NUEVO
            cargarListaDesdeArchivo();
        }
    }

    /**
    * Método que agrega una persona al vector de personas y a la lista
    * gráfica de personas
    */
    private void añadirPersona() {
        /* Se obtienen los campos de texto ingresados y se crea una
        persona */
        Persona p = new Persona(campoNombre.getText(),
        campoApellidos.getText(),
        campoTelefono.getText(), campoDireccion.getText());
        lista.añadirPersona(p); /* Se añade una persona al vector de
        personas */
        String elemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTelefono.getText() + "-" + campoDireccion.getText();
        modelo.addElement(elemento); /* Se agrega el texto con los
        datos de la persona al JList */
        listaNombres.setModel(modelo);
        // Se colocan todos los campos de texto nulos
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }

    /**
    * Método que elimina una persona del vector de personas y de la
    * lista gráfica de personas en la ventana
    * @param indice Parámetro que define la posición de la persona a
    * eliminar
    */
    private void eliminarNombre(int indice) {
        if (indice >= 0) { // Si la posición existe
        modelo.removeElementAt(indice); /* Se elimina la persona
        seleccionada de la lista gráfica */
        lista.eliminarPersona(indice); /* Se elimina la persona
        seleccionada del vector de personas */
        } else { /* Si no se seleccionó ninguna persona, se genera un
        mensaje de error */
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que elimina todas las personas del vector de personas
     */
    private void borrarLista() {
        lista.borrarLista(); // Se eliminan todas las personas del vector
        modelo.clear(); // Limpia el JList, la lista gráfica de personas
    }

    /**
     * Llama al método para guardar los datos en el archivo .dat
     */
    private void guardarListaEnArchivo() {
        try {
            lista.guardarEnFicher();;
            JOptionPane.showMessageDialog(this, "Lista guardada exitosamente en personal.dat", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Carga los datos del archivo .dat y regenera la lista visual (JList)
     */
    private void cargarListaDesdeArchivo() {
        try {
            lista.cargarDesdeFichero();
            
            // Limpiamos el modelo visual actual
            modelo.clear();
            
            // Recorremos la lista recuperada para rellenar el JList de la ventana
            for (Persona p : lista.getListaPersonas()) {
                String elemento = p.nombre + "-" + p.apellidos + "-" + p.telefono + "-" + p.direccion;
                modelo.addElement(elemento);
            }
            listaNombres.setModel(modelo);
            
            JOptionPane.showMessageDialog(this, "Lista cargada exitosamente desde personal.dat", "Carga Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.io.FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo 'personal.dat'. ¡Guarda algo primero!", "Archivo no encontrado", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}