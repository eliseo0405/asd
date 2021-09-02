/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsplitpane;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sistemas10
 */
public class claseJSplitPane extends JFrame {
    JSplitPane splitpane;
    JTextArea areaDeTexto;
    String texto;
    JLabel lblTitulo, tituloPanel1, titulopanel2;
    
    
    public claseJSplitPane(){
        setTitle("JSplitPane");
        setSize(600, 300);
        setLocationRelativeTo(null);
        iniciaComponentes();
    }

    private void iniciaComponentes() {
        splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        inicialPanel1();
        splitpane.add(lblTitulo);
        splitpane.add(areaDeTexto);
        getContentPane().add(splitpane, BorderLayout.CENTER);
        
    }

    private void inicialPanel1() {
      lblTitulo = new JLabel();
      lblTitulo.setText("Contenedor JSplitPane");
      texto = "Este contenedor presenta una ventana con pestañas en \n" + 
              "su barra de tareas, cada pestaña presenta un panel diferente \n" +
              "donde se pueden almacenar otros componentes -Java Swing- ";
      
      areaDeTexto = new JTextArea();
      areaDeTexto.setText(texto);
      areaDeTexto.setEditable(false);
    }
   
}
