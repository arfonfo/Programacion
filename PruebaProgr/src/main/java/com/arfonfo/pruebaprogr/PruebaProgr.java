

package com.arfonfo.pruebaprogr;

/**
 *
 * @author alfon
 */
public class PruebaProgr {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(9, 5);
        Figura f;
        Figura f2;
        
        
        // No se puede crear un objeto de la clase abstracta Figura
        // Pero puedo hacer que apunte a una subclase y usar sus métodos
        
        f=r;
        
        f2 = new Rectangulo(3, 4);
        
        System.out.println("El área es " + f.area());
        System.out.println("El área es " + f2.area());
        
        // Incluso se puede castear para que use los métodos que no tiene
        // en común 
        ((Rectangulo)f).soyUnRectangulo();
        
        if(f instanceof Rectangulo)
            System.out.println("La figura es un rectángulo");
        
        System.out.println(f.getClass().toString());
        
        
        double[] dobles = {0.0, 0.3, 34.5};
        int j = 3;
        
        ejemplo3(dobles, j); // da error porque está comprobando que sea igual que length
        
    }
    
    static double ejemplo3(double v[],int j)
    {
        try
        {
            // habría que poner j < v.length o j<=v.length-1
            if ((0 <= j) && (j <= v.length))return v[j];
            else 
            {
               // throw new RuntimeException ("El indice " + j + " no existe en el vector");
               // throw new Exception ("El indice " + j + " no existe en el vector");
                throw new IllegalArgumentException("El indice " + j + " no existe en el vector");

            }
        }
        catch (IllegalArgumentException e){System.out.println("Excepcion propia capturada"); return -1;}
        catch (Exception exc){ System.out.println("error general:  " + exc);return -1;}
        finally{
            // Lo muestra siempre, haga el catch o no
            System.out.println("Me lo muestra siempre");
        }
        

    }
    
}
