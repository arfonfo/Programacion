
package paqFecha;

/**
 *
 * @author alfon
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.anyo = 0;
    }

    public Fecha(int dia, int mes, int anyo) {
        this.setAnyo(anyo);
        this.setMes(mes);
        this.setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    // No se pueden introducir días menores de 1 y mayores de 31
    // Además debemos tener en cuenta el mes
    public void setDia(int dia) {
        try {
            if(dia < 1 || dia > 31)
                throw new ArithmeticException("Día no puede ser menor de 1 o mayor de 31");
            try {
                if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)&&
                        dia > 30)
                    throw new ArithmeticException("Día no válido para el mes seleccionado");
                try {
                    if(mes == 2 && (dia > 29 || (this.anyo%4!=0 && dia>28)))
                        throw new ArithmeticException("Día no válido para el mes de Febrero");
                    this.dia = dia;
                } catch (ArithmeticException e) {
                    System.out.println("Error " + e);
                    this.dia=1;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error " + e);
                this.dia=1;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.dia=1;
        } catch (Exception e){
            System.out.println("Error no controlado " + e);
            this.dia=1;
        }
        
    }

    public int getMes() {
        return mes;
    }

    // No se pueden introducir meses menores de 1 y mayores de 12
    public void setMes(int mes) {
        try {
            if(mes < 0 || mes > 12)
                throw new ArithmeticException("El mes tiene que estar comprendido entre 1 y 12");
            this.mes = mes;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.mes=1;
        } catch (Exception e){
            System.out.println("Error no controlado " + e);
            this.mes=1;
        }
    }

    public int getAnyo() {
        return anyo;
    }

    // No se pueden introducir fechas menores de 0 y mayores de 2023
    public void setAnyo(int anyo) {
        try {
            if(anyo < 0 || anyo > 2024)
                throw new ArithmeticException("El año tiene que estar comprendido entre 1 y 2023");
            this.anyo = anyo;
        } catch (ArithmeticException e) {
            System.out.println("Error " + e);
            this.anyo=1990;
        }catch (Exception e){
            System.out.println("Error no controlado " + e);
            this.anyo=1990;
        }
        
    }

    @Override
    public String toString() {
        return dia + " - " + mes + " - " + anyo;
    }
    
    
    
}
