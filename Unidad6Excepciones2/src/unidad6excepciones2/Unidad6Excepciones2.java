
package unidad6excepciones2;


public class Unidad6Excepciones2 {

   
    public static void main(String[] args) {
        
       String a ="instruccion 1";     
        String b = "Instruccion 2";        
        String c = "Instruccion 3";
         
        
        try {
            System.out.println("Intentamos ejecutar el bloque de instrucciones: ");
            System.out.println(a);
            int n = Integer.parseInt("M");
            System.out.println(b);
            System.out.println(c);
            
            
        } catch (Exception e) {
            
            System.out.println("Instrucciones a ejecutar cuando se produce un error");
            
        } finally {
        
            System.out.println("a ejecutar finalmente tanto si se producen errores como si no ");
        }
        
    }
    
}
