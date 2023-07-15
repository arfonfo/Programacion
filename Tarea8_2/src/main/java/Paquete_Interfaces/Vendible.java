
package Paquete_Interfaces;

/**
 *
 * @author alfon
 */
// Las interfaces heredan entre sí utilizando la palabra extends
// además una interfaz puede heredar de más de una interfaz
// entre interfaces no se copian los métodos
// Si una clase hereda de una interfaz que hereda de otra interfaz
// debe implementar todos los métodos de las interfaces
public interface Vendible {
    // Dentro de las interfaces todas las variables que se declaren
    // son final y static, y deben ser inicializadas con un valor constante
    public double precioIva();
    
    public default void mostrar(){
        System.out.println("Hola");
    }
    
    public static void metodoStatico(){
        System.out.println("Llamando a método estático");
    }
    
    // Los métodos default y static se implementan en la interfaz
    // pero no tienen porqué en las clases que la heredan
//    default double precioIva(){
//        codigo...
//   }
//    static double precioIva(){
//        codigo...
//    }
}
