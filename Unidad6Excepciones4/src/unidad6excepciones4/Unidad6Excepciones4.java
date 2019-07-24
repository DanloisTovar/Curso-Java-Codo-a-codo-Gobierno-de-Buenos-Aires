
package unidad6excepciones4;


public class Unidad6Excepciones4 {

 
    public static void main(String[] args) {
        
        try {
            
            throw new MiExcepcion ("Excepcion personal");
            
        } catch (MiExcepcion e) {
            
            System.out.println("se ha generado la siguiente excepcion :  " + e.getMessage());
        }
        
        finally {
            
            System.out.println("Fin del programa");
        
        }
    }
    
}
