
package unidad6excepciones3;


public class Unidad6Excepciones3 {

   
    public static void main(String[] args) {
        
        
        try {
            throw new Exception ("Excepcion Personal");
            
        } catch (Exception e) {
            
            System.out.println("Se ha generado la Siguiente Excepcion :  \n" + e.getMessage());
        }
        finally {
            
            System.out.println("Fin del programa, Buen dia.");
        
        }
    }
    
}
