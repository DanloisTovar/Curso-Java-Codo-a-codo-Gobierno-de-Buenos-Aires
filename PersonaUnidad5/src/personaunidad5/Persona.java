
package personaunidad5;

import static javafx.scene.input.KeyCode.H;
import static javafx.scene.input.KeyCode.M;


public class Persona {
    
    public String nombre;
    public int edad;
    public  int dni;
    public  char sexo;

    public Persona() {
        
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre = " ";
        this.edad = edad = 0;
        this.sexo = sexo = 'H';
    }

    public Persona(String nombre, int edad, int dni, char sexo) {
        this.nombre = nombre = " ";
        this.edad = 0;
        this.dni = 0;
        this.sexo = 'H';
    }
    
    public boolean esMayorDeEdad () {
    
        if (this.edad >= 18) {
            
            System.out.println("Es mayo de edad");
            
            return true;
            
        } else {
            
            System.out.println("Es menor de edad");
        
            return false;
        }
    
     private  char comprobarSexo (char sexo) {
     
           if (sexo == 'H' || sexo == 'M') {
               
               return sexo;
             
         }
           else {
           
               return 'H';
           
           }
     
     }
    
    }
    
    
    

    
    
}
