
package com.arfonfo.proyectoanimal;

/**
 *
 * @author alfon
 */
public class Animal {
    private int peso;
    private Fecha fechaNac;
    
    public Animal(int peso, int d, int m, int y){
        try{
            if(peso<0 || peso>5000)
                throw new ArithmeticException("El peso no puede ser menor de 0 ni superior de 5000");
            this.peso=peso;
            this.fechaNac = new Fecha(d, m, y);
        } catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public Animal(int peso, Fecha f){
        this(peso, f.getDia(), f.getMes(), f.getAnyo());
    }
    
    public Animal(Animal a){
        this(a.peso, a.fechaNac);
    }
    
    public Animal(){
        this.peso = 0;
        this.fechaNac = new Fecha();
    }

    public int getPeso(){
        return this.peso;
    }
    
    public Fecha getFecha(){
        return this.fechaNac;
    }
    
    public void setPeso(int peso){
        try{
            if(peso < 0 || peso > 5000)
                throw new ArithmeticException("Peso menor o mayor");
            this.peso=peso;
        } catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public void setFecha(Fecha f){
        this.fechaNac.setDia(f.getDia());
        this.fechaNac.setMes(f.getMes());
        this.fechaNac.setAnyo(f.getAnyo());
    }
    
    public void setAnimal(int peso, int d, int m, int y){
        try{
            if(peso<0 || peso>5000)
                throw new ArithmeticException("El peso no puede ser menor de 0 ni superior de 5000");
            this.peso=peso;
            this.fechaNac.setDia(d);
            this.fechaNac.setMes(m);
            this.fechaNac.setAnyo(y);
        } catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    public void setAnimal(int peso, Fecha f){
        this.setAnimal(peso, f.getDia(), f.getMes(), f.getAnyo());
    }
    
    public void setAnimal(Animal a){
        this.setAnimal(a.getPeso(), a.getFecha());
    }
    
    
}
