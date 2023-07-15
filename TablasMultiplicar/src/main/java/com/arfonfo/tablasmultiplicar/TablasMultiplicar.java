

package com.arfonfo.tablasmultiplicar;
import java.util.HashMap;

/**
 *
 * @author alfon
 */

///////////////////////////////////////////////////////////
// CLASE TABLAS DE MULTIPLICAR
/////////  Sin usar clases adicionales
//// Un HashMap dentro de otro

public class TablasMultiplicar {

    public static void main(String[] args) {
        HashMap <Integer, HashMap> tablaGeneral = new HashMap();
        
        for (int i = 0; i < 10; i++) {
            HashMap <Integer, Integer> subtabla = new HashMap();
            for (int j = 0; j < 10; j++) {
                subtabla.put(j, i*j);
            }
            tablaGeneral.put(i, subtabla);
        }

        
        for(Integer clave : tablaGeneral.keySet()){
            System.out.println("________________________________");
            System.out.println("Tabla del número " + clave);
            HashMap <Integer, Integer> subtabla = tablaGeneral.get(clave);
            for (Integer clave2 : subtabla.keySet()) {
                System.out.println(clave + " X " + clave2 + " = " + subtabla.get(clave2).intValue());
            }
            System.out.println("");
        }
        
        
        
    }
}
