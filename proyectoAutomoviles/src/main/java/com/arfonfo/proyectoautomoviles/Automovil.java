
package com.arfonfo.proyectoautomoviles;

import java.util.Scanner;


public class Automovil {
    private String matricula;
    private String marca;
    private String modelo;
    private String propietario;
    private int potencia;
    private double precio;
    private boolean descapotable;

    public Automovil(){}

    public Automovil(String matricula, String marca, String modelo, String propietario, int potencia, double precio, boolean descapotable) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.potencia = potencia;
        this.precio = precio;
        this.descapotable = descapotable;
    } 
    
    public void Ver_Datos_Automovil(){
        System.out.println("El automóvil posee las siguientes características:\nMatrícula: " + matricula.toUpperCase() + "\nMarca: " + marca 
                + "\nModelo: " + modelo + "\nPropietario: " + propietario + "\nPotencia: " + potencia + "\nPrecio: " + precio + "\nDescapotable: " + 
                ((descapotable) ? "Sí" : "No"));
    }
    
    public void Introducir_Datos_Automovil(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la matrícula del automóvil: ");
        this.matricula = sc.nextLine();
        while (!validarMatricula(this.matricula)) {
        System.out.println("Matrícula inválida. Por favor, ingrese una matrícula válida: ");
        this.matricula = sc.nextLine();
        }
        
        System.out.println("Introduce la marca del automóvil: ");
        this.marca = sc.nextLine();
        System.out.println("Introduce el modelo del automóvil: ");
        this.modelo = sc.nextLine();
        System.out.println("Introduce el propietario del automóvil: ");
        this.propietario = sc.nextLine();
        
        boolean potenciaValida = false;
        while(!potenciaValida){
            System.out.println("Introduce la potencia del automóvil: ");
            int potenciaVal = sc.nextInt();
            if(potenciaVal > 0) {
                this.potencia = potenciaVal;
                potenciaValida = true;
            } else {
                System.out.println("La potencia debe ser mayor a 0");
            }
        }
        
        boolean precioValido = false;
        while(!precioValido){
            System.out.println("Introduce el precio del automóvil: ");
            double precioVal = sc.nextDouble();
            if(precioVal > 0) {
                this.precio = precioVal;
                precioValido = true;
            } else {
                System.out.println("El precio debe ser mayor a 0");
            }
        }
        
        System.out.println("Indica si el coche es descapotable o no (S|N): ");
        this.descapotable = sc.next().equalsIgnoreCase("S");
    }
        
    private boolean validarMatricula(String matricula){
        matricula = matricula.toUpperCase();
        return (matricula.matches("^[0-9]{4}[A-Z]{3}"));
    }
         
    
    public void Cambiar_Datos_Automovil(String matricula, String marca, String modelo, String propietario, int potencia, double precio, boolean descapotable){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.potencia = potencia;
        this.precio = precio;
        this.descapotable = descapotable;
    }
    
    public boolean Comparar_Potencia_Automoviles(Automovil a){
        return (this.potencia > a.potencia);
    }

    // Método estático que no necesita crear un objeto para poder utilizarse
    public static boolean Comparar_Precio_Automoviles(Automovil a, Automovil b){
        return (a.precio > b.precio);
    }
    
    
    
}
