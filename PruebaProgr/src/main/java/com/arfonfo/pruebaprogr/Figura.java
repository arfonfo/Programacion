
package com.arfonfo.pruebaprogr;

/**
 *
 * @author alfon
 */
public abstract class Figura {
    double dim1;
    double dim2;
    
    public Figura(double a, double b){
        this.dim1=a;
        this.dim2=b;
    }
    
    protected abstract double area();
    
    public boolean equals(Figura f){
        return this==f;
    }
    
}
