package Helpers;

import Logica_Negocio.Personas;
import Logica_Negocio.Producto;


public class HelperImpresion {

    public static void Imprimir(Personas objPersonas) {
        
        System.out.println("El nombre del producto es" + "\t" + objPersonas.getNombre());
        System.out.println("La descripcion del producto es" + "\t" + objPersonas.objProducto.getDescripción());
        System.out.println("El ID del producto es" + "\t" + objPersonas.objProducto.getId_Producto());
        System.out.println("El nombre de la Persona es" + "\t" + objPersonas.getNombre());
        System.out.println("El apellido de la persona es" + "\t" + objPersonas.getApellido());
        System.out.println("El ID de la persona es" + "\t" + objPersonas.getId_Persona());
    }
}
