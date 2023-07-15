
package paqVehiculo;

import paqFecha.Fecha;
import paqMotor.VehiculoConMotor;
/**
 *
 * @author alfon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha f = new Fecha(12, 4, 2001);
        
        Vehiculo v1 = new Vehiculo("Vespa", 200000, f);
        
        VehiculoConMotor vc1 = new VehiculoConMotor(1600, v1);
        
        int[] K = {30000, 15500, 22000};
        
        int[] G = {13000, 40000, 2000};
        
        Moto m1 = new Moto("MU-3456-CV", "Rogelio", 3, vc1, K, G);
        
        System.out.println("Los kms de las revisiones y los gastos de la Moto M1 son: ");
        System.out.println("");
        
        System.out.println("Kilómetros:");
        for (int i = 0; i < m1.getKms().length; i++) {
            System.out.print(m1.getKms()[i] + "kms ");
        }
        
        System.out.println("\nGastos");
        for (int i = 0; i < m1.getGastos().length; i++) {
            System.out.print(m1.getGastos()[i] + "€ ");
        }
        
        m1.tenerRevision(2345, 25567);
        
        System.out.println("");
        
        // Mostrar cual es la revisión más cara junto con los Kms
        System.out.println("La revisión más cara costó: " + m1.getGastos()[m1.lugarRevisionMasCara()] + "€, "
                + "y se realizó a los " + m1.posicionRevision(m1.lugarRevisionMasCara()) + "kms");
        
    }
    
}
