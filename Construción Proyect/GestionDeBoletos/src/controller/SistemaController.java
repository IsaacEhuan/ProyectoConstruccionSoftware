/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Sistema;
import view.LogInView;

/**
 *
 * @author isaac
 */
public class SistemaController {
    String ruta = "C:\\Users\\isaac\\OneDrive\\Escritorio\\"; //C:\\Users\\isaac\\OneDrive\\Escritorio\\
    String nombreArchivo = "Usuarios.txt";
    LogInView login;
    Sistema sistema;
    
    public SistemaController() throws IOException{
        this.login = new LogInView();
        this.sistema = new Sistema(ruta,nombreArchivo);
        login.getVerificarUser().addActionListener((ActionListener) this);
    }
    
    public void iniciar(){
        login.setVisible(true);
    }
    
    public void cerrarVentana(){
        login.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        //Código de ejecución.
        if(e.getSource() == login.getVerificarUser()){
            String usuario = login.getUsuario().getText();
            String contrasenia = login.getContrasenia().getText();
            if(sistema.verificarArchivoUsuario(usuario, contrasenia)){
                //función de iniciar sesión.
                JOptionPane.showMessageDialog(login, "Error de inicio de sesión", "Error", 1);
            }else{
                JOptionPane.showMessageDialog(login, "Error de inicio de sesión", "Error", 0);
            }
        }
    }
}
