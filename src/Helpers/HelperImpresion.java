package Helpers;

import Logica_Negocio.Producto;

public class HelperImpresion {

    public static void Imprimir(Producto objProducto) {
        System.out.println("El nombre del producto es" + "\t" + objProducto.getNombre());
        System.out.println("La descripcion del producto es" + "\t" + objProducto.getDescripción());
        System.out.println("El ID del producto es" + "\t" + objProducto.getId());
        System.out.println("El nombre de la Persona es" + "\t" + objProducto.objPersonas.getnombre());
        System.out.println("El apellido de la persona es" + "\t" + objProducto.objPersonas.getapellido());
        System.out.println("El ID de la persona es" + "\t" + objProducto.objPersonas.getid());
    }
}
