/**
 *
 * @author DomequeMartinArmando
 * @see CCuenta
 * @since 02-02-2022
 */
public class Main {
    /**
    * Definimos nuestra clase main
    * @param args sin usar.
    */
    public static void main(String[] args) {

        Operativa_Cuenta();
    }
    /**
     * Operativa_Cuenta() Gestiona toda la operativa de la cuenta
     */
    
    
    public static void Operativa_Cuenta() {
        
        CCuenta cuenta1;
        
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0, (float) 25.50);
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {   
            cuenta1.retirar(2300);  
        } catch (Exception e) { 
            System.out.print("Fallo al retirar");   
        }
        try {   
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) { 
            System.out.print("Fallo al ingresar");  
        }
    }
}


