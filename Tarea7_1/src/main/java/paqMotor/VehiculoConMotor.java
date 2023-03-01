
package paqMotor;

import paqFecha.Fecha;
import paqVehiculo.PotenciaIncorrecta;
import paqVehiculo.Vehiculo;
/**
 *
 * @author alfon
 */
public class VehiculoConMotor extends Vehiculo{
    private int potencia;

    public VehiculoConMotor() {
        super();
        this.potencia = 0;
    }

    public VehiculoConMotor(int potencia, String mod, int p, int d, int m, int a) {
        super(mod, p, d, m, a);
        try {
            if(potencia < 0)
                throw new PotenciaIncorrecta();
            this.potencia = potencia;
        } catch (PotenciaIncorrecta e) {
            System.out.println("Error " + e);
            this.potencia = 0;
        }catch(Exception e){
            System.out.println("Algo ha fallado");
            this.potencia = 0;
        }
    }

    public VehiculoConMotor(int potencia, String mod, int p, Fecha f) {
        super(mod, p, f);
        try {
            if(potencia < 0)
                throw new PotenciaIncorrecta();
            this.potencia = potencia;
        } catch (PotenciaIncorrecta e) {
            System.out.println("Error " + e);
            this.potencia = 0;
        }catch(Exception e){
            System.out.println("Algo ha fallado");
            this.potencia = 0;
        }
    }

    public VehiculoConMotor(int potencia, Vehiculo v) {
        super(v);
        try {
            if(potencia < 0)
                throw new PotenciaIncorrecta();
            this.potencia = potencia;
        } catch (PotenciaIncorrecta e) {
            System.out.println("Error " + e);
            this.potencia = 0;
        }catch(Exception e){
            System.out.println("Algo ha fallado");
            this.potencia = 0;
        }
    }
    
    public VehiculoConMotor(VehiculoConMotor vm){
        this(vm.potencia, vm.getModelo(), vm.getPrecio(), vm.getFechaCompra());
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        try {
            if(potencia < 0)
                throw new PotenciaIncorrecta();
            this.potencia = potencia;
        } catch (PotenciaIncorrecta e) {
            System.out.println("Error " + e);
        }catch(Exception e){
            System.out.println("Algo ha fallado");
        }
    }

    @Override
    public String toString() {
        return "VehiculoConMotor\n" + super.toString() + "\npotencia= " + this.getPotencia();
    }
    
    public boolean equals(VehiculoConMotor vm){
        return (super.equals(vm) && this.getPotencia()==vm.getPotencia());
    }
    
    public void setVehiculoConMotor(int potencia, String mod, int p, int d, int m, int a){
        super.setVehiculo(mod, p, d, m, a);
        this.setPotencia(potencia);
    }
    
    public void setVehiculoConMotor(int potencia, String mod, int p, Fecha f){
        super.setVehiculo(mod, p, f);
        this.setPotencia(potencia);
    }
    
    public void setVehiculoConMotor(int potencia, Vehiculo v){
        super.setVehiculo(v);
        this.setPotencia(potencia);
    }
    
    public void setVehiculoConMotor(VehiculoConMotor vm){
        this.setVehiculoConMotor(vm.potencia, vm.getModelo(), vm.getPrecio(), vm.getFechaCompra());
    }
    
}
