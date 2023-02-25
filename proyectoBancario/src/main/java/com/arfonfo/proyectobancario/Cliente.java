package com.arfonfo.proyectobancario;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Cliente {

    private String nombre;
    private String dni_propietario;
    private int num_cuentas;
    private CuentaBancaria Cuenta[];

    public Cliente() {
        this.nombre = "";
        this.dni_propietario = "";
        this.num_cuentas = 0;
        this.Cuenta = new CuentaBancaria[num_cuentas];
    }

    public Cliente(String nombre, String dni_propietario, int num_cuentas, CuentaBancaria[] Cuenta) {
        this.nombre = nombre;
        this.dni_propietario = dni_propietario;
        this.num_cuentas = num_cuentas;
        this.Cuenta = Cuenta;
    }

    public void setCuenta(CuentaBancaria[] Cuenta) {
        this.Cuenta = Cuenta;
    }

    public CuentaBancaria[] getCuenta() {
        return Cuenta;
    }

    protected void Ver_Datos_Cliente() {
        System.out.println("El cliente " + this.nombre + " con DNI: " + this.dni_propietario + " posee un total de " + this.num_cuentas + " cuentas");
        System.out.println("La información de las mismas es la siguiente:");
        for (int i = 0; i < this.Cuenta.length; i++) {
            this.Cuenta[i].Ver_Datos_Cuenta();
        }
    }
    
    // Devuelve true si la cuenta que intentamos introducir ya existe
    protected boolean existe_cuenta(CuentaBancaria c){
        for (int i = 0; i < this.Cuenta.length; i++) {
            if (c.Obtener_iban().equalsIgnoreCase(this.Cuenta[i].Obtener_iban())) {
                return true;
            }
        }
        return false;
    }

    protected void Anadir_Cuenta() {
        CuentaBancaria[] aux = new CuentaBancaria[this.Cuenta.length + 1];

        System.arraycopy(this.Cuenta, 0, aux, 0, this.Cuenta.length);

        aux[aux.length - 1] = new CuentaBancaria();
        aux[aux.length - 1].setIban();
        aux[aux.length - 1].setDNI();
        aux[aux.length - 1].setSaldo();

        if (!existe_cuenta(aux[aux.length - 1])) {
            this.Cuenta = aux;
            this.num_cuentas++;
            System.out.println("La cuenta se ha añadido con éxito");
        } else {
            System.out.println("La cuenta que quiere insertar ya existe.");
        }

    }

    protected void Anadir_Cuenta_Parametro(CuentaBancaria c) {
        if(existe_cuenta(c)){
            System.out.println("La cuenta que intenta introducir ya pertenece al cliente.");
        } else {
            CuentaBancaria[] aux = new CuentaBancaria[this.Cuenta.length + 1];

            System.arraycopy(this.Cuenta, 0, aux, 0, this.Cuenta.length);

            aux[aux.length - 1] = c;

            this.Cuenta = aux;

            this.num_cuentas++;

            System.out.println("La cuenta se ha añadido con éxito");
        }
    }

    protected int Elegir_Cuenta() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.Cuenta.length; i++) {
            System.out.println((i + 1) + ". " + this.Cuenta[i].Obtener_iban());
        }
        return (sc.nextInt() - 1);
    }

    protected void Ingresar_Cuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la cuenta en la que deseas ingresar el dinero: ");
        int num_cuenta = this.Elegir_Cuenta();
        System.out.println("¿Qué cantidad deseas ingresar?");
        this.Cuenta[num_cuenta].Ingresar(sc.nextDouble());
    }

    protected void Reintegro_Cuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ELige la cuenta de la que deseas retirar el dinero: ");
        int num_cuenta = this.Elegir_Cuenta();
        System.out.println("¿Qué cantidad deseas retirar?");
        this.Cuenta[num_cuenta].Reintegro(sc.nextDouble());
    }
    
    protected void Transferencia_cuenta_a_cuenta(CuentaBancaria c, double cantidad) {
        boolean mismaCuenta;
        do {            
            System.out.println("Elige la cuenta desde la que deseas hacer la transferencia: ");
            int num_cuenta = Elegir_Cuenta();
            if(this.Cuenta[num_cuenta] == c){
                System.out.println("No se pueden hacer transferencias entre una misma cuenta");
                mismaCuenta = true;
            } else if (this.Cuenta[num_cuenta].Obtener_saldo() < cantidad) {
                System.out.println("La cuenta que ha seleccionado no tiene fondos suficientes para realizar la transferencia.");
                mismaCuenta = false;
            } else if (existe_cuenta(c)) {
                this.Cuenta[num_cuenta].Reintegro(cantidad);
                c.Ingresar(cantidad);
                System.out.println("La transferencia entre sus cuentas se ha realizado con éxito");
                mismaCuenta = false;
            } else {
                this.Cuenta[num_cuenta].Transferencia_cuenta_a_cuenta(c, cantidad);
                mismaCuenta = false;
            }
            
        } while (mismaCuenta);
       
        
    }
    
    protected void Borrar_cuenta_cliente(){
        System.out.println("Seleccione la cuenta que desea eliminar: ");
        int borrar = Elegir_Cuenta();
        double saldo_borrar = this.Cuenta[borrar].Obtener_saldo();
        System.out.println("");
        System.out.println("El saldo de la cuenta que desea eliminar es de: " + saldo_borrar);
        // FINALIZE NO LA ELIMINA DEL ARRAY
//        this.Cuenta[borrar].finalize();

        // Si la cuenta a borrar es la última del array, aquí ya la he borrado
        CuentaBancaria[] aux = new CuentaBancaria[this.Cuenta.length-1];
        
        System.arraycopy(this.Cuenta, 0, aux, 0, borrar);
        // Si la cuenta que quiero borrar no es la última
        if(borrar!=this.Cuenta.length-1)
            System.arraycopy(this.Cuenta, borrar+1, aux, borrar, aux.length);
        this.Cuenta = aux;
        this.num_cuentas--;
        System.out.println("");
        System.out.println("Seleccione la cuenta a la que desea transferir el saldo de la cuenta eliminada: ");
        int saldo_borrada = Elegir_Cuenta();
        this.Cuenta[saldo_borrada].Ingresar(saldo_borrar);
        System.out.println("");
    }
    
    protected double Saldo_total_cliente(){
        double saldoTotal =0;
        for (int i = 0; i < Cuenta.length; i++) {
            saldoTotal += this.Cuenta[i].Obtener_saldo();
        }
        return saldoTotal;
    }
    
    protected void Maxima_cuenta_cliente() {
        System.out.println("Su cuenta con mayor saldo es: ");
        Cuentas_Ordenadas()[0].Ver_Datos_Cuenta();
    }
    
    protected CuentaBancaria[] Cuentas_Ordenadas() {
        CuentaBancaria[] Cuentas_desc = new CuentaBancaria[this.Cuenta.length];
        System.arraycopy(this.Cuenta, 0, Cuentas_desc, 0, this.Cuenta.length);
        CuentaBancaria aux = new CuentaBancaria();

        for (int i = 0; i < Cuentas_desc.length - 1; i++) {
            if (!Cuentas_desc[i].Comparar_saldo_cuentas(Cuentas_desc[i + 1])) {
                aux = Cuentas_desc[i + 1];
                Cuentas_desc[i + 1] = Cuentas_desc[i];
                Cuentas_desc[i] = aux;
            }
        }
        return Cuentas_desc;
    }

}
