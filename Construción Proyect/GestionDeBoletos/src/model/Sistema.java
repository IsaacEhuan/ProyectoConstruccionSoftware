/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.util.Scanner;

/**
 * El sistema base, verifica los usuarios para acceder a los demás sistemas
 * @author isaac
 */
public class Sistema {
    /**
     * Obtiene una lista de los usuarios para validarlos
     *
     */
    private String[] credenciales;
    
    /**
     * ruta del archivo de los usuarios
     *
     */
    public String ruta;
    
    /**
     * Nombre del archivo de los usuarios
     *
     */
    public String nombre;
    Scanner sc = new Scanner(System.in);
    
    public Sistema(String ruta, String nombre) throws IOException{
        this.ruta = ruta;
        this.nombre = nombre;
        if(verificarArchivoUsuario(ruta, nombre)){
            setCredenciales(credenciales, ruta, nombre);
            for (String credenciale : credenciales) {
                System.out.println(credenciale);
            }
            mostrarInterfazUsuario();
        } else{
            alertaArchivoUsuarioNoExiste();
        }
    }
    
    /**
     * Llama a la clase verificador para saber si el archivo existe y es correcto
     * @param ruta del archivo
     * @param nombre del archivo
     */
    public boolean verificarArchivoUsuario(String ruta, String nombre){
        VerificadorArchivo verif = new VerificadorArchivo();
        return verif.verificarExistenciaArchivo(ruta, nombre);
    }
    
    /**
     * Despliega Interfaz
     *
     */
    private void mostrarInterfazUsuario() throws IOException{
        //JOptionPane.showMessageDialog(jFrame,"Esto es la interfaz del login");
        /*UILogin log = new UILogin();
        log.setVisible(true);*/
        System.out.println("Por favor, ingrese un usuario y contraseña:");
        //JOptionPane.showMessageDialog(jFrame,"Por favor, ingrese un usuario y contraseña:");
        ingresarUsuarioContra();
    }
    
    /**
     * Ingresa el usuario y la contraseña
     *
     */
    public void ingresarUsuarioContra() throws IOException{
        System.out.println("Ingrese su nombre de usuario");
        //String usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
        String usuario = sc.nextLine();
        if(usuario.equals(" ")){
            System.exit(0);
        }
        //String contrasenia = JOptionPane.showInputDialog("Ingrese su contraseña de usuario");
        System.out.println("Ingrese su contraseña de usuario");
        String contrasenia = sc.nextLine();
        if(contrasenia.equals(" ")){
            System.exit(0);
        }
        //contrasenia = Seguridad.encrypt(contrasenia, secretKey);
        //System.out.println(contrasenia);
        verificaUsuarioContra(usuario, contrasenia);
    }
    
    /**
     * Hace la verificacion si existe el usuario y si coincide la contrasenia
     * @param nombre del usuario
     * @param contrasenia del usuario
     */
    public void verificaUsuarioContra(String usuario, String contrasenia) throws IOException{
        
        AdministradorUsuarios admins = new AdministradorUsuarios(credenciales);
        
        switch(admins.verificarUsuario(usuario, contrasenia)){
            case 1 ->{
                //admins.actualizarCSV(ruta,nombre);
                mostrarMenu();
            }
            case 2 ->{
                //JOptionPane.showMessageDialog(jFrame,"Usuario No encontrado");
                System.out.println("Usuario No Encontrado");
                //admins.actualizarCSV(ruta,nombre);
                mostrarInterfazUsuario();
            }
            case 3 -> {
                System.out.println("Conraseña Incorrecta");
                mostrarInterfazUsuario();
                /*if(intentos < 2){
                    JOptionPane.showMessageDialog(jFrame,"Conraseña Incorrecta");
                    intentos++;
                    mostrarInterfazUsuario();
                } else{
                    admins.bloquearUsuario(usuario);
                    admins.actualizarCSV(ruta,nombre);
                    alertaUsuarioBloqueado();
                }*/
            }
            /*case 4 -> {
                JOptionPane.showMessageDialog(jFrame,"El usuario está bloqueado");
                mostrarInterfazUsuario();
            }*/
        }
    }
    
    /**
     * Despliega el menu para acceder a los demás sistemas
     *
     */
    private void mostrarMenu(){
        //JOptionPane.showMessageDialog(jFrame,"Aquí debería haber un menú pero no me pagan lo suficiente");
        System.out.println("Not Supported Yet");
        System.exit(0);
    }
    
    /**
     * Envia alerta de inexistencia de usuario
     *
     */
    private void alertaArchivoUsuarioNoExiste(){
        /*JOptionPane.showMessageDialog(jFrame,"Archivo usuarios No existe");
        intentos = 0;*/
        System.out.println("Archivo usuarios No existe");
        System.exit(0);
    }
    
    //private void alertaUsuarioBloqueado(){
    //    /*JOptionPane.showMessageDialog(jFrame,"El usuario ha sido bloqueado por 10 minutos");
    //    intentos = 0;*/
    //    System.exit(0);
    //}

    /**
     * @return the credenciales
     */
    private String[] getCredenciales() {
        return credenciales;
    }

    /**
     * @param credenciales the credenciales to set
     */
    private void setCredenciales(String[] credenciales, String ruta, String nombre) {
        /*String ruta = "C:\\Users\\isaac\\OneDrive\\Escritorio\\"; //C:\\Users\\isaac\\OneDrive\\Escritorio\\
        String nombre = "Usuarios.csv";*/
        VerificadorArchivo verif = new VerificadorArchivo();
        this.credenciales = verif.obtenerContenido(ruta, nombre);
    }
}
