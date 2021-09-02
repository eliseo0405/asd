/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MaskFormatter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Sistemas10
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

    //almacenar elementos 
    private Container contenedor;
    private JLabel labelTitulo;
    
    private JLabel etiquetaTextField;
    private JLabel etiquetaFormattedTextField;
    private JLabel etiquetaCampoContraseña;
    private JLabel etiquetaJTextArea;
    private JLabel etiquetaTextPane;
    private JLabel etiquetaJEditorPane;
    
    //elementos usados
    private JTextField cajaDeTexto;
    private MaskFormatter mascara;
    private JFormattedTextField cajaDeTextoConFormato;
    private JPasswordField campocontraseña;
    private JTextArea areaDeTexto;
    private JEditorPane areaEditorPane;
    private JTextPane areaTextPane;
    private JCheckBox check1, check2;
    
    private JButton boton;
    
    
    
    
    public VentanaPrincipal(){
        
        iniciarComponentes();
        setTitle("JFrame Componentes de Texto");
        setSize(660, 510);
        //crear en el centro
        setLocationRelativeTo(null);
        //no cambia tamaño de ventana
        setResizable(false);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String retorno = "";
        retorno += "JTextField ="+cajaDeTexto.getText()+"\n";
        retorno += "JPasswordField Encriptado"+campocontraseña.getPassword()+"\n";
        retorno += "JFormattedField ="+cajaDeTexto.getText()+"\n";
        
        if(e.getSource() == boton){
            if(check1.isSelected()){
                retorno += "check1 seleccionado \n";
            }
            if(check2.isSelected()){
                retorno += "check2 seleccionado \n";
            }
            JOptionPane.showMessageDialog(null, retorno);
            areaDeTexto.setText(retorno);
        }
    }

    private void iniciarComponentes() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        labelTitulo = new JLabel();
        labelTitulo.setText("CoMpOnEnTeS dE tExTo Js");
        labelTitulo.setFont(new Font("Tahoma", 1, 20));
        labelTitulo.setBounds(160, 5, 380, 40);
        
        etiquetaTextField = new JLabel();
        etiquetaTextField.setText("JTextFild: ");
        etiquetaTextField.setBounds(20, 60, 280, 23);
        
        etiquetaFormattedTextField = new JLabel();
        etiquetaFormattedTextField.setText("JFormattedTextField: ");
        etiquetaFormattedTextField.setBounds(200, 60, 140, 23);
        
        etiquetaCampoContraseña = new JLabel();
        etiquetaCampoContraseña.setText("JPasswordField: ");
        etiquetaCampoContraseña.setBounds(430, 60, 120, 23);
        
        etiquetaJTextArea = new JLabel();
        etiquetaJTextArea.setText("JTextArea: ");
        etiquetaJTextArea.setBounds(20, 90, 100, 23);
        
        etiquetaJEditorPane = new JLabel();
        etiquetaJEditorPane.setText("JEditorPane: ");
        etiquetaJEditorPane.setBounds(100, 200, 100, 23);
        
        etiquetaTextPane = new JLabel();
        etiquetaTextPane.setText("JTextpane: ");
        etiquetaTextPane.setBounds(100, 60, 280, 23);
        
        
        cajaDeTexto = new JTextField();
        cajaDeTexto.setBounds(90, 60, 90, 23);
        
        //se usa para obligar al usuario escribir lo que queremos.
        try {
            mascara = new MaskFormatter("########");
            cajaDeTextoConFormato = new JFormattedTextField(mascara);
            cajaDeTextoConFormato.setBounds(330, 60, 80, 23);
            cajaDeTextoConFormato.setFocusLostBehavior(cajaDeTextoConFormato.COMMIT);
        } catch (ParseException ex) {
         ex.printStackTrace();
         //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        campocontraseña = new JPasswordField();
        campocontraseña.setBounds(530, 60, 80, 23);
        
        areaDeTexto = new JTextArea();
        areaDeTexto.setBounds(90, 90, 520, 103);
        
        areaEditorPane = new JEditorPane();
        areaEditorPane.setBounds(90, 200, 520, 103);
        areaEditorPane.setContentType("text/html");
        areaEditorPane.setText("<h1><b>Texto en Negrita y etiqueta H1<b><h1>" +
                "Texto Normal" + "<font color=\"blue\">Texto en color azul</font>" + 
                "<font face =\"verdana\">fuente verdana</font>");
        
        //creando estilo para el panel de texto
        StyleContext estilo = new StyleContext();
        Style estiloRojo = estilo.addStyle(null, null);
        StyleConstants.setForeground(estiloRojo, Color.red);
        
        DefaultStyledDocument estiloPorDefecto = new DefaultStyledDocument(estilo);
        areaTextPane = new JTextPane(estiloPorDefecto);
        areaTextPane.setCharacterAttributes(estiloRojo, false);
        areaTextPane.setBounds(90, 310, 520, 103);
        
        try {
            areaTextPane.getStyledDocument().insertString(areaTextPane.getStyledDocument().getLength(), 
                    "Texto con Estilo rojo, seleccione un check", estiloRojo);
        } catch (BadLocationException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
        check1 = new JCheckBox("check1");
        areaTextPane.insertComponent(check1);
        
        areaTextPane.setCaretPosition(areaTextPane.getStyledDocument().getLength());
        check2 = new JCheckBox("check2");
        areaTextPane.insertComponent(check2);
        
        boton = new JButton();
        boton.setText("Enviar");
        boton.setBounds(530, 430, 80, 23);
        boton.addActionListener(this);
        
        contenedor.add(labelTitulo);
        contenedor.add(boton);
        contenedor.add(cajaDeTexto);
        contenedor.add(cajaDeTextoConFormato);
        contenedor.add(campocontraseña);
        contenedor.add(areaDeTexto);
        contenedor.add(areaEditorPane);
        contenedor.add(areaTextPane);
        contenedor.add(etiquetaCampoContraseña);
        contenedor.add(etiquetaFormattedTextField);
        contenedor.add(etiquetaJEditorPane);
        contenedor.add(etiquetaJTextArea);
        contenedor.add(etiquetaTextField);
        contenedor.add(etiquetaTextPane);
    }
    
}
