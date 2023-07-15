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
public class Vector2D 
{
    private double dirX;
    private double dirY;

    protected Vector2D()
    {
        this.dirX = this.dirY = 0;
    }
    
    protected Vector2D(double dx,double dy)
    {
        this.dirX = dx;
        this.dirY = dy;
    }
    
     protected void Ver_Datos_Vector2D()
    {
        System.out.println("______________");
        System.out.println("Dirección X : " + this.dirX);
        System.out.println("Dirección Y : " + this.dirY);        
    }
     
    protected double ObtenerDirX()
    {
        return this.dirX;
    }
    
    protected double ObtenerDirY()
    {
        return this.dirY;
    }
    
      
    public void CambiarDirX(double dx)
    {
        this.dirX = dx;
    }
    
    public void CambiarDirY(double dy)
    {
        this.dirY = dy;
    }
     
    public double Modulo_Vector2D()
    {
        
        return ( Math.sqrt( Math.pow(this.dirX, 2) + Math.pow(this.dirY,2) ) );
    }
    
    public void Normalizar_Vector2D()
    { 
        double modulo = this.Modulo_Vector2D();
        
        this.CambiarDirX(this.dirX/modulo);
        this.CambiarDirY(this.dirY/modulo);
    }
    
    public Vector2D Normalizar_Vector2D_bis()
    {
        Vector2D v = new Vector2D();
        
        v.CambiarDirX(this.dirX/this.Modulo_Vector2D());
        v.CambiarDirY(this.dirY/this.Modulo_Vector2D());        
        
        return v;
        
    }
    
     
    public Vector2D Producto_escalar_Vector2D(double escalar)
    {
        Vector2D v = new Vector2D();
       
        v.CambiarDirX(escalar * this.dirX);
        v.CambiarDirY(escalar * this.dirY);
        
        return v;        
    }
    
    public void Producto_escalar_Vector2D_bis(double escalar)
    {
        
        this.CambiarDirX(escalar * this.dirX);
        this.CambiarDirY(escalar * this.dirY);
              
    }
    
    public Vector2D Producto_vectorial_Vector2D(Vector2D v)
    {
        Vector2D v1 = new Vector2D();
        
        // En v1 se quedaría el resultado de la operacion
        // producto_vectorial(this, v)
        
        return v1;
        
    }        
    
    
    public Vector2D Producto_vectorial_Vector2D(double escalar)
    {
        Vector2D v = new Vector2D();
       
        return v;
        
    }
    
    public Vector2D Suma_Vector2D(Vector2D v)
    {
        Vector2D vr = new Vector2D();
       
        vr.CambiarDirX(this.dirX+v.ObtenerDirX());
        vr.CambiarDirY(this.dirY+v.ObtenerDirY());
        
        return vr;     
    }
    
    
    
    
    
    public boolean Vectores_paralelos(Vector2D v)
    {
        if (this.dirX * v.dirY == this.dirY * v.dirX)
            return true;
        else
            return false;
    }
    
}
