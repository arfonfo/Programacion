/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocoches.paqcoches;
 
/**
 *
 * @author Profesor
 */
public class Coches 
{

    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private String cambio;
    private int num_puertas;
    private int precio;
    
   
    public Coches()
    {
        //También se puede poner así
        //this("Ferrari","","BLANCO","GASOLINA","MANUAL",3,0);
        
        this.marca = "Ferrari";
        this.modelo = "";
        this.color ="Blanco";
        this.combustible = "GASOLINA";
        this.cambio = "MANUAL";
        this.num_puertas = 3;
        this.precio = 0;  
        
    }
    
    
    
    
    public Coches(String ma,String mo,String co,String com,String ca,int np, int pr)
    {
       
  
       try
        {
            
            ma  = quitarEspaciosMayusculas(ma);
            mo  = quitarEspaciosMayusculas(mo);
            co  = quitarEspaciosMayusculas(co);
            com = quitarEspaciosMayusculas(com);
            ca  = quitarEspaciosMayusculas(ca);
            
          
            
            if ( (np<3) || (np>5))
                    throw new IllegalArgumentException("Numero de puertas");
            
            if (pr< 0)
                    throw new IllegalArgumentException("Precio");
            
            if ( !com.equalsIgnoreCase("GASOLINA") &&  !com.equalsIgnoreCase("DIESEL")) 
                    throw new IllegalArgumentException("Combustible");
            
            if ( !ca.equalsIgnoreCase("MANUAL") && !ca.equalsIgnoreCase("AUTOMATICO"))
                    throw new IllegalArgumentException("Cambio");
            
            
            this.marca = ma;
            this.modelo = mo;
            this.color = co;
            this.combustible = com;
            this.cambio = ca;
            this.num_puertas = np;
            this.precio = pr;     
        }    
        catch (IllegalArgumentException e) {System.out.println("Error: " + e.toString());}
        catch (Exception e) {System.out.println("Error general");}

    }
    
