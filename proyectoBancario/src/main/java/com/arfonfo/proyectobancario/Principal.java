

package com.arfonfo.proyectobancario;

/**
 *
 * @author alfon
 */
public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("878723", 1000, "77757070G");
        CuentaBancaria cuentas[] = {cuenta};
        Cliente cli1 = new Cliente("Alfonso", cuenta.Obtener_dni(), cuentas.length, cuentas);
        cli1.Anadir_Cuenta_Parametro(cuenta);
        
        CuentaBancaria cuenta2 = new CuentaBancaria("ES21003456", 21000, "77757071X");
        CuentaBancaria cuentas2[] = {cuenta2};
        Cliente cli2 = new Cliente("arfonfo", cuenta2.Obtener_dni(), cuentas2.length, cuentas2);
        
        cli2.Anadir_Cuenta_Parametro(cuenta2);
        
        cli2.Ver_Datos_Cliente();
        cli1.Ver_Datos_Cliente();
        
        System.out.println("");
        
        cli1.Anadir_Cuenta();
        
        cli1.Ver_Datos_Cliente();
        
        cli1.Ingresar_Cuenta();
        
        cli1.Reintegro_Cuenta();
        
        cli1.Ver_Datos_Cliente();
        
        cli1.setCuenta(cli1.Cuentas_Ordenadas());
        
        for (int i = 0; i < cli1.getCuenta().length; i++) {
            cli1.getCuenta()[i].Ver_Datos_Cuenta();
        }
        
        cli1.Transferencia_cuenta_a_cuenta(cli2.getCuenta()[0], 2000);
                
        
//        cli1.Borrar_cuenta_cliente();
        
        cli1.Ver_Datos_Cliente();
        
        System.out.println("El saldo total es " + cli1.Saldo_total_cliente());
        
        cli1.Maxima_cuenta_cliente();

        

//        cuenta.Ingresar(500);
//        cuenta.Reintegro(600);
//        cuenta.Ingresar(2000);
//        cuenta.Reintegro(800);
//        
//        cuenta.setDNI();
//        
//        CuentaBancaria cuenta2 = new CuentaBancaria();
//        cuenta.Transferencia_cuenta_a_cuenta(cuenta2, 100);
//        
//        CuentaBancaria[] cuentas = {cuenta, cuenta2};
//        
//        Cliente cl1 = new Cliente("alfon", "77757070G", 10);
//        
//        cl1.Ver_Datos_Cliente();
//        
//        
//        Cliente cl2 = new Cliente();
//        
//        cl2.Anadir_Cuenta_Parametro(cuenta2);
//        
//        cl2.Anadir_Cuenta();
//        
//        cl2.Ver_Datos_Cliente();

         
    }
}
