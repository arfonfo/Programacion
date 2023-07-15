
package com.arfonfo.ejercicio6_3;

/**
 *
 * @author alfon
 */
public class Ejercicio6_3 {

    public static void main(String[] args) {
        
        Fecha f = new Fecha(28, 2, 1990);
        
//        f.setD(30);
//        f.setM(13);
        
        Fecha f2 = new Fecha("sdfsdgsd", "2", "2020");
        Fecha f3 = new Fecha("29", "2", "2020");
        
        System.out.println(f.toString(3));
        
    }
}
