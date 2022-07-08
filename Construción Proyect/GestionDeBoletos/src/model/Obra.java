/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Objeto que representa una obra teatral
 * @author isaac
 */
public class Obra {
    /**
     * Nombre de la obra
     *
     */
    private String nombre;
    
    /**
     * Genero de la obra
     *
     */
    private String genero;
    
    /**
     * Breve descripcion de la obra
     *
     */
    private String resumen;
    
    /**
     * Duracion de la obra
     *
     */
    private String duracion;
    
    /**
     * Nombre del actor principal de la obra
     *
     */
    private String actorPrincipal;
    
    /**
     * Nombre del segundo actor principal de la obra
     *
     */
    private String actorSecundario;
    
    /**
     * Precio del boleto de la obra
     *
     */
    private float precioBoleto;
    
    public Obra(String nombre, String genero, String resumen, String duracion, String actorPrincipal, String actorSecundario, float precioBoleto){
        this.nombre = nombre;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actorSecundario = actorSecundario;
        this.precioBoleto = precioBoleto;
    }
}
