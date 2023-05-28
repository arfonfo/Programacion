
package paqAnimal;

import java.util.Arrays;
import paqFecha.Fecha;

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

    public Hombre(int p, Fecha f, int numVert, String nombre, boolean v, int nHijos, String[] nombres, int[] edad) {
        super(numVert, p, f);
        this.nombre = nombre;
        this.vivo = v;
        this.setNumHijos(nHijos);
        namesHijos = nombres;
        edadHijos = edad;
    }
    
    public Hombre(Animal a, int numVert, String nombre, boolean v, int nHijos, String[] nombres, int[] edad){
        super(numVert, a);
        this.nombre = nombre;
        this.vivo = v;
        this.setNumHijos(nHijos);
        namesHijos = nombres;
        edadHijos = edad;
    }
    
    public Hombre(Vertebrado vert, String nombre, boolean v, int nHijos, String[] nombres, int[] edad){
        super(vert);
        this.nombre = nombre;
        this.vivo = v;
        this.setNumHijos(nHijos);
        namesHijos = nombres;
        edadHijos = edad;
    }
    
    public Hombre(Hombre h){
        super(h.getNumVertebras(), h.getPeso(), h.getFechaNac());
        this.nombre = h.nombre;
        this.vivo = h.vivo;
        this.setNumHijos(h.numHijos);
        namesHijos = h.namesHijos;
        edadHijos = h.edadHijos;
    }
    
    public Hombre(){
        super();
        this.vivo=true;
        this.numHijos = 0;
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
        try {
            if(numHijos <= -1 || numHijos >= 10)
                throw new ArithmeticException("El número de hijos no puede ser menor de 0 o superior a 10");
            this.numHijos = numHijos;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
        } catch(Exception e){
            System.out.println("El valor introducido no es correcto");
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
    
    public boolean morir(){
        try {
            if(!this.vivo)
                throw new Exception("Solo se puede morir una vez");
            vivo = false;
            return true;
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return false;
        }
        
    }
    
    public void tenerHijos(String nomHijo, int edadHijo){
        if(this.numHijos>=9){
            System.out.println("El número de hijos no puede ser mayor de 9");
        }else{
            for (int i = 0; i < this.namesHijos.length; i++) {
                if(this.namesHijos[i]==null){
                    this.setNumHijos(this.numHijos+1);
                    this.namesHijos[i]=nomHijo;
                    this.edadHijos[i]=edadHijo;
                    System.out.println("La persona " + this.nombre + " ha tenido un/a hijo/a\n" + "Nombre: " + nomHijo + "\nEdad: " + edadHijo);
                    break;
                }
            
            }
        }
        
    }
    
    // Devuelve la edad del hijo más joven
    public int edadHijoMenor(){
        int peq = this.edadHijos[0];
        
        for (int i = 0; i < this.edadHijos.length; i++) {
            if(this.edadHijos[i] < peq)
                peq = edadHijos[i];
        }
        return peq;
    }
    
    // Devuelve el nombre del hijo más joven
    public String nombreHijoMenor(){
        
        int pos = 0;
        for(int i = 0; i<this.numHijos; i++){
            if(this.edadHijos[i]<this.edadHijos[pos])
                pos=i;
        }
        
//        int peq = this.edadHijos[0];
//        int pos = 0;
//        for (int i = 0; i < this.edadHijos.length; i++) {
//            if(this.edadHijos[i] < peq){
//                peq = edadHijos[i];
//                pos = i;
//            }
//        }
        return namesHijos[pos];
    }
    
    public int lugarNombreHijo(String n){
        for (int i = 0; i < namesHijos.length; i++) {
            if(n.equalsIgnoreCase(namesHijos[i]))
                return i;
        }
        return -1;
    }
    
    public String darNombre(int pos){
        try {
            if(pos <= 0 || pos > namesHijos.length)
                throw new ArrayIndexOutOfBoundsException("No ha indicado una posición correcta");
            return namesHijos[pos-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error " + e);
            return "Nombre no disponible";
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "Hombre: " + "\nnombre=" + nombre + "\nvivo=" + vivo + "\nnumHijos=" + numHijos + "\nnamesHijos=" + Arrays.toString(namesHijos) + "\nedadHijos=" + Arrays.toString(edadHijos);
    }
    
    
}
