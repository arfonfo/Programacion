

package com.arfonfo.salariotrabajador;

import java.util.Scanner;


public class SalarioTrabajador {
   
    
    
    public static void main(String[] args) {
        double horas, salarioHora, salarioBruto, salarioNeto, impuestos;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el número de horas semanales del trabajador: ");
        horas = teclado.nextDouble();
        
        System.out.println("¿Cuál es su salario por hora?: ");
        salarioHora = teclado.nextDouble();
        
        
        
        switch ((horas <= 35) ? 1 : 2) {
            case 1:
                    salarioBruto = horas*salarioHora;
                    impuestos = calculoImpuestos(salarioBruto);
                    salarioNeto = salarioBruto-impuestos;
                    System.out.println("El salario Bruto es " + salarioBruto + ", el impuesto aplicado es " + impuestos + ", y el salario Neto es " + salarioNeto);
                break;
            case 2:
                    salarioBruto = (35*salarioHora) + ((horas-35)*(salarioHora*1.5));
                    impuestos = calculoImpuestos(salarioBruto);
                    salarioNeto = salarioBruto-impuestos;
                    System.out.println("El salario Bruto es " + salarioBruto + ", el impuesto aplicado es " + impuestos + ", y el salario Neto es " + salarioNeto);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    
    
    public static double calculoImpuestos(double salario){
        
        double impuestos;
        
        switch ((salario >= 200) ? 1 : 2) {
            case 1:
                impuestos = (100*10/100) + ((salario-200)*25/100);
                break;
            case 2:
                impuestos = ((salario-100)*10/100);
                break;
            default:
                throw new AssertionError();
        }
        
        return impuestos>=0 ? impuestos : 0;
    }
    
    
}
