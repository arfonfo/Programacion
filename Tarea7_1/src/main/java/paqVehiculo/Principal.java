
package paqVehiculo;

import paqFecha.Fecha;
import paqMotor.VehiculoConMotor;
/**
 *
 * @author alfon
 */
public class Principal {
    
    public static void insertarVehiculo(Vehiculo[] va, Vehiculo v){
        for (int i = 0; i < va.length; i++) {
            if(va[i]==null){
                va[i] = v;
                System.out.println("Vehículo añadido satisfactoriamente");
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha f = new Fecha(12, 4, 2022);
        
        Vehiculo v1 = new Vehiculo("Vespa", 200000, f);
        
        VehiculoConMotor vc1 = new VehiculoConMotor(1600, v1);
        
        // Creación Vector K
        int[] K = {30000, 15500, 22000};
        
        // Creación Vector G
        int[] G = {13000, 40000, 2000};
        
        // Creación Moto m1
        Moto m1 = new Moto("MU-3456-CV", "Rogelio", 3, vc1, K, G);
        
        System.out.println("Los kms de las revisiones y los gastos de la Moto M1 son: ");
        System.out.println("");
        
        // Muestra de los valores de los vectores K(kms) y G(gastos)
        System.out.println("Kilómetros:");
        for (int i = 0; i < m1.getKms().length; i++) {
            System.out.print(m1.getKms()[i] + "kms ");
        }
        
        System.out.println("\nGastos");
        for (int i = 0; i < m1.getGastos().length; i++) {
            System.out.print(m1.getGastos()[i] + "€ ");
        }
        
        // Revisión de la moto m1
        m1.tenerRevision(2345, 25567);
        
        System.out.println("");
        
        // Muestra cual es la revisión más cara junto con los Kms
        System.out.println("La revisión más cara costó: " + m1.getGastos()[m1.lugarRevisionMasCara()] + "€, "
                + "y se realizó a los " + m1.posicionRevision(m1.lugarRevisionMasCara()) + "kms");
        
        // Crear un array de objetos Vehículo que incluya todos los objetos creados anteriormente: v1, vc1, m1
        // Array de la clase Vehiculo, para que pueda contener a todos los objetos (subclases)
        Vehiculo[] vehiculos = new Vehiculo[10];
        
        // Llamamos al método insertarVehiculo por cada objeto que queremos insertar en el array
        insertarVehiculo(vehiculos, v1);
        insertarVehiculo(vehiculos, vc1);
        insertarVehiculo(vehiculos, m1);
        
        // Mostramos los elementos inseratados
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null)
                System.out.println("\n" + vehiculos[i].toString());
        }
        
        
        
    }
    
}
