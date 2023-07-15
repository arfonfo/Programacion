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
public class Punto2D 
{
    
    private double x;
    private double y;
    
    Punto2D()
    {
        this.x = this.y = 0;
    }
    
    protected Punto2D(double px, double py)
    {
        this.x = px;
        this.y = py;
    }
    
    protected void Ver_Datos_Punto2D()
    {
        System.out.println("______________");
        System.out.println("Coordenada X : " + this.x);
        System.out.println("Coordenada Y : " + this.y);        
    }
    
    protected double ObtenerX()
    {
        return this.x;
    }
    
    protected double ObtenerY()
    {
        return this.y;
    }
    
      
    public void CambiarX(double cx)
    {
        this.x = cx;
    }
    
    public void CambiarY(double cy)
    {
        this.y = cy;
    }
    
       
    public void CambiarPunto2D(double cx,double cy)
    {
        this.CambiarX(cx);  
        this.CambiarY(cy);
        
        this.x = cx;
        this.y = cy;
    }
    
    public void CambiarPunto2D(Punto2D p)
    {
        this.CambiarX(p.ObtenerX());
        this.CambiarY(p.ObtenerY());
    }
    
    double Distancia_centro()
    {
        
        return ( Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y,2) ) );
        
    }
    
       
    
    //Pendiente método Vector_Punto2D
    
    
    double Distancia_entre_puntos(Punto2D p)
    {
        
        double distanciaX = this.ObtenerX()-p.ObtenerX();
        double distanciaY = this.ObtenerY()-p.ObtenerY();
        
        return ( Math.sqrt( Math.pow(distanciaX, 2) + Math.pow(distanciaY,2) ) );
        
    }
    
    
    
}
