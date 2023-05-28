
package com.arfonfo.pruebaprogr;

/**
 *
 * @author alfon
 */
public class Rectangulo extends Figura{
    double diagonal;
    
    Rectangulo(double a, double b){
        super(a, b);
        diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    protected double area(){
        System.out.println("Dentro de rectángulo");
        return dim1*dim2;
    }
    
    
    protected final void soyUnRectangulo(){
        System.out.println("Soy un rectángulo");
    }
    
    
    public boolean equals(Rectangulo o) {
        return this==o;
    }
    
}
