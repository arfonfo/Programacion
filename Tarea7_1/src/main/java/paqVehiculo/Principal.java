
package paqVehiculo;

import java.util.ArrayList;
import java.util.Arrays;

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
        
        try{
            Fecha f = new Fecha(12, 4, 2022);
        
            Vehiculo v1 = new Vehiculo("Vespa", 200000, f);

            VehiculoConMotor vc1 = new VehiculoConMotor(1600, v1);

            // Creación Vector K
            int[] K = new int[20];
            K[0] = 30000;
            K[1] = 15500;
            K[2] = 22000;

            // Creación Vector G
            int[] G = new int[20];
            G[0] = 13000;
            G[1] = 40000;
            G[2] = 2000;

            // Creación Moto m1
            Moto m1 = new Moto("MU-3456-CV", "Rogelio", 3, vc1, K, G);
            
            System.out.println("Los kms de las revisiones y los gastos de la Moto M1 son: ");
            System.out.println("");

    //         Muestra de los valores de los vectores K(kms) y G(gastos)
            System.out.println("Kilómetros:");
            for (int i = 0; i < m1.getKms().length; i++) {
                if(m1.getKms()[i] != 0)
                    System.out.print(m1.getKms()[i] + "kms ");
            }

            System.out.println("\nGastos");
            for (int i = 0; i < m1.getGastos().length; i++) {
                if(m1.getGastos()[i] != 0)
                    System.out.print(m1.getGastos()[i] + "€ ");
            }

            // Revisión de la moto m1
            m1.tenerRevision(2345, 25567);
            
            System.out.println(m1.getNumRevisiones());
            
            System.out.println(m1.toString());

            System.out.println("");
            System.out.println("");
            System.out.println("");

            // Muestra cual es la revisión más cara junto con los Kms
            System.out.println("La revisión más cara costó: " + m1.getGastos()[m1.lugarRevisionMasCara()] + "€, "
                    + "y se realizó a los " + m1.posicionRevision(m1.lugarRevisionMasCara()) + "kms");
            
            
            // Creación de ArrayList de Vehículos
            ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();

            vehiculos2.add(v1);
            vehiculos2.add(vc1);
            vehiculos2.add(m1);

            for(Vehiculo v:vehiculos2){
                System.out.println(v.toString() + "\n");
            }

            for (int i = 0; i < vehiculos2.size(); i++) {
                System.out.println(vehiculos2.get(i) + "\n");
            }

            //Para remover en ArrayList
            vehiculos2.remove(v1);

            // Lo imprime solo con un sout
            System.out.println(vehiculos2);

            for(Vehiculo v:vehiculos2){
                System.out.println(v.toString() + "\n");
            }
            

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
            
                      
                m1.ordenKms();
                System.out.println(m1.toString());


                 // Pruebas para borrar luego


                int[] ejemplo = {6, 4, 7, 2, 8};
                boolean ordenado = false;

                while(ordenado==false){
                    ordenado=true;
                    for(int i=0; i<ejemplo.length-1; i++){
                        int pos = ejemplo[0];
                        if(ejemplo[i]> ejemplo[i+1]){
                            pos=ejemplo[i+1];
                            ejemplo[i+1]= ejemplo[i];
                            ejemplo[i] = pos;
                            ordenado=false;
                        }
                    }
                };

                System.out.println(Arrays.toString(ejemplo));


                 VehiculoConMotor vm3 = new VehiculoConMotor(vc1);

                 System.out.println(vm3.toString());

                 VehiculoConMotor vm4 = new VehiculoConMotor(1600,"coche", 400, f);

                 System.out.println(vm3.equals(vm4));

                 VehiculoConMotor vc2 = new VehiculoConMotor(2000, v1);

                 Moto m8 = new Moto("MU-3456-CV", "Rogelio", 3, vc1, K, G);

                 Moto m7 = new Moto("MU-3456-CV", "Rogelio", 3, vc2, K, G);

                 System.out.println(m7.equals(m8));


                 // Pruebas null con array de Strings
                 String palabras[] = new String[10];

                 palabras[0] = "alfon";
                 palabras[1] = "renre";
                 palabras[2] = "jhonny";

                 for(int i = 0; i < palabras.length; i++){
                     if(palabras[i]!=null){
                         System.out.println(palabras[i]);
                     }
                     if(palabras[i]==null){
                         System.out.println("No hay palabra");
                     }
                 }



                 // SI HACEMOS QUE 2 OBJETOS APUNTEN A LA MISMA REFERENCIA EN MEMORIA Y CAMBIAMOS UN O DE ELLOS
                 // EL OTRO TAMBIÉN SE CAMBIA

                 System.out.println(m1.toString());

                 Moto m5 = m1;

                 m5.setMatricula("9919kjh");

                 System.out.println(m1.toString());
                 System.out.println(m5.toString());


                System.out.println("");
               Vehiculo fail = new Vehiculo("google", -1000, 32, 13, 2025);
                System.out.println("");
                System.out.println(fail.getPrecio());
                System.out.println("");
                System.out.println(fail.getFechaCompra());
                System.out.println("");

               Moto m3 = new Moto("899", "alfonso", -1, vc1, K, G);
               System.out.println(m3.getNumRevisiones());


               Moto m4 = new Moto("asdfsd", "alf", -11, -1, "kia", -20, f, K, G);
               System.out.println(m4.getNumRevisiones());
               System.out.println(m4.getPotencia());
               System.out.println(m4.getFechaCompra());

                Vehiculo v3 = new Vehiculo("Ford", -300, f);
                System.out.println(v3.getPrecio());
                System.out.println(v3.getFechaCompra());

                VehiculoConMotor v4 = new VehiculoConMotor(-200, v3);
                System.out.println(v4.getPotencia());

                // Prueba de instanceof
                if(m1 instanceof Vehiculo){
                    System.out.println("m1 es un vehículo");
                }

                if(m1 instanceof VehiculoConMotor){
                    System.out.println("m1 es un vehículo con motor");
                }

                // Pruebas de casteo
                Moto m2 = m1;

                System.out.println(m2.toString());

                // Ejemplo de DownCasting
                // Solo puede acceder a los métodos que tienen en común
                v1=m2;
                System.out.println(v1.toString());
                if(v1 instanceof Moto)
                    System.out.println("El vehículo v1 es una Moto");

                // Aunque le hagamos apuntar a un VehiculoConMotor no puede usar los métodos propios de esa clase si no los tiene en común
                v1 = new VehiculoConMotor(1200, v1);
                if(v1 instanceof VehiculoConMotor)
                    System.out.println("El vehículo v1 es un VehículoConMotor");

                // Ejemplo de UpCasting
                // Para poder usar los métodos de VehículoConMotor es necesario que casteemos v1, ya que lo declaramos al inicio como Vehículo
                // y solo apunta a un VehiculoConMotor
                ((VehiculoConMotor)v1).setPotencia(2200);


                // Si no apunta a un registro de la subclase no se puede castear
                // para que ejecute los métodos

                try{
                    Vehiculo v6 = new Vehiculo();

        //            v6 = new Moto();

                    ((Moto)v6).tenerRevision(2000, 4000);

                    if(v6 instanceof Moto)
                        System.out.println("El vehículo v6 es una moto");

            } catch(ClassCastException e) {
                System.out.println("No se puede castear. Error: " + e.getMessage());
            }
        

            
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }
    
}