    public Coches(Coches co)
    {
        //Aquí no hace falta usar excepciones porque se supone que el objeto del que lee los datos
        //ya ha realizado las comprobaciones oportunas
        
        
        //Se podría simplificar con sólo esta instrucción
        //this(co.marca,co.marca,co.color,co.combustible,co.cambio,co.num_puertas,co.precio);
        
        
        
        this.marca  = quitarEspaciosMayusculas(co.marca);
        this.modelo = quitarEspaciosMayusculas(co.modelo);
        this.color  = quitarEspaciosMayusculas(co.color);
        this.combustible = quitarEspaciosMayusculas(co.combustible);
        this.cambio = quitarEspaciosMayusculas(co.cambio);
        this.num_puertas = co.num_puertas;
        this.precio = co.precio; 
        
        
    }
    
    
    public void ver_Datos()
    {
        System.out.println("______________________________________");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);    
        System.out.println("Color: " + this.color);        
        System.out.println("Combustible: " + this.combustible);        
        System.out.println("Cambio: " + this.cambio);        
        System.out.println("Num puertas: " + this.num_puertas);        
        System.out.println("Precio: " + this.precio);        
    }
    
    @Override
    public String toString()
    {
        return ("Marca: " + this.marca + "Modelo: " + this.modelo + "Color: " + this.color + "Combustible: " + this.combustible + "Cambio: " + this.cambio + "Num puertas: " + this.num_puertas + "Precio: " + this.precio);        
    }
    
    protected String getMarca()
    {
        return this.marca;        
    }
    
    protected String getModelo()
    {
        return this.modelo;        
    }
    
    protected String getColor()
    {
        return this.color;        
    }
    
    protected String getCombustible()
    {
        return this.combustible;        
    }
        
    protected String getCambio()
    {
        return this.cambio;        
    }

    protected int getNumpuertas()
    {
        return this.num_puertas;        
    }
        
    protected int getPrecio()
    {
        return this.num_puertas;        
    }
    
    protected void setMarca(String ma)
    {
        this.marca = quitarEspaciosMayusculas(ma);
    }
    
    protected void setModelo(String mo)
    {
        this.modelo = quitarEspaciosMayusculas(mo);
    }
    protected void setColor(String co)
    {
        this.color = quitarEspaciosMayusculas(co);
    }
    protected void setCombustible(String com)
    {
        try
        {
            
            com = this.quitarEspaciosMayusculas(com);
            
            if ( !com.equals("GASOLINA") &&   !com.equals("DIESEL")) 
                    throw new IllegalArgumentException("Combustible");
            
            this.combustible = com;
        }    
        catch (IllegalArgumentException e) {System.out.println("Error: " + e.toString());}
        catch (Exception e) {System.out.println("Error general");} 
    }
    
    
    protected void setCambio(String cam)
    {
        
        try
        {
            
            cam = this.quitarEspaciosMayusculas(cam);
            
            if ( !cam.equals("MANUAL") && !cam.equals("AUTOMATICO"))
                    throw new IllegalArgumentException("Cambio");
            
            this.cambio = cam;
        }    
        catch (IllegalArgumentException e) {System.out.println("Error: " + e.toString());}
        catch (Exception e) {System.out.println("Error general");} 
        
    }
    
    protected void setNumPuertas(int np)
    {
       try
      {
          if ((np<3) || (np>5))
              throw new IllegalArgumentException();
          
        this.num_puertas = np;    
      }
      catch (IllegalArgumentException e) { System.out.println("Error: numero de puertas erróneo");}
      catch (Exception e) {System.out.println("Error general");} 
       
    }
      
    protected void setPrecio(int pr)
    {
      try
      {
          if (pr<0)
              throw new IllegalArgumentException();
          
        this.precio = pr;    
      }
      catch (IllegalArgumentException e) { System.out.println("Error: precio negativo");}
      catch (Exception e) {System.out.println("Error general");}
    }
    
        
    static private String quitarEspaciosMayusculas(String palabra)
    { 
        palabra = palabra.replaceAll(" ","");

        palabra = palabra.toUpperCase();
        
        return palabra;
    }
    
    
    
    protected boolean setDatos(String ma,String mo,String co,String com,String ca,int np, int pr)
    {
        
        try
        {
            
            ma  = quitarEspaciosMayusculas(ma);
            mo  = quitarEspaciosMayusculas(mo);
            co  = quitarEspaciosMayusculas(co);
            com = quitarEspaciosMayusculas(com);
            ca  = quitarEspaciosMayusculas(ca);
            
          
            
            if ( (np<3) || (np>5))
                    throw new IllegalArgumentException("Numero de puertas");
            
            if (pr < 0)
                    throw new IllegalArgumentException("Precio");
            
            if ( !com.equals("GASOLINA") &&   !com.equals("DIESEL")) 
                    throw new IllegalArgumentException("Combustible");
            
            if ( !ca.equals("MANUAL") && !ca.equals("AUTOMATICO"))
                    throw new IllegalArgumentException("Cambio");
            
            
            this.marca = ma;
            this.modelo = mo;
            this.color = co;
            this.combustible = com;
            this.cambio = ca;
            this.num_puertas = np;
            this.precio = pr;     
        }    
        catch (IllegalArgumentException e) {System.out.println("Error: " + e.toString()); return false;}
        catch (Exception e) {System.out.println("Error general"); return false;}
        
        return true;
    }
         
  
    protected boolean equals(Coches objcoche)
    {
        if ((this.marca == objcoche.marca) & (this.modelo == objcoche.modelo)
           &  (this.color == objcoche.color) &  (this.combustible == objcoche.combustible)
                & (this.cambio == objcoche.cambio) & (this.num_puertas == objcoche.num_puertas)
                    & (this.precio == objcoche.precio) )
                                    return true;
                                else
                                    return false;
    }
    
    
    protected boolean equals(String ma,String mo,String co,String com,String ca,int np, int pr)
    {
        if ((this.marca.equalsIgnoreCase(ma))  & (this.modelo.equalsIgnoreCase(mo)) & (this.color.equalsIgnoreCase(co))
             & (this.combustible.equalsIgnoreCase(com)) & (this.cambio.equalsIgnoreCase(ca)) 
             & (this.num_puertas == np) & (this.precio == pr)) 
                          return true;
        else
                          return false;
             
             
    }
    
    /*  
   //Con este método comprobaríamos si los objetos son iguales considerando que apunta a la misma
   //dirección de memoria  
    protected boolean equals(Coches objcoche)
    {
        return this.equals(objcoche);    
    }  
    */
    
    
}
