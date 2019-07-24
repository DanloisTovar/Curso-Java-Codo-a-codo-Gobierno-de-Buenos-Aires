
package unidad5persona;


public class Unidad5Persona {

  
    public static void main(String[] args) {
        
        // Su version con acceso private
     
        Persona persona =new Persona ("Juan carlos" , 25 , 'X');       
        System.out.println(persona.toString());
        
        // mi version con accesos pulicos 
        persona.setNombre("Maria Cristina");
        persona.setEdad(16);
          persona.setSexo('M');
          persona.generarDni();
        System.out.println(persona.toString());
        persona.esMAyorDeEdad();
        
        
        
    }
    
}
