
package paqAnimal;

/**
 *
 * @author alfon
 */
import paqFecha.Fecha;


public class Animal {
    private int peso;
    private Fecha fechaNac;
    
    public Animal(int p, int d, int m, int a){
        this.setPeso(p);
        this.fechaNac = new Fecha(d, m, a);
    }
    
    public Animal(int p, Fecha f){
        this.setPeso(p);
        this.fechaNac = f;
    }
    
    public Animal(Animal a){
        this.peso = a.peso;
        this.fechaNac = a.fechaNac;
    }
    
    public Animal(){
        this.peso = 0;
        this.fechaNac = new Fecha();
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        try{
            if(peso < 0 || peso > 5000)
                throw new ArithmeticException("El peso no debe ser menor de 0 ni mayor de 5000");
            this.peso = peso;
        }catch(ArithmeticException e){
            System.out.println("Error " + e);
        } catch(Exception e){
            System.out.println("Error desconocido " + e);
        }
        
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public void setAnimal(int p, int d, int m, int a){
        this.setPeso(p);
        this.fechaNac = new Fecha(d, m, a);
    }
    
    public void setAnimal(int p, Fecha f){
        this.setPeso(p);
        this.setFechaNac(f);
    }
    
    public void setAnimal(Animal a){
        this.setPeso(a.getPeso());
        this.setFechaNac(a.getFechaNac());
    }

    @Override
    public String toString() {
        return "Animal: \n" + "peso = " + peso + " kg\n" + "fechaNac = " + fechaNac.toString();
    }
    
    
    
    
    
}
