
package com.arfonfo.proyectoanimal;

/**
 *
 * @author alfon
 */
public class Hombre extends Vertebrado{
    private String nombre;
    private boolean vivo;
    private int numHijos;
    private String[] namesHijos = new String[20];
    private int[] edadHijos = new int[20];
    
    public Hombre(int peso, Fecha f, int nV, String nombre, boolean vivo, int numHijos, String[] nH, int[] eH){
        super(nV, f, peso);
        try{
            if(numHijos < 0 || numHijos >10)
                throw new ArithmeticException("Número de hijos menor de 0 o mayo de 10");
            this.numHijos = numHijos;
            this.nombre = nombre;
            this.vivo = vivo;
            this.namesHijos = nH;
            this.edadHijos = eH;
        } catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public Hombre(Animal a, int nV, String nombre, boolean vivo, int numHijos, String[] nH, int[] eH){
        this(a.getPeso(), a.getFecha(), nV, nombre, vivo, numHijos, nH, eH);
    }
    
    public Hombre(Vertebrado v, String nombre, boolean vivo, int numHijos, String[] nH, int[] eH){
        this(v, v.getNumVertebras(), nombre, vivo, numHijos, nH, eH);
    }
    
    public Hombre(Hombre h){
        this(h, h.nombre, h.vivo, h.numHijos, h.namesHijos, h.edadHijos);
    }
    
    public Hombre(){
        nombre="";
        numHijos=0;
        vivo=true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
         try{
            if(numHijos < 0 || numHijos >10)
                throw new ArithmeticException("Número de hijos menor de 0 o mayo de 10");
            this.numHijos = numHijos;
        } catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public String[] getNamesHijos() {
        return namesHijos;
    }

    public void setNamesHijos(String[] namesHijos) {
        this.namesHijos = namesHijos;
    }

    public int[] getEdadHijos() {
        return edadHijos;
    }

    public void setEdadHijos(int[] edadHijos) {
        this.edadHijos = edadHijos;
    }
    
    public void morir(){
        try{
            if(!this.isVivo())
                throw new IllegalArgumentException("solo se muere una vez");
            this.setVivo(false);
            System.out.println("Este hombre ha muerto");
        } catch(IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void tenerHijos(String n, int e){
        for(int i = 0; i < this.getNamesHijos().length; i++){
            // Si fuese edadHijos lo haríamos con igual a 0
            if(this.getNamesHijos()[i]==null){
                this.getNamesHijos()[i]=n;
                this.getEdadHijos()[i]=e;
                this.setNumHijos(++this.numHijos);
                break;
            }
        }
    }
    
    public int edadHijoMenor(){
        int aux=this.edadHijos[0];
        for(int i = 0; i < this.edadHijos.length; i++){
            if(this.edadHijos[i]!=0 && this.edadHijos[i]<aux)
                aux=this.edadHijos[i];
        }
        return aux;
    }
    
    
    public String nombreHijoMenor(){
        String nombreHijo=this.namesHijos[0];
        int aux=this.edadHijos[0];
        for(int i = 0; i < this.edadHijos.length; i++){
            if(this.edadHijos[i]!=0 && this.edadHijos[i]<aux){
                aux=this.edadHijos[i];
                nombreHijo=this.namesHijos[i];
            }
        }
        return nombreHijo;
    }
    
    
    public int lugarNombreHijo(String n){
        for (int i = 0; i < namesHijos.length; i++) {
            if(this.namesHijos[i]!=null && this.namesHijos[i].equalsIgnoreCase(n))
                return i;
        }
        return -1;
    }
    
    public String darNombre(int pos){
        if(this.namesHijos[pos-1]!=null)
            return this.namesHijos[pos-1];
        return "No existe nombre en esa posición";
    }
    
}
