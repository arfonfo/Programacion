

package com.arfonfo.dinerollamada;

import java.util.Scanner;


public class DineroLlamada {

    public static void main(String[] args) {
        int tiempoLlamada;
        double coste;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Indique los minutos que necesita para hacer la llamada: ");
        tiempoLlamada = teclado.nextInt();
        
        if(tiempoLlamada < 3){
            System.out.println("Su llamada tendrá un coste de 0,25€");
        } else {
            coste = 0.25 + ((tiempoLlamada - 3)*0.06);
            System.out.println("Su llamada tendrá un coste de " + coste + " €");
        }

    }
}
