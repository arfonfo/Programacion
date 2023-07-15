
package com.arfonfo.proyectoanimal;

/**
 *
 * @author alfon
 */
public class ProyectoAnimal {

    public static void main(String[] args) {
        
        // Ejemplo de transformar entero en cadena
        int a = 8;
        String cadena;
        
        cadena = a + "";
        System.out.println(cadena);
        
        Vertebrado v = new Vertebrado(5, 50, 1, 11, 1990);
        
        if(v instanceof Animal)
            System.out.println("Es un animal");
        
        if(v instanceof Vertebrado)
            System.out.println("es un vertebrado");
        
        Vertebrado v2 = new Vertebrado(v);
        
        System.out.println("Dia nac: " + v2.getFecha().getDia());
        
        String[] nH = new String[20];
        int[] eH = new int[20];
        
        Hombre h1 = new Hombre(v2, "Alfon", true, 0, nH, eH);
        
        h1.tenerHijos("Alfonsito", 1);
        h1.tenerHijos("P", 2);
        h1.tenerHijos("f", 3);
        h1.tenerHijos("as", 2);
        
        for (int i = 0; i < eH.length; i++) {
            if(eH[i]!=0)
                System.out.println(eH[i]);
        }
        
        for (int i = 0; i < nH.length; i++) {
            if(nH[i]!=null)
                System.out.println(nH[i]);
        }
        
        v2 = h1;
        
        // Haciendo casting
        System.out.println(((Hombre)v2).edadHijoMenor());
        
        System.out.println(h1.getNumHijos());
        
        System.out.println(h1.edadHijoMenor());
        System.out.println(h1.nombreHijoMenor());
        
        System.out.println(h1.lugarNombreHijo("kljklj"));
        
        System.out.println(h1.darNombre(1));
        System.out.println(h1.darNombre(11));
        
        h1.morir();
        
        h1.morir();
    }
}
