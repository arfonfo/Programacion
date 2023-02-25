
package com.arfonfo.notacorrecta;

import java.util.Scanner;


public class NotaCorrecta {

    public static void main(String[] args) {
        double nota;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la nota del alumno: ");
        nota = teclado.nextDouble();
        
        switch ((nota<=4 && nota>=0) ? 0 : (nota>=5 && nota<6) ? 1 : (nota>=6 && nota<7) ? 2 : (nota>=7 && nota<=8) ? 3 : (nota>=9 && nota<=10) ? 4 : 5) {
            case 0:
                    System.out.println("SUSPENSO");
                break;
            case 1:
                    System.out.println("APROBADO");
                break;
            case 2:
                    System.out.println("BIEN");
                break;
            case 3:
                    System.out.println("NOTABLE");
                break;
            case 4:
                    System.out.println("SOBRESALIENTE");
                break;
            case 5:
                    System.out.println("El valor introducido no es correcto.");
                break;
            default:
                throw new AssertionError();
        }
    }
}
