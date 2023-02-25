
package com.arfonfo.libreriamatematica;

/**
 *
 * @author alfon
 */
public class complejo {
    private double real;
    private double imaginaria;

    protected complejo() {
        this.real = 1;
        this.imaginaria = 0;
    }

    protected complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
    
    protected complejo(complejo c){
        this.real = c.getReal();
        this.imaginaria = c.getImaginaria();
    }

    protected double getReal() {
        return real;
    }

    protected void setReal(double real) {
        this.real = real;
    }

    protected double getImaginaria() {
        return imaginaria;
    }

    protected void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }  
    
    protected static boolean equals(complejo c1, complejo c2){
        return c1.getReal() == c2.getReal() && c1.getImaginaria() == c2.getImaginaria();
    }
    
    // ACEPTANDO POR PARÁMETRO EL NÚMERO COMPLEJO
    protected complejo complejoSuma(complejo c1){
        return new complejo((this.getReal()+c1.getReal()), (this.getImaginaria()+c1.getImaginaria()));
    }
    
    protected complejo complejoResta(complejo c1){
        return new complejo((this.getReal()+c1.getReal()), (this.getImaginaria()+c1.getImaginaria()));
    }
    
    protected complejo complejoProducto(complejo c1){
        return new complejo(((this.getReal()*c1.getReal())-(this.getImaginaria()*c1.getImaginaria())), 
                ((this.getReal()*c1.getReal())+(this.getImaginaria()*c1.getImaginaria())));
    }
    
    protected complejo complejoCociente(complejo c1){
        return new complejo(((this.getReal()*c1.getReal())+(this.getImaginaria()*c1.getImaginaria())) / ((c1.getReal()*c1.getReal())+(c1.getImaginaria()*c1.getImaginaria())), 
                (((this.getReal()*c1.getReal())-(this.getImaginaria()*c1.getImaginaria()) / ((c1.getReal()*c1.getReal())+(c1.getImaginaria()*c1.getImaginaria())))));
    }
    
    // ACEPTANDO POR PARÁMETRO LA PARTE REAL E IMAGINARIA
    protected complejo complejoSumaParam(double r1, double i1){
        return new complejo((this.getReal()+r1), (this.getImaginaria()+i1));
    }
    
    protected complejo complejoRestaParam(double r1, double i1){
        return new complejo((this.getReal()+r1), (this.getImaginaria()+i1));
    }
    
    protected complejo complejoProductoParam(double r1, double i1){
        return new complejo(((this.getReal()*r1)-(this.getImaginaria()*i1)), 
                ((this.getReal()*r1)+(this.getImaginaria()*i1)));
    }
    
    protected complejo complejoCocienteParam(double r1, double i1){
        return new complejo(((this.getReal()*r1) + (this.getImaginaria()*r1)) / (Math.pow(r1, 2) + Math.pow(i1, 2)), 
                (((this.getReal()*r1) - (this.getImaginaria()*i1) / (Math.pow(r1, 2) + Math.pow(i1, 2)))));
    }
    
    
    @Override
    public String toString() {
        return "El número complejo se compone de:" + "\nParte real=" + real + "\nParte imaginaria=" + imaginaria;
    }
    
    
}
