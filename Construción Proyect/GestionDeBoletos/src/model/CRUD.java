/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase abstracta para los diferentes tipos de administraciones
 * @author isaac
 */

//La clase se llama CRUD dado el acrónimo para las maneras en las que se puede operar sobre información almacenada.
//Las siglas corresponden a Create, Read, Update, Delete.
//Representando Crear, Leer, Actualizar y Eliminar respectivamente
public abstract class CRUD {
    public abstract void darAlta();
    public abstract void darBaja();
    public abstract void editarInfo();
    public abstract void actualizarRegistros();
    public abstract void validarDatos();
}
