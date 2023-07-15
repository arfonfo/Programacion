
package com.arfonfo.proyectogeometria2d;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Vector2D {
    private double dirX;
    private double dirY;

    public Vector2D() {
        this.dirX = 0;
        this.dirY = 0;
    }

    public Vector2D(double dirX, double dirY) {
        this.dirX = dirX;
        this.dirY = dirY;
    }
    
    public double ObtenerDirX(){
        return this.dirX;
    }
    
    public double ObtenerDirY(){
        return this.dirY;
    }
    
    public void CambiarDirX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la coordenada X: ");
        this.dirX = sc.nextDouble();
    }
    
    public void CambiarDirY(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la coordenada Y: ");
        this.dirY = sc.nextDouble();
    }
    
    public double Modulo_Vector2D(){
        return Math.sqrt(Math.pow(dirX, 2) + Math.pow(dirY, 2));
    }
    
    public void Normalizar_Vector2D(){
        if(this.Modulo_Vector2D()!=0){
            this.dirX = this.dirX/this.Modulo_Vector2D();
            this.dirY = this.dirY/this.Modulo_Vector2D();
        } else {
            System.out.println("El módulo del Vector es 0. No es posible dividir entre 0.");
        }
    }
    
    public double Producto_escalar_Vector2D(){
        Vector2D aux = new Vector2D();
        aux.CambiarDirX();
        aux.CambiarDirY();
        
        return (this.ObtenerDirX()*aux.ObtenerDirX()) + (this.ObtenerDirY()*aux.ObtenerDirY());
    }
    
    public Vector2D Producto_escalar_Vector2D(double escalar)
    {
        Vector2D v = new Vector2D();
       
        v.dirX = escalar * v.dirX;
        v.dirY = escalar * v.dirY;
        
        return v;        
    }
    
    // ENTRA OTRO VECTOR POR PARÁMETRO Y DEVUELVE OTRO VECTOR RESULTADO DE SU MULTIPLICACIÓN
    public Vector2D Producto_vectorial_Vector2D(Vector2D v2){
        Vector2D aux = new Vector2D();
        
        aux.dirX = v2.ObtenerDirX()*this.ObtenerDirX() + v2.ObtenerDirX()*this.ObtenerDirY();
        aux.dirY = v2.ObtenerDirY()*this.ObtenerDirY() + v2.ObtenerDirY()*this.ObtenerDirX();
        
        return aux;
    }
    
    public Vector2D Producto_vector_escalar(Vector2D v2){
        double escalar = v2.Producto_escalar_Vector2D();
        Vector2D aux = new Vector2D(escalar*this.ObtenerDirX(), escalar*this.ObtenerDirY());
        return aux;
    }
    
    public Vector2D Sumar_Vector2D(Vector2D v2){
        return new Vector2D((this.ObtenerDirX()+v2.ObtenerDirX()), (this.ObtenerDirY()+v2.ObtenerDirY()));
    }   
    
    public boolean Vectores_Paralelos(Vector2D v2){
        return v2.ObtenerDirX()/this.ObtenerDirX()==v2.ObtenerDirY()/this.ObtenerDirY();

    }
    
    public void Ver_Datos_Vector2D(){
        System.out.println("El vector cuenta con las siguientes coordenadas:\nx: " + ObtenerDirX() + "\ny: " + ObtenerDirY());
    }
    
    
}
