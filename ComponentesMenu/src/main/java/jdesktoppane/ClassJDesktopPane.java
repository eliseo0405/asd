/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdesktoppane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sistemas10
 */
public class ClassJDesktopPane extends JFrame implements ActionListener {
    JInternalFrame internalFrame, internalFrame2;
    JDesktopPane desktoppane;
    JPanel miPanel, panel1;
    JLabel lblTitulo, tituloPanel;
    JButton boton;
    JTextArea areaDeTexto;
    String texto;
    
    private JMenuBar barramenu;
    private JMenu menu;
    private JMenuItem menuItemVentana;
    int posA = 20, posB = 300;
    
    public ClassJDesktopPane(){
            desktoppane = new JDesktopPane();
            barramenu = new JMenuBar();
            menu = new JMenu();
            menuItemVentana = new JMenuItem();
            
            menuItemVentana.setText("Muestra Ventana 1");
            //agregar menuitem a menu
            menu.add(menuItemVentana);
            menuItemVentana.addActionListener(this);
            
            //agregar menu a barra menu
            menu.setText("Menú");
            barramenu.add(menu);
            setJMenuBar(barramenu);
            
            //llama el método para iniciar panel
            componentesPanel1();
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    private void componentesPanel1() {
       miPanel = new JPanel();
       miPanel.setLayout(null);
       
       lblTitulo = new JLabel();
       lblTitulo.setText("CONTENEDOR JDESKTOPPANE");
       lblTitulo.setBounds(posA, posA, WIDTH, HEIGHT);
    }
    
}
