
package ejercicionumeromayorde3;

import java.util.Scanner;


public class Operaciones {
    
     int ingresa1, ingresa2, ingresa3;
     
     Scanner ingresa= new Scanner (System.in);
     
     
     public void Calculando() {
     
         System.out.println("Por favor ingrese el 1er numero ");
         
                            ingresa1= ingresa.nextInt();
         
         System.out.println("Por favor ingresa el 2do numero ");
         
                            ingresa2= ingresa.nextInt();

         System.out.println("Por favor eingresa el 3er numero");
         
                            ingresa3= ingresa.nextInt();
         
         System.out.println("Los numeros ingresados son :" + " " + " El primero  es :" + " " + ingresa1 + " " + "el segundo : " + " " + ingresa2 + " " + " y el tercero : " + " " + ingresa3);
         
                            if (ingresa1 > ingresa2 & ingresa1 > ingresa3 ) {
             
             System.out.println(" El numero mayor es :" + ingresa1);
             
         }
                            if (ingresa2 > ingresa1 & ingresa2 > ingresa3) {
             
             System.out.println("El numero  mayor es : " + ingresa2);
             
         }
         
                            if (ingresa3> ingresa1 & ingresa3 > ingresa2) {
             
             System.out.println("El numero mayor es : "+ ingresa3);
             
         }         
     
     }
    
}
