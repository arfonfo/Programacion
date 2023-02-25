
package com.arfonfo.proyectogeometria2d;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Punto2D {
    private double x;
    private double y;

    public Punto2D() {
        this.x= this.y = 0;
    }

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double ObtenerX(){
        return this.x;
    }
    
    public double ObtenerY(){
        return this.y;
    }
    
    public void CambiarX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la coordenada X: ");
        this.x = sc.nextDouble();
    }
    
    public void CambiarY(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la coordenada Y: ");
        this.y = sc.nextDouble();
    }
    
    public void Cambiar_Punto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // Tomamos como centro de sistema de referencias el punto (0, 0)
    public double Distancia_centro(){
        // Calculamos la distancia del punto (x, y) al punto (0, 0) con la fórmula euclídea
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    public Punto2D Vector_Punto2D(){
        // Al ser desde el punto de referencia (0, 0), devolveremos las coordenadas del punto
        return new Punto2D(this.x, this.y);
    }
    
    public double Distancia_entre_puntos(Punto2D p2){
        return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
    }
    
    public void Ver_Datos_Punto2D(){
        System.out.println("El punto se encuentra posicionado en las siguientes coordenadas:\nx: " + this.ObtenerX() + "\ny: " + this.ObtenerY());
    }
    
    
    
}
