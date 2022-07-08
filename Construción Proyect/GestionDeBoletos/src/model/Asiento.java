/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Objeto simple que representa un asiento del teatro
 * @author isaac
 */
public class Asiento {
    /**
     * Nombre o serie del asiento
     *
     */
    private String nombre;
    
    /**
     * Disponibilidad del asiento
     *
     */
    private boolean disponible;
    
    /**
     * Se cambia la disponibilidad del asiento a ocupado, cambiando el valor a false
     *
     */
    public void ocuparAsiento(){
        this.disponible = false;
    }
}
