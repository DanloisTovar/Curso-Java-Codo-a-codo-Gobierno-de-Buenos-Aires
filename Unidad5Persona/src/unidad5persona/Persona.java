
package unidad5persona;

import java.util.Random;

 class Persona {
     
     private String nombre;
     private int edad;
     private int dni;
     private char sexo;

    public Persona() {
    
        this.nombre =" ";
        this.edad = 0;
        this.dni = 0;
        this.sexo = 'H';
    }

 public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobaSexo(sexo);
        this.dni = generarDni();
    }

 public Persona(String nombre, int edad, int dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobaSexo(sexo);
    }

    public String getnombre () {
        
        return this.nombre;    
    }
    
    public void setNombre (String nuevoNombre) {
    this.nombre = nuevoNombre;
    }
    
    public int getedad () {
    
        return this.edad;    
    }
    
    public void setEdad (int nuevaEdad){
    this.edad =nuevaEdad;
    }

    
 public boolean esMAyorDeEdad () {
    
        if (this.edad >= 18) {
            
            System.out.println(" Es mayor de edad ");
            
            return true;           
        }
        else {
            System.out.println(" Es menor de edad");
            
            return false;
        }    
    } 
 
 public char getSexo () {
 
 return this.sexo;
 }
 
 public void setSexo (char nuevoSexo) {
 
     this.sexo = nuevoSexo;
 
 }
 
 public  char comprobaSexo (char sexo){
 
     if (sexo == 'H' || sexo == 'M') {
         
         return sexo;
         
     }
     else return 'H';   
 }
 
 public int generarDni () {
     
     Random random= new Random();
     int dni = random.nextInt(99999999 +10000000) - 10000000 ;
     return dni;
 
 }
 
 
 public String toString () {
 
 return " el nombre de la persona es: \n" + this.nombre + "\n" + " Su edad es : \n" + this.edad + "\n" + "Su sexo es : \n " + this.sexo +"\n"+ "Su Dni es : "+this.dni;   
 }
    
    
    

}
