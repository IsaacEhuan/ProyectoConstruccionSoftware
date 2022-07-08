/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeboletos;

import java.io.IOException;
import model.Sistema;

/**
 *
 * @author isaac
 */
public class GestionDeBoletos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\isaac\\OneDrive\\Escritorio\\"; //C:\\Users\\isaac\\OneDrive\\Escritorio\\
        String nombre = "Usuarios.txt";
        Sistema system = new Sistema(ruta, nombre);
    }
}
