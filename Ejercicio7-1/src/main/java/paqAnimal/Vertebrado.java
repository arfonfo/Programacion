
package paqAnimal;

import paqFecha.Fecha;

/**
 *
 * @author alfon
 */
public class Vertebrado extends Animal{
        private int numVertebras;

    public Vertebrado() {
        super();
        this.numVertebras = 0;
    }

    public Vertebrado(int numVertebras, int p, int d, int m, int a) {
        super(p, d, m, a);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(int numVertebras, int p, Fecha f) {
        super(p, f);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(int numVertebras, Animal a) {
        super(a);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(Vertebrado v) {
        super(v);
        this.setNumVertebras(v.getNumVertebras());
    }

    public int getNumVertebras() {
        return numVertebras;
    }

    public void setNumVertebras(int numVertebras) {
        try {
            if(numVertebras < 0 || numVertebras > 1000)
                throw new ArithmeticException("El número de vértebras no puede ser menor de 0 ni mayor de 1000");
            this.numVertebras = numVertebras;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
        } catch (Exception e) {
            System.out.println("Error al introducir el dato");
        }
        
    }
    
    public void setVertebrado(int numVertebras, int p, int d, int m, int a){
        super.setAnimal(p, d, m, a);
        this.setNumVertebras(numVertebras);
    }
    
    public void setVertebrado(int numVertebras, Fecha f, int p){
        super.setAnimal(p, f);
        this.setNumVertebras(numVertebras);
    }
    
    public void setVertebrado(Animal a, int numVertebras){
        super.setAnimal(a);
        this.setNumVertebras(numVertebras);
    }
    
    public void setVertebrado(Vertebrado v){
        super.setAnimal(v.getPeso(), v.getFechaNac());
        this.setNumVertebras(numVertebras);
    }

    @Override
    public String toString() {
        return super.toString() + "Vertebrado{" + "numVertebras=" + numVertebras + '}';
    }
    
    
    
        
        
}
