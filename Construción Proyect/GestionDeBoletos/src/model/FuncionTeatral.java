/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Objeto que representa una funcion teatral
 * @author isaac
 */
public class FuncionTeatral {
    /**
     * La obra en cuestion a presentarse
     *
     */
    private Obra obra;
    
    /**
     * Fecha de la presentacion de la obra
     *
     */
    private String fecha;
    
    /**
     * Hora de presentacion de la obra
     *
     */
    private String hora;
    
    /**
     * Lista de asientos con sus respectivas disponibilidades
     *
     */
    Asiento[] asientos = new Asiento[10];
    
    public FuncionTeatral(Obra obra, String fecha, String hora, Asiento[] asientos){
        this.obra = obra;
        this.fecha = fecha;
        this.hora = hora;
        this.asientos = asientos;
    }
}
