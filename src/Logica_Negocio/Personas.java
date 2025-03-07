/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author luisa
 */
public class Personas {
    public String nombre;
    public  String apellido;
    public String id_Persona;
    public Producto objProducto;

    public Personas() {
    }

    public Personas(String nombre, String apellido, String id_Persona, Producto objProducto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_Persona = id_Persona;
        this.objProducto = objProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(String id_Persona) {
        this.id_Persona = id_Persona;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

    
    
}
