
package com.arfonfo.proyectogeometria2d;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Circulo {
    private Punto2D centro;
    private double radio;

    public Circulo() {
        centro = new Punto2D();
        radio=0.0;
    }

    public Circulo(Punto2D centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    
    public Punto2D ObtenerCentro(){
        return this.centro;
    }
    
    public double ObtenerRadio(){
        return this.radio;
    }
    
    public void Cambiar_Centro(){
        this.centro.CambiarX();
        this.centro.CambiarY();
    }
    
    public void Cambiar_Radio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        this.radio = sc.nextDouble();
    }
    
    public double Superficie(){
        return Math.PI*Math.pow(this.ObtenerRadio(), 2);
    }
    
    public double Longitud(){
        return 2*Math.PI*this.ObtenerRadio();
    }
    
    public boolean Iguales(Circulo c){
        return this.Superficie()==c.Superficie();
    }
    
    public double DistanciaPunto(Punto2D p){
        return this.ObtenerCentro().Distancia_entre_puntos(p);
    }

    public double Distancia(Circulo c2){
        return this.ObtenerCentro().Distancia_entre_puntos(c2.ObtenerCentro());
    }
    
    public void Ver_Datos_Circulo() {
        System.out.println("El círculo presenta las siguientes características:"
                + "\nCentro: " + centro.ObtenerX() + ", " + centro.ObtenerY()
                + "\nRadio: " + this.ObtenerRadio());
    }
    
}
