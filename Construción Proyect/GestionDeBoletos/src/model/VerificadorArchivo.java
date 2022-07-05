/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class VerificadorArchivo {
    public static int numUsers;
    
    public boolean verificarExistenciaArchivo(String ruta, String nombre){
        try{
            FileReader fr = new FileReader(ruta + nombre);
            System.out.println("El archivo se encontró con éxito");
            BufferedReader brUser = new BufferedReader(fr);
            String lineaUser; //String donde se guardan los datos antes de la coma 
            //ArrayList<String[]> usuarios = new ArrayList();
            while ((lineaUser = brUser.readLine()) != null) {

                String[] datosUser = lineaUser.split(",");
                
                for (String tempStr : datosUser) {
                    System.out.print(tempStr + " ");
                }
                
                if(!estructuraCorrecta(datosUser.length)) {
                    System.out.println("Numero de columnas o formato no esperado");
                    System.exit(0);
                }
                                        
                //usuarios.add(datosUser);
                numUsers++;
            }
            
            /*if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(jFrame, "El archivo está vacío");
                System.exit(0);
                return false; 
            }*/
            
            return true;
            
        } catch(IOException ex){
            return false;
        }
    }
    
    public boolean estructuraCorrecta(int numElementos){
        return numElementos == 4;
    }
    
    public String[] obtenerContenido(String ruta, String nombre){
        try{
            FileReader fr = new FileReader(ruta + nombre);
            BufferedReader brUser = new BufferedReader(fr);
            String lineaUser; //String donde se guardan los datos antes de la coma 
            String[] usuarios = new String[numUsers];
            int i = 0;
            while ((lineaUser = brUser.readLine()) != null) {

                /*String[] datosUser = lineaUser.split(",");
                
                for (String tempStr : datosUser) {
                    System.out.print(tempStr + " ");
                } */                      
                usuarios[i] = lineaUser;
                i++;
            }
            /*for(int j=0;j<i;j++){
                System.out.println(usuarios[j]);
            }*/
            return usuarios;
            
        } catch(IOException ex){
            System.out.println("El archivo no existe o no se encuentra en la ruta");
            return null;
        }
        //return contenido;
    }
}
