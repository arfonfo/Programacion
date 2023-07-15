
package com.arfonfo.libreriamatematica;

/**
 *
 * @author alfon
 */
public class racional {
    private int numerador;
    private int denominador;
    
    protected racional(){
        this.numerador=1;
        this.denominador=1;
    }

    protected racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    protected int getNumerador() {
        return numerador;
    }

    protected void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    protected int getDenominador() {
        return denominador;
    }

    protected void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    protected static void inmersionEntero(int entero){
        System.out.println("El número entero equivale a: \n" + entero + "\n---\n" + 1 + "\n");
    }
    
    // Si no encuentra ningún número que sea el mcd devolverá un 1
    private static int mcd(int a, int b){
        int temp = Math.min(a, b);
        int aux=0;
        for (int i = 1; i <= temp; i++) {
            if(a%i==0 && b%i==0)
                aux=i;
        }
        return aux;
        
//        int temporal = 0;
//        while(b!=0){
//            temporal = b;
//            b = a % b;
//            a = temporal;
//        }
//        return a;
    }
    
    private static int mcm(int a, int b){
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        return (num1/mcd(a,b) *num2);
    }
    
    protected static boolean equivalencia(racional r1, racional r2){
        return r1.getNumerador()*r2.getDenominador()==r1.getDenominador()*r2.getNumerador();
    }
    
    protected racional simplificacion(){
        racional rac2= new racional();
        int maxcd = mcd(this.getNumerador(), this.getDenominador());
        rac2.setNumerador(this.getNumerador()/maxcd);
        rac2.setDenominador(this.getDenominador()/maxcd);
        return rac2;
    }

    protected static boolean orden(racional rac1, racional rac2){
        return rac1.getNumerador()*rac2.getDenominador() < rac2.getNumerador()*rac1.getDenominador();
    }
    
    protected racional suma(racional rac){
        racional rac2  = new racional();
        if(this.getDenominador()==rac.getDenominador()){
            rac2.setNumerador(this.getNumerador()+rac.getDenominador());
            rac2.setDenominador(this.getDenominador());
        } else {
            int denom = mcm(this.getDenominador(), rac.getDenominador());
            rac2.setDenominador(denom);
            rac2.setNumerador((this.getNumerador()*(denom/this.getDenominador()))+(rac.getNumerador()*(denom/rac.getDenominador())));
        }
        return rac2;
    }
    
    protected racional resta(racional rac){
        racional rac2  = new racional();
        if(this.getDenominador()==rac.getDenominador()){
            rac2.setNumerador(this.getNumerador()+rac.getDenominador());
            rac2.setDenominador(this.getDenominador());
        } else {
            int denom = mcm(this.getDenominador(), rac.getDenominador());
            rac2.setDenominador(denom);
            rac2.setNumerador((this.getNumerador()*(denom/this.getDenominador()))-(rac.getNumerador()*(denom/rac.getDenominador())));
        }
        return rac2;
    }

    protected racional multiplicacion(racional rac){
        racional rac2 = new racional();
        rac2.setNumerador(this.getNumerador()*rac.getNumerador());
        rac2.setDenominador(this.getDenominador()*rac.getDenominador());
        return rac2;
    }
    
    protected racional division(racional rac){
        racional rac2 = new racional();
        rac2.setNumerador(this.getNumerador()*rac.getDenominador());
        rac2.setDenominador(this.getDenominador()*rac.getNumerador());
        return rac2;
    }
    
    protected void mostrarRacional(){
        System.out.println("La fracción es: ");
        System.out.println("");
        System.out.println(this.getNumerador());
        System.out.println("---");
        System.out.println(this.getDenominador());
        System.out.println("");
    }
    
}
