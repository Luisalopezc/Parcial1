/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Personas;
import Logica_Negocio.Producto;
import java.util.Scanner;
/**
 *
 * @author ESTEBAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nombre_Persona, apellido, id_Persona;
        String id_Producto, nombre_Producto, descripcion;
        Personas objPersonas;
        Producto objProducto ; 
        int rta, conteo;
        
       
        
        System.out.println("Digite el nombre de la persona");
        nombre_Persona = scan.nextLine();
        
        
         rta = HelperValidacion.ValidarVacio(nombre_Persona);

        while (rta > 0) {
            System.out.println("Digite el nombre de la persona");
            nombre_Persona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre_Persona);
        }

        conteo = HelperValidacion.ValidarTodo(nombre_Persona);

        while (conteo != 0) {
            System.out.println("Digite el nombre de la persona");
            nombre_Persona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(nombre_Persona);

        }
        
        
        
        System.out.println("Digite el apellido de la persona");
        apellido = scan.nextLine();
        
        
         rta = HelperValidacion.ValidarVacio(apellido);

        while (rta > 0) {
            System.out.println("Digite el apellido de la persona");
            apellido = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(apellido);
        }

        conteo = HelperValidacion.ValidarTodo(apellido);

        while (conteo != 0) {
            System.out.println("Digite el apellido de la persona");
            apellido = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(apellido);

        }
        
        
        
         System.out.println("Digite el id de la persona");
        id_Persona = scan.nextLine();

        
        rta = HelperValidacion.ValidarVacio(id_Persona);

        while (rta > 0) {
            System.out.println("Digite el id de la persona");
            id_Persona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(id_Persona);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id_Persona);

        while (conteo != 0) {
            System.out.println("Digite el id de la persona");
            id_Persona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id_Persona);

        }
        
        
        
         
         
          System.out.println("Digite el id del producto");
        id_Producto = scan.nextLine();

        
        rta = HelperValidacion.ValidarVacio(id_Producto);

        while (rta > 0) {
            System.out.println("Digite el id de la persona");
            id_Producto = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(id_Producto);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id_Producto);

        while (conteo != 0) {
            System.out.println("Digite el id de la persona");
            id_Producto = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id_Producto);

        }
         
         
        
        System.out.println("Digite el nombre del producto");
        nombre_Producto = scan.nextLine();
        
        
         rta = HelperValidacion.ValidarVacio(nombre_Producto);

        while (rta > 0) {
            System.out.println("Digite el nombre del producto");
            nombre_Producto = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre_Producto);
        }

        conteo = HelperValidacion.ValidarTodo(nombre_Producto);

        while (conteo != 0) {
            System.out.println("Digite el nombre del producto");
            nombre_Producto = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(nombre_Producto);

        }
        
        
        
        System.out.println("Digite la descripcion del producto");
        descripcion = scan.nextLine();
             
        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("Digite la descripcion del producto");
            descripcion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodo(descripcion);

        while (conteo != 0) {
            System.out.println("Digite la descripcion del producto");
            descripcion = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(descripcion);

        }

        
        
    }
    
}
