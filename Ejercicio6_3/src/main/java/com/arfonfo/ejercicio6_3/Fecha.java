
package com.arfonfo.ejercicio6_3;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author alfon
 */
public class Fecha {
    private int d;
    private int m;
    private int a;
    // Se pone static porque es una misma copia para todos los objetos
    // que se creen de esta clase
    private static int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    public Fecha(){
        this.d=1;
        this.m=1;
        this.a=2000;
    }
    
    public Fecha(int d, int m, int a){
        try{
            if(!this.fechaCorrecta(d, m, a))
                throw new IllegalArgumentException("Fecha incorrecta");
            this.d=d;
            this.m=m;
            this.a=a;
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }
    
    public Fecha(String d, String m, String a){
        try{
            int dia = Integer.parseInt(d);
            int mes =Integer.parseInt(m);
            int ano = Integer.parseInt(a);
            try{
                if(!this.fechaCorrecta(dia, mes, ano))
                    throw new IllegalArgumentException("r");
                this.d=dia;
                this.m=mes;
                this.a=ano;
            } catch(IllegalArgumentException e){
                System.out.println("Error " + e.toString());
            }
        }catch(NumberFormatException e){
            System.out.println("Error " + e);
        }
    }
    
    public Fecha(Fecha f){
        this(f.d, f.m, f.a);
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        try{
            if(!this.fechaCorrecta(d, this.m, this.a))
                throw new IllegalArgumentException("Fecha incorrecta");
            this.d = d;
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }
        
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        try{
            if(!this.fechaCorrecta(this.d, m, this.a))
                throw new IllegalArgumentException("Fecha incorrecta");
            this.m = m;
        }catch(IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    public void setFecha(int d, int m, int a){
        try{
            if(!this.fechaCorrecta(d, m, a))
                throw new IllegalArgumentException("Fecha incorrecta");
            this.setD(d);
            this.setM(m);
            this.setA(a);
        } catch(IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public static void setFecha(Fecha f){
        Date hoy = new Date();
        f.setD(hoy.getDay());
        f.setM(hoy.getMonth());
        f.setA(hoy.getYear());
    }
    
    
    public String toString(int valor){
        String cadena="";
        
        switch(valor){
            case 1:
                cadena= this.getD() + "-" + this.getM() + "-" + String.valueOf(this.getA()).substring(2,4);
                break;
            case 2:
                cadena= this.getD() + "-" + this.getM() + "-" + this.getA();
                break;
            case 3:
                cadena= this.getD() + "-" + this.nombres[this.getM()] + "-" + this.getA();
                break;
        }
        return cadena;
    }

    @Override
    public String toString() {
        return "Fecha{" + "d=" + d + ", m=" + m + ", a=" + a + '}';
    }
    
    
    
    
    private static boolean fechaCorrecta(int d, int m, int a){
        if(m < 1 || m > 12)
            return false;
        
        if(d < 1 || d > 31)
            return false;
     
        if(m==2 && d > 28)
            return false;
        
        if((m==4 || m==6 || m==9 || m==11) && d > 30)
            return false;
        
        return true;
    }
            
             
}
