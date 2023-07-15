
package com.arfonfo.proyectobancario;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class CuentaBancaria {
    
    private String Iban;
    private double Saldo;
    private String Dni_propietario;

    protected CuentaBancaria() {
        this.Iban = "";
        this.Saldo = 0;
        this.Dni_propietario = "";
    }
      
    protected CuentaBancaria(String Iban, double Saldo, String Dni_propietario) {
        this.Iban = Iban;
        this.Saldo = Saldo;
        this.Dni_propietario = Dni_propietario;
    }
    
    protected void setIban (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el IBAN de tu cuenta: ");
        this.Iban = sc.nextLine();
    }
    
    protected void setDNI (){
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Introduce tu DNI (8 números y 1 letra): ");
            this.Dni_propietario = sc.nextLine();
            if(!validarFormatoDNI(Dni_propietario))
                System.out.println("El formato introducido no es válido");
        } while (!validarFormatoDNI(Dni_propietario));
    }
    
    private static boolean validarFormatoDNI(String dni) {
        return dni.matches("^[0-9]{8}[A-Z]$");
    }
    
    protected void setSaldo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Saldo inicial de tu cuenta: ");
        this.Saldo = sc.nextDouble();
    }
    
    protected double Obtener_saldo(){
        return this.Saldo;
    }
    
    protected String Obtener_dni(){
        return this.Dni_propietario;
    }
    
    protected String Obtener_iban(){
        return this.Iban;
    }
    
    protected void Ingresar(double ingreso){
        this.Saldo += ingreso;
        System.out.println("El saldo actual de la cuenta " + this.Iban + " es de: " + this.Saldo);
    }
    
    protected void Reintegro(double sacar){
        Scanner sc = new Scanner(System.in);
        if(this.Saldo < 0){
            System.out.println("Su cuenta actualmente se encuentra en números rojos.\nNo puede retirar dinero.");
        } else if(this.Saldo<sacar){
            System.out.println("La cantidad que desea retirar está por encima de su saldo actual.");
            System.out.println("¿Desea continuar? (Sí/No)");
            String descubierto = sc.nextLine();
            if(descubierto.equalsIgnoreCase("Sí") || descubierto.equalsIgnoreCase("si"))
                this.Saldo -= sacar;
        } else {
            this.Saldo -= sacar;
            System.out.println("El saldo actual de la cuenta " + this.Iban + " es de: " + this.Saldo);;
        }
        
    }
    
    protected void Transferencia_cuenta_a_cuenta(CuentaBancaria cuenta2, double ingreso){
        if(cuenta2==null){
            System.out.println("La cuenta a la que intenta hacer el ingreso no existe");
        } else if (this.Saldo <= 0){
            System.out.println("No dispone de Saldo en su cuenta.");
            System.out.println("Su saldo actual es de " + this.Saldo);
        } else if(this.Saldo < ingreso){
            System.out.println("No dispone de saldo suficiente en la cuenta para hacer la transferencia.");
            System.out.println("Su saldo actual es de " + this.Saldo);
        } else {
            cuenta2.Ingresar(ingreso);
            System.out.println("La transferencia se ha realizado con éxito.\nSe le aplicará una comisión del 1%");
            this.Reintegro(ingreso+(ingreso/100));
        }
    }
    
    protected boolean Comparar_saldo_cuentas(CuentaBancaria cuenta2){
        return this.Obtener_saldo() > cuenta2.Obtener_saldo();
    }
    
    protected void Ver_Datos_Cuenta(){
        System.out.println("La cuenta perteneciente al propietario " + this.Dni_propietario + " con IBAN " + this.Iban + " tiene " + this.Saldo + " de saldo");
    }
    
}
