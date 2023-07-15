/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameninterfaces;

/**
 *
 * @author alfon
 */
public class DNIException extends Exception {
    
    public static final String LONGITUD_NO_CORRECTA = "La longitud debe estar entre 8 y 9";
    public static final String PARTE_NUMERICA_NO_CORRECTA = "La parte numérica del DNI debe ser un número";
    public static final String PARTE_LETRA_NO_CORRECTA = "La parte de la letra del DNI debe ser una letra entre A y Z";
    public static final String FORMATO_NO_CORRECTO = "El DNI es incorrecto";

    public DNIException(String message) {
        super(message);
    }
    
    
}
