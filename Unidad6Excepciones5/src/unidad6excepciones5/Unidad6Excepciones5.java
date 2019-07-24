
package unidad6excepciones5;


public class Unidad6Excepciones5 {

    
    public static void main(String[] args) {
        
        boolean continuar = true;
        
        while (continuar) {
            
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println(" el resultado es igual a :" + c);
                
                
            } catch (Exception e) {
                
                System.out.println("se genero la siguiente excepcion : \n" + e.getMessage());
            }
        } 
    } 
    
    
}
