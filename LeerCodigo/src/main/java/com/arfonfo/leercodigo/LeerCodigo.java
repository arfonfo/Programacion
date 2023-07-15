
package com.arfonfo.leercodigo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class LeerCodigo {
    
    public static Isosceles[] arrayIsosceles(){
        Isosceles[] iso = new Isosceles[10];
        
        for (int i = 0; i < iso.length; i++) {
            iso[i] = new Isosceles(((int) (Math.random()*100+1)), ((int) (Math.random()*100+1)));
        }
        
        return iso;
    }
    
    public static double areaMayor(Isosceles[] iso){
        double mayor = 0;
        for (int i = 0; i < iso.length; i++) {
            if(iso[i].area() > mayor)
                mayor = iso[i].area();
        }
        return mayor;
    }

    public static void main(String[] args) {
        Clase1 obj1= new Clase1(7);
        Clase1 obj2= new Clase1(9);
        obj2=obj1;
        System.out.println(obj1.getProp()+" ");
        System.out.println(obj2.getProp()+" ");
        
        Ordenador sobremesa;
        Ordenador portatil;
        sobremesa = new Ordenador();
        sobremesa.precio(900);
        portatil = new Ordenador();
        portatil.precio(1100);
        portatil = sobremesa;
        sobremesa = null;
        
        try {
            System.out.println(portatil.prec);
            System.out.println(sobremesa.prec);
        } catch (NullPointerException e) {
            System.out.println("Apunta a Null " + e.toString());
        }
        
        
        Autor autor= new Autor("Paul", "Auster");
        Libro libro = new Libro("La trilogía de Nueva York", autor);
        System.out.println(libro.getTitulo() + " de " + (libro.getAutor()).toString());
        
        
        int igual=0;
        int diferente=0;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        
        do{
            try{
                System.out.println("Introduce la medida del lado que es igual: ");
                igual = sc.nextInt();
                System.out.println("Introduce la medida del lado que es diferente: ");
                diferente = sc.nextInt();
                salir=true;
            }catch(InputMismatchException e){
                System.out.println("Debe introducir un número " + e.toString());
            }catch(Exception e){
                System.out.println("Error inesperado " + e.toString());
            }
            sc.nextLine();
        }while(!salir);
        Isosceles tri_iso = new Isosceles(igual, diferente);
        System.out.println(tri_iso.toString());
        System.out.println("El perímetro del triángulo es: " + tri_iso.perimetro());
        System.out.println("La altura del triángulo es: " + tri_iso.altura());
        System.out.println("El area del triángulo es: " + tri_iso.area());
        
        System.out.println("*************************************");
        System.out.println("");
        
        Isosceles[] iso_array = arrayIsosceles();
        System.out.println("");
        
        for (int i = 0; i < iso_array.length; i++) {
            System.out.println(iso_array[i].toString());
        }
        
        System.out.println("");
        
        System.out.println(areaMayor(iso_array));
        
                
                
    }
}

class Clase1{
    private int prop=0;
    
    public Clase1(int valor){
        this.prop = valor;
    }
    
    public int getProp(){
        return this.prop;
    }
}


class Ordenador{
    public int prec;
    
    public Ordenador(){
        this.prec = 0;
    }
    
    public void precio(int p){
        this.prec = p;
    }
    
}


class Libro {

    private String titulo;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }
}


class Autor {

    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}


class Isosceles{
    private int lado_igual;
    private int lado_diferente;

    public Isosceles() {
        this.lado_igual=0;
        this.lado_diferente=0;
    }
    
    public Isosceles(int igual, int diferente){
        this.lado_igual = igual;
        this.lado_diferente = diferente;
    }

    protected int getLado_igual() {
        return lado_igual;
    }

    protected void setLado_igual(int lado_igual) {
        this.lado_igual = lado_igual;
    }

    protected int getLado_diferente() {
        return lado_diferente;
    }

    protected void setLado_diferente(int lado_diferente) {
        this.lado_diferente = lado_diferente;
    }
        
    protected int perimetro(){
        return 2*this.lado_igual + this.lado_diferente;
    }
    
    protected double altura(){
        double h = Math.pow(lado_igual, 2) - (Math.pow(lado_diferente, 2)/4);
        if(h < 0){
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
            return 0;
        } else {
            return Math.round(Math.sqrt(h)*100.0)/100.0;
        }
    }
    
    protected double area(){
        if(altura()!=0){
            return Math.round(((lado_diferente*this.altura())/2)*100.0)/100.0;
        } else {
            return 0;
        }
        
    }
    
    public String toString(){
        return "El triángulo isósceles se compone de dos lados iguales, que miden " + this.lado_igual + ", y de uno diferente, que mide " + this.lado_diferente;
    }

    
}
