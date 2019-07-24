
package unidad6excepciones1;


public class Unidad6Excepciones1 {

  
    public static void main(String[] args) {
              
        
        String a ="instruccion 1";     
        String b = "Instruccion 2";        
        String c = "Instruccion 3";
        
        try {
            System.out.println("Intentamos ejecutar el bloque de instrucciones :" + "\n" + a + "\n" + b + "\n" + c);
            
        } catch (Exception e) {
            
            System.out.println("Error de sistema");
            
        } finally {
        
            System.out.println("a ejecutar finalmente tanto si se producen errores como si no ");
        }
       
    }
    
}
