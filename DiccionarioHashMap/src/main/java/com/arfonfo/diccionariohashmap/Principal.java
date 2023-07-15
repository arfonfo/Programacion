
package com.arfonfo.diccionariohashmap;

/**
 *
 * @author alfon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiccionarioHashMap dic1=new DiccionarioHashMap();
        
        dic1.addEntrada("alfon", "máquina");
        dic1.addEntrada("alfon2", "máquina2");
        dic1.addEntrada("alfon3", "máquina3");
        dic1.addEntrada("alfon4", "máquina4");
        
        dic1.listado();
    }
    
}
