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
public class Circulo 
{
    private Punto2D centro;
    private double radio;
    
    public Circulo()
    {
        this.centro = new Punto2D();
        this.radio = 0;
    }
    
    public Circulo(Punto2D c, double r)
    {
        this.centro = new Punto2D();
        this.centro = c;
        this.radio = r;
    }
    
    public Circulo(double x, double y, double r)
    {
        this.centro = new Punto2D();
        this.centro.CambiarX(x);
        this.centro.CambiarY(y);        
        this.radio = r;
    }
    
    public void Ver_datos_Circulo()
    {
        this.centro.Ver_Datos_Punto2D();
       
        System.out.println("Radio: " + this.radio);
        
    }
    
    
    
    /*
     System.out.println("______________");
        System.out.println("Coordenada X : " + this.centro.ObtenerX());
        System.out.println("Coordenada Y : " + this.centro.ObtenerY()); 
       
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
     protected Punto2D ObtenerCentro()
    {
        return this.centro;
    }
     
     
     
    protected double ObtenerRadio()
    {
        return this.radio;
    }
    
        
    public void CambiarCirculo(Punto2D c)
    {
        this.centro = c;
    }
    public void CambiarCirculo(double cx, double cy)
    {
        this.centro.CambiarPunto2D(cx, cy);
    }
    
    public void CambiarCirculo(double r)
    {
        this.radio = r;
    }
    
    public void CambiarCirculo(Punto2D c,double r)
    {
        this.centro = c;
        this.radio = r;
    }
    
    protected double Superficie()
    {
        return ( Math.PI * this.radio * this.radio);
    }
    
    protected double Longitud()
    {
        return ( 2 * Math.PI * this.radio);
    }
    
    protected boolean Iguales(Circulo c)
    {
        if (this.Superficie()==c.Superficie())
            return true;
        else
            return false;
    }
    
    protected double Distancia(Punto2D p)
    {
        return (this.centro.Distancia_entre_puntos(p));        
    }
    
    protected double Distancia(Circulo c)
    {
        return (this.centro.Distancia_entre_puntos(c.centro));        
    }
    
}
