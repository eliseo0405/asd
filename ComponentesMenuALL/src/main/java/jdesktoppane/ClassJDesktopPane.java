/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdesktoppane;

import java.awt.Color;
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
            componentesPanel2();
            
            internalFrame = new JInternalFrame("Ventana Interna 1");
            internalFrame.add(miPanel);
            internalFrame.setBounds(10, 20, 350, 200);
            
            internalFrame2 = new JInternalFrame("Ventana Interna 2");
            internalFrame2.add(miPanel);
            internalFrame2.setBounds(10, 300, 200, 100);
            internalFrame2.setResizable(true);
            internalFrame2.setClosable(true);
            
            desktoppane.add(internalFrame);
            desktoppane.add(internalFrame2);
            internalFrame.setVisible(true);
            internalFrame2.setVisible(true);
            getContentPane().add(desktoppane);
            
            setTitle("JDesktopPane");
            setSize(600, 700);
            setLocationRelativeTo(null);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuItemVentana){
            crearVentana2();
        }
    }

    private void componentesPanel1() {
       miPanel = new JPanel();
       miPanel.setLayout(null);
       
       lblTitulo = new JLabel();
       lblTitulo.setText("CONTENEDOR JDESKTOPPANE");
       lblTitulo.setBounds(90, 20, 180, 23);
       
       texto = "Este contenedor presenta una ventana principal \n"+
               "Junto con otras ventanas internas, cada ventana \n"+
               "será independiente y permite cambiar su posición\n"+
               "y tamaño (dependiendo de las prioridades asignadas";
       
       areaDeTexto = new JTextArea();
       areaDeTexto.setText(texto);
       areaDeTexto.setBounds(20, 50, 290, 100);
       miPanel.add(lblTitulo);
       miPanel.add(areaDeTexto);
       
    }

    private void componentesPanel2() {
       panel1 = new JPanel();
       panel1.setBounds(50, 50, 200, 150);
       panel1.setBackground(Color.cyan);
       
       tituloPanel = new JLabel();
       tituloPanel.setText("Título Panel1");
       tituloPanel.setBounds(40, 20, 90, 23);
       
       panel1.add(tituloPanel);
       
    }

    private void crearVentana2() {
        if(posA > 300){
            posA = 50;
            posB += 50;
        }
        posA+=50;
        internalFrame2 = new JInternalFrame("Ventana Interna 2");
        internalFrame2.add(panel1);
        internalFrame2.setBounds(posA, posB, 200, 100);
        internalFrame2.setResizable(true);
        internalFrame2.setClosable(true);
        desktoppane.add(internalFrame2);
        internalFrame2.setVisible(true);
    }
    
}
