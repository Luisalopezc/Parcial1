/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author luisa
 */
public class Producto {
    
    public String id_Producto, nombre_Producto, descripción;

    public Producto() {
    }

    public Producto(String id_Producto, String nombre, String descripción) {
        this.id_Producto = id_Producto;
        this.nombre_Producto = nombre;
        this.descripción = descripción;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre_Producto;
    }

    public void setNombre(String nombre) {
        this.nombre_Producto = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String id_Producto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String nombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String descripción() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   
            
    
}
