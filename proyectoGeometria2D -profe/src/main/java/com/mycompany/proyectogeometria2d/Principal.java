/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectogeometria2d;

/**
 *
 * @author Profesor
 */
public class Principal 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
      /*  
        Punto2D p1 = new Punto2D();
        
        p1.Ver_Datos_Punto2D();
        
        Punto2D p2 = new Punto2D(5,-3);
        
        p2.Ver_Datos_Punto2D();
        
        System.out.println("cx(p2) " + p2.ObtenerX());
        System.out.println("cy(p2) " + p2.ObtenerY()); 
        
        
        p1.CambiarX(7);
        p1.CambiarY(9);
        
        p1.Ver_Datos_Punto2D();
        
        p1.CambiarPunto2D(-8, -10);
        
        p1.Ver_Datos_Punto2D();
        
        
      //  p1.CambiarPunto2D(p2);
        
      //  p1.Ver_Datos_Punto2D();
        
        
      //  System.out.println("Distancia al centro de p1: " + p1.Distancia_centro());
        
        System.out.println("distancia p1 a p2: " + p1.Distancia_entre_puntos(p2));
        System.out.println("distancia p2 a p1: " + p2.Distancia_entre_puntos(p1));        
        
       */
        
        /*
        
        
        Vector2D v1 = new Vector2D(3,4);
        
        v1.Ver_Datos_Vector2D();
        
        System.out.println("Modulo: " + v1.Modulo_Vector2D());
        
        v1.Normalizar_Vector2D();
        
        System.out.println("Modulo: " + v1.Modulo_Vector2D());
        
        
        Vector2D v2 = new Vector2D();
        
        v2 = v1.Normalizar_Vector2D_bis();
      
        System.out.println("Modulo: " + v2.Modulo_Vector2D());
      
        v1.CambiarDirX(1);
        v1.CambiarDirY(3);        
        
        v2.CambiarDirX(4);
        v2.CambiarDirY(5);

        Vector2D v3 = new Vector2D();
        v3 = v1.Suma_Vector2D(v2);
        
        v3.Ver_Datos_Vector2D();
        
        if (v1.Vectores_paralelos(v3))
            System.out.println("v1 y v3 son paralelos");
        else
            System.out.println("v1 y v3 NO son paralelos");
        
        */
        
        
        
        Punto2D p1 = new Punto2D(5,7);
        
        Circulo c1 = new Circulo(2,3,10);
        Circulo c2 = new Circulo(p1,7);

        c1.Ver_datos_Circulo();
        c2.Ver_datos_Circulo();
        
        System.out.println("Superficie(c1)= " + c1.Superficie());
        System.out.println("Longitud(c1)= " + c1.Longitud());        
        
        
        System.out.println("Distancia c1 a c2: " + c1.Distancia(c2));
        

    }
    
}
