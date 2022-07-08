/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;
import view.VistaInicioSesion;

/**
 *
 * @author Jahir Gómez
 */
public class ControladorInicioSesion implements ActionListener {
    VistaInicioSesion ventanaInicioSesion;
    ArrayList<Usuario> listaUsuarios;
    
    public ControladorInicioSesion(){
        this.ventanaInicioSesion = new VistaInicioSesion();
        this.listaUsuarios = new ArrayList<>();
        ventanaInicioSesion.getBotonIniciarSesion().addActionListener(this);
        //ventanaInicioSesion.getUsuarioCampo().addActionListener(this);
        //ventanaInicioSesion.getContraseniaCampo().addActionListener(this);
    }
    
    public void iniciar(){
        ventanaInicioSesion.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Código de ejecución.
        if(e.getSource() == ventanaInicioSesion.getBotonIniciarSesion()){
            String nombre = ventanaInicioSesion.getUsuarioCampo().getText();
            String contrasenia = ventanaInicioSesion.getContraseniaCampo().getText();
            JOptionPane.showMessageDialog(ventanaInicioSesion, "Botón presionado");
            if(validarSesion(nombre, contrasenia)){
                //función de iniciar sesión.
                JOptionPane.showMessageDialog(ventanaInicioSesion, "Error de inicio de sesión", "Error", 1);
            }else{
                JOptionPane.showMessageDialog(ventanaInicioSesion, "Error de inicio de sesión", "Error", 0);
            }
        }
    }
    
    
    public boolean validarSesion(String usuario, String contrasenia){
        
        for (int i=0; i<listaUsuarios.size();i++){
            if (usuario.equals(listaUsuarios.get(i).getNombre())){
                if(contrasenia.equals(listaUsuarios.get(i).getContrasenia())){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
