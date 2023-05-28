
package com.arfonfo.proyectoanimal;

/**
 *
 * @author alfon
 */
public class Vertebrado extends Animal{
    private int numVertebras;
    
    public Vertebrado(int nV, int peso, int d, int m, int y){
        super(peso, d, m, y);
        try{
            if(nV < 0 || nV > 1000)
                throw new ArithmeticException("Número de vértebras erróneo");
            this.numVertebras = nV;
        } catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public Vertebrado(int nV, Fecha f, int peso){
        this(nV, peso, f.getDia(), f.getMes(), f.getAnyo());
    }
    
    public Vertebrado(Animal a, int nV){
        this(nV, a.getFecha(), a.getPeso());
    }
    
    public Vertebrado(Vertebrado v){
        this(v.numVertebras, v.getFecha(), v.getPeso());
    }
    
    public Vertebrado(){
        this.numVertebras = 0;
    }
    
    public int getNumVertebras(){
        return this.numVertebras;
    }
    
    public void setNumVertebras(int nV){
        try{
            if(nV < 0 || nV > 1000)
                throw new ArithmeticException("Número de vértebras equivocado");
            this.numVertebras=nV;
        } catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void setVertebrado(int nV, int peso, int d, int m, int y){
        super.setAnimal(peso, d, m, y);
        try{
            if(nV < 0 || nV > 1000)
                throw new ArithmeticException("NumVert incorrecto");
            this.numVertebras = nV;
        }catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void setVertebrado(int nV, Fecha f, int peso){
        this.setVertebrado(nV, peso, f.getDia(), f.getMes(), f.getAnyo());
    }
    
    public void setVertebrado(Animal a, int nV){
        this.setVertebrado(nV, a.getFecha(), a.getPeso());
    }
    
    public void setVertebrado(Vertebrado v){
        this.setVertebrado(v.getNumVertebras(), v.getFecha(), v.getPeso());
    }
}
