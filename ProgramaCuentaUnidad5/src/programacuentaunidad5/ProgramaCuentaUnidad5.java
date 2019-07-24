
package programacuentaunidad5;


public class ProgramaCuentaUnidad5 {

    
    public static void main(String[] args) {
       
        Cuenta cuenta =new Cuenta ();
        
        cuenta.setNumeroCuenta("3385");
        
        Titular titular =new Titular ();
        
        titular.setNombre("Pedro Alejandro");
        titular.setApellido("Perez Rodriguez");
        
        Cantidad cantidad = new Cantidad ();
        
        cantidad.setMontoIngreso(300);
        cantidad.setMontoEgreso(150); // cambie el monto aqui!!!
        
        double montoTotal =cantidad.getMontoTotal();
        
        if (montoTotal >= 0) {
            
            System.out.println(" El monto a favor es de " + cantidad.getMontoTotal());
            
        }else if (montoTotal < 0) {
            
            System.out.println("No tiene monto a favor, deposite dinero en su cuenta para disfrutar del servicio");
            
        }
        
    }
    
    
    
}
