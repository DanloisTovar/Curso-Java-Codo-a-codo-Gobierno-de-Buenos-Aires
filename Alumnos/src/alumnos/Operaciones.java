
package alumnos;

import javax.swing.JOptionPane;


public class Operaciones {


public void Sistema () {


 int sistema;
 int  ingresa;
int  salir;
int continuar;        
  
        do {
                        ingresa=   Integer.parseInt(JOptionPane.showInputDialog("Para ingresar al sistema presione '0' o ENTER para salir ")); 
                        
                        if (ingresa!=0) {
                            
                            JOptionPane.showMessageDialog(null,"Error de Usuario. Por favor ingrese '0' para iniciar el sistema");               
            }

        } while (ingresa!=0);        
  
        
        
           do {
        
          sistema=  Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de Alumnos. Por favor ingrese el numero de calificaciones que desea evaluar : ")); 
     
        int [] alumno= new int [sistema];
        int total = 0;         
           
          for (int i = 0; i < alumno.length; i++) {           
                
                alumno [i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la calificacion del alumno N°:" + i +" en la posición : " + i));       
        }            
                    String Mensaje= "Las calificaciones  son los siguientes :  \n";            
            
          for (int i = 0; i < alumno.length; i++) {                
                
            Mensaje += "Calificacion N°["+i+"] =  "  + alumno[i]; 
                
                Mensaje+= "\n" ;
                                
                            
        }       JOptionPane.showMessageDialog(null, Mensaje + "Adicionalemente le informamos que el indice de clasificacion de conocimiento es  : " );
        
               Mensaje+= "\n" ;  
   
               
               for (int i = 0; i < 4; i++) {
                   
                   JOptionPane.showMessageDialog(null,"el indice de rendimiento del alumno de la posicion N° " +alumno[i] + " es de :" + " " + "Bajo Conocimiento");
                   
               }
               
                for (int i = 4; i < 5; i++) {
                   
                   JOptionPane.showMessageDialog(null,"el indice de rendimiento del alumno de la posicion N° " +alumno[i] + " es de :" + " " + "Conocimiento Regular");
                   
               }
                
                 for (int i = 5; i < 7; i++) {
                   
                   JOptionPane.showMessageDialog(null,"el indice de rendimiento del alumno de la posicion N° " +alumno[i] + " es de :" + " " + "Conocimientos Buenos");
                   
               }
          for (int i = 7; i < 9; i++) {
                   
                   JOptionPane.showMessageDialog(null,"el indice de rendimiento del alumno de la posicion N° " +alumno[i] + " es de :" + " " + "Conocimiento Muy Buenos");
                   
               }
          
           for (int i = 9; i < 10; i++) {
                   
                   JOptionPane.showMessageDialog(null,"el indice de rendimiento del alumno de la posicion N° " +alumno[i] + " es de :" + " " + "Conocimiento Excelentes");
                   
               }
                 
     continuar = Integer.parseInt(JOptionPane.showInputDialog("si desea realizar otra operacion presione '1' o '2' para salir del sistema "));            
                        
                                                
        } while (continuar==1); 
        
        if (continuar==2) {
                            
                            JOptionPane.showMessageDialog(null,"Gracias por usar el sistema. Buen dia!!!!");   
}
    
}

} 

