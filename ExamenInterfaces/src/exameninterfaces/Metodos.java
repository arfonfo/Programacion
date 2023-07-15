package exameninterfaces;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase Metodos, contiene métodos estaricos sueltos
 * @author Disco Duro de Roer
 */
public class Metodos {

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    
    public static void mostrarImagen(JLabel lbl, String ruta){
        
        lbl.setIcon(new ImageIcon(ruta));
        
    }
    
    
    public static void validarDNI (String DNI) throws DNIException{
        
        /* Valida un DNI Comprueba si tiene entre 8 y 9 caracteres Comprueba si la
        * parte numerica es correcta Comprueba si la letra es correcta Comprueba si
        * el numero y la letra es corrrecta */
        
        // Comprobamos la longitud del DNI
        if (!(DNI.length() >= 8 && DNI.length() <= 9)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
        
        
        // saco la parte numérica
        String parte_numerica = DNI.substring(0, DNI.length() - 1);
        
        // aqui guardare el DNI
        int numeroDNI = 0;
        
        try {
            // Lo transformo en un número
            // Puede saltar la excepción
            
            numeroDNI = Integer.parseInt(parte_numerica);
            
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }
        
        // Cojo la letra del DNI y compruebo que se encuentre entre A y Z
        char letra = DNI.substring(DNI.length() - 1, DNI.length()).toUpperCase().charAt(0);
        
        if(!(letra >= 'A' && letra <= 'Z')) {
            throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);
        }
        
        
        // Validamos el formato
        final int DIVISOR = 23;
        
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Dividimos la parte numérica entre el número de letras posibles
        int resto = numeroDNI % DIVISOR;
        
        // El resto que nos da es la posición de la letra asignada al DNI
        String nuevoDNI = numeroDNI + "" + letrasNIF[resto];
        
        // Metemos la condición por si el DNI comienza por 0
        if (DNI.startsWith("0")) {
            nuevoDNI = "0" + nuevoDNI;
        }
        
        // Comprobamos que la letra del DNI pasado como parámetro sea igual a la letra generada
        if(!(nuevoDNI.equals(DNI))) {
            throw new DNIException(DNIException.FORMATO_NO_CORRECTO);
        }
        
    }

}
