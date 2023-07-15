
package com.arfonfo.proyectocoche;

import java.util.Objects;

/**
 *
 * @author alfon
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private String cambio;
    private int numPuertas;
    private int precio;

    public Coche() {
        this.marca = "Ferrari";
        this.modelo = "";
        this.numPuertas = 3;
        this.precio = 0;
        this.color = "BLANCO";
        this.combustible = "GASOLINA";
        this.cambio = "MANUAL";
    }

    public Coche(String marc, String mod, String col, String comb, String camb, int numP, int prec) {
        // LA MEJOR OPCION ES LLAMAR A LOS SETTERS DESDE EL CONSTRUCTOR Y HACER LAS EXCEPCIONES PERSONALIZADAS DESDE AHÍ
        try {
            
            quitarEspaciosMayusculas(marc);
            quitarEspaciosMayusculas(mod);
            quitarEspaciosMayusculas(col);
            quitarEspaciosMayusculas(comb);
            quitarEspaciosMayusculas(camb);
            
//            if((numP<3) || (numP > 5))
//                throw new IllegalArgumentException("El número de puertas debe ser de 3, 4, ó 5");
//            
//            if(prec < 0)
//                throw new IllegalArgumentException("El precio no puede ser menor de cero");
//            
//            if(!comb.equalsIgnoreCase("Diesel") && !comb.equalsIgnoreCase("Gasolina"))
//                throw new IllegalArgumentException("El combustible debe ser Diesel o Gasolina");
//            
//            if(!camb.equalsIgnoreCase("Manual") && !camb.equalsIgnoreCase("Automatico"))
//                throw new IllegalArgumentException("El cambio del coche debe ser Manual o Automático");
            
            this.setMarca(marc);
            this.setModelo(mod);
            this.setColor(col);
            this.setCombustible(comb);
            this.setCambio(camb);
            this.setNumPuertas(numP);
            this.setPrecio(prec);
            
//        } catch (IllegalArgumentException e) {
//            System.out.println("Alguno de los parámetros introducidos no es correcto " + e.toString());
        } catch (Exception e) {
            System.out.println("Error general" + e.toString());
        }
    }
    
    public Coche(Coche c){
        this.marca = c.marca;
        this.modelo = c.modelo;
        this.color = c.color;
        this.combustible = c.combustible;
        this.cambio = c.cambio;
        this.numPuertas = c.numPuertas;
        this.precio = c.precio;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = quitarEspaciosMayusculas(marca);
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = quitarEspaciosMayusculas(modelo);
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = quitarEspaciosMayusculas(color);
    }

    protected String getCombustible() {
        return combustible;
    }

    protected void setCombustible(String combustible) {
        try {
            if(!combustible.equalsIgnoreCase("Diesel") && !combustible.equalsIgnoreCase("Gasolina"))
                throw new IllegalArgumentException("El combustible debe ser Diesel o Gasolina");
            this.combustible = quitarEspaciosMayusculas(combustible);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
        
    }

    protected String getCambio() {
        return cambio;
    }

    protected void setCambio(String cambio) {
        try {
            if(!cambio.equalsIgnoreCase("Manual") && !cambio.equalsIgnoreCase("Automatico"))
                throw new IllegalArgumentException("El cambio del coche debe ser Manual o Automático");
            this.cambio = quitarEspaciosMayusculas(cambio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
        
    }

    protected int getNumPuertas() {
        return numPuertas;
    }

    protected void setNumPuertas(int numPuertas) {
        try {
            if((numPuertas<3) || (numPuertas > 5))
                throw new IllegalArgumentException("El número de puertas debe ser de 3, 4, ó 5");
            this.numPuertas = numPuertas;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
        
        
    }

    protected int getPrecio() {
        return precio;
    }

    protected void setPrecio(int precio) {
        try {
            if(precio < 0)
                throw new IllegalArgumentException("El precio no puede ser menor de cero");
            this.precio = precio;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible + ", cambio=" + cambio + ", numPuertas=" + numPuertas + ", precio=" + precio + '}';
    }
    
    
    static private String quitarEspaciosMayusculas(String cadena){
        return cadena.toUpperCase().replaceAll(" ", "");
    }
    
    protected boolean equals(Coche c1){
        return ((this.marca.equals(c1.marca)) && (this.modelo.equals(c1.modelo)) && (this.color.equals(c1.color)) 
                && (this.combustible.equals(c1.combustible)) && (this.cambio.equals(c1.cambio)) && (this.numPuertas == c1.numPuertas) 
                && (this.precio == c1.precio));
    }

    protected boolean equals(String marc, String mod, String col, String comb, String camb, int numP, int prec){
        return ((this.marca.equalsIgnoreCase(marc)) && (this.modelo.equalsIgnoreCase(mod)) && (this.color.equalsIgnoreCase(col)) 
                && (this.combustible.equalsIgnoreCase(comb)) && (this.cambio.equalsIgnoreCase(camb)) && (this.numPuertas == numP) 
                && (this.precio == prec));

    }
    
    
    
}
