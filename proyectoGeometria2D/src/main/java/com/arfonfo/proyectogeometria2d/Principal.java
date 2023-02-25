
package com.arfonfo.proyectogeometria2d;

/**
 *
 * @author alfon
 */
public class Principal {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        Circulo c2 = new Circulo();
        
        c.Ver_Datos_Circulo();
        c.Cambiar_Centro();
        c.Cambiar_Radio();
        c2.Cambiar_Centro();
        c2.Cambiar_Radio();
        c2.Ver_Datos_Circulo();
        c.Ver_Datos_Circulo();
        
        System.out.println("La distancia entre el círculo y otro punto es: " + c.DistanciaPunto(c2.ObtenerCentro()));
    }
}
