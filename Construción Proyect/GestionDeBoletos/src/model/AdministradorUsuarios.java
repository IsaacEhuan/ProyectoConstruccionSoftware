/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 
 * @author isaac
 */
public class AdministradorUsuarios{
    /**
     * Lista de todos los usuarios registrados
     *
     */
    ArrayList<Usuario> usuarios = new ArrayList();
    
    public AdministradorUsuarios(String[] usuariosString){
        for (String usuariosString1 : usuariosString) {
            String[] datosUser = usuariosString1.split(",");    
            for (String tempStr : datosUser) {
                System.out.print(tempStr + " ");
            }
            usuarios.add(new Usuario(datosUser[0],datosUser[1],datosUser[2],datosUser[3]));
        }
    }
    
    public int verificarUsuario(String usuario, String contrasenia){
        for (Usuario usuarioIndex : usuarios) {
            if(usuarioIndex.getNombre().equals(usuario)){
                if(usuarioIndex.getContrasenia().equals(contrasenia)){
                    return 1;
                } else{
                    return 3;
                }
            }
        }
        return 2;
    }
    
    /*public int verificarUsuario(String usuario, String contrasenia){
        for (Usuario usuario1 : usuarios) {
            if(usuario1.getNombre().equals(usuario)){
                if(usuario1.getStatus().equals(" ")){
                    if(usuario1.getContrasenia().equals(contrasenia)){
                        return 1;
                    } else{
                        return 3;
                    }
                } else{
                    Date fecha = new Date();
                    long x = fecha.getTime() - Long.parseLong(usuario1.getStatus());
                    if(x<60000){
                        //600000 10 minutos
                        //60000  1 minuto
                        //Aun bloqueado
                        return 4;
                    }else{
                        usuario1.setStatus(" ");
                        if(usuario1.getContrasenia().equals(contrasenia)){
                            return 1;
                        } else{
                            return 3;
                        }
                    } 
                }
                
            }
        }
        return 2;
    }*/
    
    /*public void bloquearUsuario(String usuario){
        for (Usuario usuario1 : usuarios) {
            if(usuario1.getLogin().equals(usuario)){
                Date fecha = new Date();
                long x = fecha.getTime();
                usuario1.setStatus(Long.toString(x));
            }
        }
    }*/
    
    /*public void actualizarTXT(String ruta, String nombre) throws IOException{
        PrintWriter fileOut;
        try{
            fileOut = new PrintWriter(new FileWriter(ruta + nombre,false));
            for(int i = 0; i< usuarios.size();i++){
                fileOut.println(usuarios.get(i));
            }
            fileOut.close();
        } catch(FileNotFoundException e){
            System.out.println("Archivo No existe");
            //JOptionPane.showMessageDialog(jFrame,"Archivo No existe");
        }
    }*/

    public void darAlta(String nombre, String apellido, String CURP, String contrasenia) {
        
    }

    public void darBaja(){
        
    }

    public void editarInfo(){
        
    }

    public void actualizarRegistros(String ruta, String nombre) throws IOException{
        PrintWriter fileOut;
        try{
            fileOut = new PrintWriter(new FileWriter(ruta + nombre,false));
            for(int i = 0; i< usuarios.size();i++){
                fileOut.println(usuarios.get(i));
            }
            fileOut.close();
        } catch(FileNotFoundException e){
            System.out.println("Archivo No existe");
            //JOptionPane.showMessageDialog(jFrame,"Archivo No existe");
        }
    }

    public void validarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
