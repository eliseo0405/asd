/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Sistemas10
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

    private JPanel miPanel;
    private JMenuBar barraMenu;
    private JMenu menuArchivo, menuEdicion, menuAcercaDe, subMenuGirar, menuOpciones;
    //Declarar items del menu archivo
    private JMenuItem menuItemNuevo, menuItemAbrir, menuItemGuardar, itemSalir;
    //Items de menu ediciòn
    private JMenuItem menuItemCopiar, menuItemPegar, menuItemGirar1, menuItemGirar2;
    //Items del menu Acerca De...
    private JMenuItem menuItemAplicacion, menuItemBlog;
    //items del menu opciones
    private JRadioButtonMenuItem jRadioButtonMenu1, jRadioButtonMenu2;
    private JCheckBoxMenuItem jCheckMenu1, jCheckMenu2;
    private JPopupMenu menuEmergencia;
    private JMenuItem itemEmergente1, itemEmergente2;
    
    private JLabel labelArchivo, labelEdicion, labelOpciones, titulo;
    private JLabel labelArchivoSeleccionado, labelEdicionSeleccionado, labelOpcionesCheckSeleccionadas,
            labelOpcionesRadioSeleccionadas;
    
    //Cadenas para asignar los resultados de eventos
    String cadenaArchivo = "";
    String cadenaEdicion = "";
    String cadenaOpcionesCheck = "";
    String cadenaOpcionesRadio = "";
    String cadenaCheck1 = "";
    String cadenaCheck2 = "";
    String cadenaRadio1 = "";
    String cadenaRadio2 = "";
    String informacionAplicacion = "";
    String informacionAcercaDe = "";
    
    
    public VentanaPrincipal(){
    iniciarComponentes();
    setTitle("Componentes de Menù");
    setSize(400, 200);
    //crear en el centro
    setLocationRelativeTo(null);
    //no cambia tamaño de ventana
    setResizable(false);
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
       eventosMenuArchivo(e);
       labelArchivoSeleccionado.setText(cadenaArchivo);
       
       eventosMenuEdicion(e);
       labelEdicionSeleccionado.setText(cadenaEdicion);
       
       eventosMenuOpciones(e);
       labelOpcionesCheckSeleccionadas.setText(cadenaOpcionesCheck);
       labelOpcionesRadioSeleccionadas.setText(cadenaOpcionesRadio);
       
       if(e.getSource() == menuItemAplicacion){
           JOptionPane.showMessageDialog(null, informacionAplicacion, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
       
       }
       if(e.getSource() == menuItemBlog){
           JOptionPane.showMessageDialog(null, informacionAcercaDe, "Programación 2", JOptionPane.WARNING_MESSAGE);
       
       }
       if(e.getSource() == itemEmergente1){
           JOptionPane.showMessageDialog(null, "Presione la Opción 1");
       
       }
       if(e.getSource() == itemEmergente2){
           JOptionPane.showMessageDialog(null, "Presione la Opción 2");
       
       }
    }

    private void iniciarComponentes() {
        informacionAplicacion = "Esta es una aplicación sencilla con el fin de exponer \n";
        informacionAplicacion += "el funcionamiento básico de los componentes de Menú";
        
        informacionAcercaDe = "Desarrolado por el Grupo 2T1";
        
        miPanel = new JPanel();
        miPanel.setLayout(null);
        barraMenu = new JMenuBar();
        menuArchivo = new JMenu();
        menuEdicion = new JMenu();
        menuAcercaDe = new JMenu();
        subMenuGirar = new JMenu();
        menuOpciones = new JMenu();
        menuItemNuevo = new JMenuItem();
        menuItemAbrir = new JMenuItem();
        menuItemGuardar = new JMenuItem();
        itemSalir = new JMenuItem();
        
        menuItemCopiar = new JMenuItem();
        menuItemPegar = new JMenuItem();
        menuItemGirar1 = new JMenuItem();
        menuItemGirar2 = new JMenuItem();
        
        menuItemAplicacion = new JMenuItem();
        menuItemBlog = new JMenuItem();
        
        menuEmergencia = new JPopupMenu();
        itemEmergente1 = new JMenuItem();
        itemEmergente2 = new JMenuItem();
        
        titulo = new JLabel();
        labelArchivo = new JLabel();
        labelEdicion = new JLabel();
        labelOpciones = new JLabel();
        
        labelArchivoSeleccionado = new JLabel();
        labelEdicionSeleccionado = new JLabel();
        labelOpcionesCheckSeleccionadas = new JLabel();
        labelOpcionesRadioSeleccionadas = new JLabel();
        
        titulo.setBounds(10, 0, 80, 30);
        titulo.setText("-- MENÚ --");
        labelArchivo.setBounds(10, 20, 80, 30);
        labelArchivo.setText("Archivo: ");
        labelEdicion.setBounds(10, 40, 80, 30);
        labelEdicion.setText("Edición: ");
        labelOpciones.setBounds(10, 60, 80, 30);
        labelOpciones.setText("Opciones: ");
        labelArchivoSeleccionado.setBounds(70, 20, 200, 30);
        labelEdicionSeleccionado.setBounds(70, 40, 200, 30);
        labelOpcionesCheckSeleccionadas.setBounds(75, 60, 200, 30);
        labelOpcionesRadioSeleccionadas.setBounds(75, 80, 200, 30);
        
        menuItemNuevo.setText("Nuevo");
        menuArchivo.add(menuItemNuevo);
        menuArchivo.addSeparator();
        
        menuItemAbrir.setText("Abrir");
        menuArchivo.add(menuItemAbrir);
        menuArchivo.addSeparator();
        
        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.addSeparator();
        
        itemSalir.setText("Salir");
        menuArchivo.add(itemSalir);
        
        menuItemCopiar.setText("Copiar");
        menuEdicion.add(menuItemCopiar);
        
        menuItemPegar.setText("Pegar");
        menuEdicion.add(menuItemPegar);
        
        menuItemGirar1.setText("Vertical");
        subMenuGirar.add(menuItemGirar1);
        
        menuItemGirar2.setText("Vertical");
        subMenuGirar.add(menuItemGirar2);
        
        subMenuGirar.setText("Girar");
        menuEdicion.add(subMenuGirar);
        
        menuOpciones.addSeparator();
        jCheckMenu1 = new JCheckBoxMenuItem("Check1");
        menuOpciones.add(jCheckMenu1);
        
        menuOpciones.addSeparator();
        jCheckMenu2 = new JCheckBoxMenuItem("Check2");
        menuOpciones.add(jRadioButtonMenu2);
        
        menuOpciones.addSeparator();
        ButtonGroup grupoRadios = new ButtonGroup();
        
        jRadioButtonMenu1 = new JRadioButtonMenuItem("Radio1");
        grupoRadios.add(jRadioButtonMenu1);
        menuOpciones.add(jRadioButtonMenu1);
        
        jRadioButtonMenu2 = new JRadioButtonMenuItem("Radio2");
        grupoRadios.add(jRadioButtonMenu2);
        menuOpciones.add(jRadioButtonMenu2);
        
        itemEmergente1.setText("Opción Emergente 1");
        menuEmergencia.add(itemEmergente1);
        
        itemEmergente2.setText("Opcion Emergente 2");
        menuEmergencia.add(itemEmergente2);
        
        menuItemAplicacion.setText("Aplicación");
        menuAcercaDe.add(menuItemAplicacion);
        
        menuItemBlog.setText("Programación II");
        menuAcercaDe.add(menuItemBlog);
        
        menuArchivo.setText("Archivo");
        barraMenu.add(menuArchivo);
        
        menuEdicion.setText("Edición");
        barraMenu.add(menuEdicion);
        
        
        menuOpciones.setText("Opciones");
        barraMenu.add(menuOpciones);
        
        
        menuAcercaDe.setText("Acerca de...");
        barraMenu.add(menuAcercaDe);
        
        setJMenuBar(barraMenu);
        
        miPanel.add(titulo);
        miPanel.add(labelArchivo);
        miPanel.add(labelEdicion);
        miPanel.add(labelOpciones);
        miPanel.add(labelArchivoSeleccionado);
        miPanel.add(labelEdicionSeleccionado);
        miPanel.add(labelOpcionesCheckSeleccionadas);
        miPanel.add(labelOpcionesRadioSeleccionadas);
        miPanel.setComponentPopupMenu(menuEmergencia);
        add(miPanel); 
        
        menuItemNuevo.addActionListener(this);
        menuItemAbrir.addActionListener(this);
        menuItemGuardar.addActionListener(this);
        itemSalir.addActionListener(this);
        
        menuItemCopiar.addActionListener(this);
        menuItemPegar.addActionListener(this);
        menuItemGirar1.addActionListener(this);
        menuItemGirar2.addActionListener(this);
        
        menuItemAplicacion.addActionListener(this);
        menuItemBlog.addActionListener(this);
        jCheckMenu1.addActionListener(this);
        jCheckMenu2.addActionListener(this);
        jRadioButtonMenu1.addActionListener(this);
        jRadioButtonMenu2.addActionListener(this);
        
        itemEmergente1.addActionListener(this);
        itemEmergente2.addActionListener(this);
        
    }

    private void eventosMenuArchivo(ActionEvent e) {
     if(e.getSource() == menuItemNuevo){
           cadenaArchivo = "" + menuItemNuevo.getText();
       }
     if(e.getSource() == menuItemAbrir){
           cadenaArchivo = "" + menuItemAbrir.getText();
       }
     if(e.getSource() == menuItemNuevo){
           cadenaArchivo = "" + menuItemGuardar.getText();
       }
     if(e.getSource() == menuItemGuardar){
           cadenaArchivo = "" + menuItemGuardar.getText();
       }
     if(e.getSource() == menuItemNuevo){
           cadenaArchivo = "" + menuItemNuevo.getText();
       }
     if(e.getSource() == itemSalir){
           cadenaArchivo = "" + itemSalir.getText();
       }
    }

    private void eventosMenuEdicion(ActionEvent e) {
        if(e.getSource() == jCheckMenu1){
            if(jCheckMenu1.getState()){
                cadenaCheck1 = jCheckMenu1.getText() + "is true";
            } else {
                cadenaCheck1 = jCheckMenu1.getText() + "if False";
            }
        }
        if(e.getSource() == jCheckMenu2){
            if(jCheckMenu2.getState()){
                cadenaCheck2 = jCheckMenu2.getText() + "is true";
            } else {
                cadenaCheck2 = jCheckMenu2.getText() + "if False";
            }
        }
        cadenaOpcionesCheck = cadenaCheck1 + ", "+ cadenaCheck2;
        
        
        
    }

    private void eventosMenuOpciones(ActionEvent e) {
        
    }
    
}
