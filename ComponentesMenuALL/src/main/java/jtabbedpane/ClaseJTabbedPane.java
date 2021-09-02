/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtabbedpane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sistemas10
 */
public class ClaseJTabbedPane extends JFrame{
    private JPanel miPanel, panel1, panel2;
    JLabel lblTitulo, tituloPanel, tituloPanel2;
    private JButton miBotonPanel2;
    private JTextArea areaDeTexto;
    String texto;
    
    
    public ClaseJTabbedPane(){
        JTabbedPane pestañas = new JTabbedPane();
        componentesPanel1();
        componentesPanel2();
        componentesPanel3();
        
        pestañas.add("Pestaña 1", miPanel);
        pestañas.add("Pestaña 2", panel1);
        pestañas.add("Pestaña 3", panel2);
        
        getContentPane().add(pestañas);
        setTitle("JTabbedPane");
        setSize(420, 250);
        setLocationRelativeTo(null);
    }

    private void componentesPanel1() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        lblTitulo = new JLabel();
        lblTitulo.setText("Contenedor JTabbedPane");
        lblTitulo.setBounds(120, 20, 180, 23);
        
        texto = "Este contenedor presenta una ventana con pestañas en su \n"+
                "barra de tareas, cada pestaña presenta un panel diferente \n"+
                "donde se pueden almacenar otros componentes Java Swing";
        
        areaDeTexto = new JTextArea();
        areaDeTexto.setText(texto);
        areaDeTexto.setEditable(false);
        areaDeTexto.setBounds(20, 50, 350, 100);
        
        miPanel.add(lblTitulo);
        miPanel.add(areaDeTexto);
        add(miPanel);
    }

    private void componentesPanel2() {
       panel1 = new JPanel();
       panel1.setBounds(50, 50, 200, 150);
       panel1.setBackground(Color.red);
       
       tituloPanel = new JLabel();
       tituloPanel.setText("Titulo Panel 1");
       tituloPanel.setBounds(40, 20, 90, 23);
       
       panel1.add(tituloPanel);
    }

    private void componentesPanel3() {
         
       panel2 = new JPanel();
       panel2.setLayout(null);
       panel2.setBounds(280, 50, 200, 150);
       panel2.setBackground(Color.red);
       
       tituloPanel2 = new JLabel();
       tituloPanel2.setText("Titulo Panel 2");
       tituloPanel2.setBounds(60, 20, 90, 23);
       
       miBotonPanel2 = new JButton();
       miBotonPanel2.setText("MAMADA");
       miBotonPanel2.setBounds(50, 80, 90, 23);
       
       panel2.add(tituloPanel2);
       panel2.add(miBotonPanel2);
    }
}
