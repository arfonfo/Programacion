/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameninterfaces;

/**
 *
 * @author alfon
 */
public class Profesor extends Persona{
    private double salario;
    private boolean fijo;

    public Profesor() {
    }

    public Profesor(double salario, boolean fijo, String nombre, String DNI) {
        super(nombre, DNI);
        this.salario = salario;
        this.fijo = fijo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }
    
    
    public double calcularSalario(double retencionIRPF, int antiguedad) {
                
        return salario - (salario*retencionIRPF/100) + (antiguedad*50);
    }
    

    @Override
    public String toString() {
        return super.toString() + " salario= " + salario + ", fijo= " + fijo;
    }
    
    
    
    
}
