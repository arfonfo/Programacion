
package com.arfonfo.proyectonif;

/**
 *
 * @author alfon
 */
public class Nif {
    private String nif;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public Nif(String nif) throws IllegalArgumentException{
        this.setNif(nif);
    }
    
    public Nif(int NIF) throws IllegalArgumentException{
        this.setNif(NIF);
    }
    
    public Nif(Nif n){
        this(n.nif);
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public void setNif(String NIF) throws IllegalArgumentException{
        NIF = NIF.trim().toUpperCase();
        String expr = "^[0-9]{1,8}-[TRWAGMYFPDXBNJZSQVHLCKE]";
        if(NIF.matches(expr)){
            String digitosNif = NIF.substring(0, NIF.length()-2);
            int numero = Integer.parseInt(digitosNif);
            int resto = numero%23;
            char letra = LETRAS.charAt(resto);
            if(letra != NIF.charAt(NIF.length()-1)){
                throw new IllegalArgumentException("Letra incorrecta");
            }
            
            // Método para rellenar con 0's por la izquierda
            if(digitosNif.length() < 8){
                int l = digitosNif.length();
                while(l < 8){
                    digitosNif = "0" + digitosNif;
                    l++;
                }
            }
            
            // lo despiezamos y comprobamos que la letra y el formato sean correctos
            this.nif = digitosNif + "-" + letra;
            
        } else {
            throw new IllegalArgumentException("DNI incorrecto, introduce 12345678-Z");
        }
    }
    
    public void setNif(int NIF) throws IllegalArgumentException{
        String comprueba = String.valueOf(NIF);
        if(comprueba.length() <=8){
            int resto = NIF%23;
            char letra = LETRAS.charAt(resto);
            int l = comprueba.length();
            
            while(l < 8){
                comprueba = "0" + comprueba;
                l++;
            }
            
            this.nif = comprueba +"-"+ letra;
            
        }else{
            throw new IllegalArgumentException("DNI incorrecto. Introduzca 8 dígitos o menos");
        }
    }
    
    public void setNif(Nif n){
        this.setNif(n.nif);
    }
    
    @Override
    public String toString(){
        return this.nif;
    }
    
    public boolean equals(Nif n){
        return this.nif.equals(n.nif);
    }
    
}
