
package paqVehiculo;

import java.util.Arrays;
import paqFecha.Fecha;
import paqMotor.VehiculoConMotor;
/**
 *
 * @author alfon
 */
public class Moto extends VehiculoConMotor{
    // Propiedades de las revisiones
    private int[] kms = new int[20];
    private int[] gastos = new int[20];
    
    // Propiedades de Moto
    private String matricula;
    private String propietario;
    private int numRevisiones;

    public Moto() {
        super();
        this.matricula = "";
        this.propietario = "";
        this.numRevisiones = 0;
    }

    public Moto(String mod, int p, int d, int m, int a, int potencia, String matricula, String propietario, int numRev, int[] km, int[] gast) {
        super(potencia, mod, p, d, m, a);
        this.matricula = matricula;
        this.propietario = propietario;
        try {
            if(numRev < 0)
                throw new ArithmeticException("El número de revisiones no puede ser negativo");
            this.numRevisiones = numRev;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.numRevisiones = 0;
        } catch(Exception e){
            System.out.println("Algo ha ido mal");
            this.numRevisiones = 0;
        }
        this.kms = km;
        this.gastos = gast;
    }

    public Moto(String matricula, String propietario, int numRev, int potencia, String mod, int p, Fecha f, int[] km, int[] gast) {
        super(potencia, mod, p, f);
        this.matricula = matricula;
        this.propietario = propietario;
        try {
            if(numRev < 0)
                throw new ArithmeticException("El número de revisiones no puede ser negativo");
            this.numRevisiones = numRev;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.numRevisiones = 0;
        } catch(Exception e){
            System.out.println("Algo ha ido mal");
            this.numRevisiones = 0;
        }
        this.kms = km;
        this.gastos = gast;
    }

    public Moto(String matricula, String propietario, int numRev, int potencia, Vehiculo v, int[] km, int[] gast) {
        super(potencia, v);
        this.matricula = matricula;
        this.propietario = propietario;
        try {
            if(numRev < 0)
                throw new ArithmeticException("El número de revisiones no puede ser negativo");
            this.numRevisiones = numRev;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.numRevisiones = 0;
        } catch(Exception e){
            System.out.println("Algo ha ido mal");
            this.numRevisiones = 0;
        }
        this.kms = km;
        this.gastos = gast;
    }

    public Moto(String matricula, String propietario, int numRev, VehiculoConMotor vm, int[] km, int[] gast) {
        super(vm);
        this.matricula = matricula;
        this.propietario = propietario;
        try {
            if(numRev < 0)
                throw new ArithmeticException("El número de revisiones no puede ser negativo");
            this.numRevisiones = numRev;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.numRevisiones = 0;
        } catch(Exception e){
            System.out.println("Algo ha ido mal");
            this.numRevisiones = 0;
        }
        this.kms = km;
        this.gastos = gast;
    }
    
    public Moto(Moto m){
        this(m.matricula, m.propietario, m.numRevisiones, m.getPotencia(), m.getModelo(), m.getPrecio(), m.getFechaCompra(), m.kms, m.gastos);
    }

    public int[] getKms() {
        return kms;
    }

    public void setKms(int[] kms) {
        this.kms = kms;
    }

    public int[] getGastos() {
        return gastos;
    }

    public void setGastos(int[] gastos) {
        this.gastos = gastos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumRevisiones() {
        return numRevisiones;
    }

    public void setNumRevisiones(int numRevisiones) {
        try {
            if(numRevisiones < 0)
                throw new ArithmeticException("El número de revisiones no puede ser negativo");
            this.numRevisiones = numRevisiones;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
        } catch(Exception e){
            System.out.println("Algo ha ido mal");
        }
    }

    @Override
    public String toString() {
        return "Moto: \n" + super.toString() + "\nkms= " + Arrays.toString(kms) + "\ngastos= " + Arrays.toString(gastos) + "\nmatricula= " + matricula + "\npropietario= " + propietario + "\nnumRevisiones=" + numRevisiones;
    }
    
    public boolean equals(Moto m){
        return (super.equals(m) && (this.matricula.equalsIgnoreCase(m.getMatricula()) && this.numRevisiones==m.getNumRevisiones()
                && this.propietario.equalsIgnoreCase(m.propietario)));
    }
    
    // Métodos sobrecargados de setMoto
    public void setMoto(String mod, int p, int d, int m, int a, int potencia, String matricula, String propietario, int numRev, int[] km, int[] gast){
        super.setVehiculoConMotor(potencia, mod, p, d, m, a);
        this.matricula = matricula;
        this.propietario = propietario;
        this.setNumRevisiones(numRev);
        this.kms = km;
        this.gastos = gast;
    }
    
    public void setMoto(String matricula, String propietario, int numRev, int potencia, String mod, int p, Fecha f, int[] km, int[] gast){
        super.setVehiculoConMotor(potencia, mod, p, f);
        this.matricula = matricula;
        this.propietario = propietario;
        this.setNumRevisiones(numRev);
        this.kms = km;
        this.gastos = gast;
    }
    
    public void setMoto(Vehiculo v, int potencia, String matricula, String propietario, int numRev, int[] km, int[] gast){
        super.setVehiculo(v);
        super.setPotencia(potencia);
        this.matricula = matricula;
        this.propietario = propietario;
        this.setNumRevisiones(numRev);
        this.kms = km;
        this.gastos = gast;
    }
    
    public void setMoto(VehiculoConMotor vm, String matricula, String propietario, int numRev, int[] km, int[] gast){
        super.setVehiculoConMotor(vm);
        this.matricula = matricula;
        this.propietario = propietario;
        this.setNumRevisiones(numRev);
        this.kms = km;
        this.gastos = gast;
    }
    
    public void setMoto(Moto m){
        this.setMoto(m.matricula, m.propietario, m.numRevisiones, m.getPotencia(), m.getModelo(), m.getPrecio(), m.getFechaCompra(), m.kms, m.gastos);
    }
    
    // Métodos propios de Moto
    protected int[] ordenKms(){
        Arrays.sort(this.kms);
        return this.kms;
    }
    
    protected int lugarRevisionMasCara(){
        int masCara = 0;
        for (int i = 0; i < gastos.length; i++) {
            if(gastos[i] > masCara)
                masCara = i;
        }
        return masCara;
    }
    
    protected int posicionRevision(int pos){
        try {
            if(this.numRevisiones==0)
                throw new IndexOutOfBoundsException("Este vehículo no ha pasado ninguna revisión todavía");
            return kms[pos];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error " + e);
        }
        return kms[0];
    }
    
    public void tenerRevision(int km, int gas){
        for (int i = 0; i < kms.length; i++) {
            if(this.kms[i]==0){
                this.kms[i]=km;
                this.gastos[i]=gas;
                this.numRevisiones++;
                break;
            }
        }
    }
}
