/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isaac
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String CURP;
    private String contrasenia;
    //private String status;

    public Usuario(String nombre, String apellido, String CURP, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CURP = CURP;
        this.contrasenia = contrasenia;
        //this.status = status;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the loging to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /*public String getStatus() {
        return status;
    }*/

    /**
     * @param status the contrasenia to set
     */
    /*public void setStatus(String status) {
        this.status = status;
    }*/
    
    @Override
    public String toString() {
        return  nombre+","+contrasenia/*+","+status*/;
    }
}
