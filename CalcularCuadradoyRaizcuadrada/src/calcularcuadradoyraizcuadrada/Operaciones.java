
package calcularcuadradoyraizcuadrada;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operaciones {
    


public void CalculandoPotenciayRaiz() {
    
    double ingresa = 0;
    int exponente;
        
    do {
        
        ingresa = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero que desea calcular :")); 
        
         exponente = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el exponente por el cual desea calcular el cuadrado :")); 
        
         if (ingresa==0) {
        
                   JOptionPane.showMessageDialog(null, "Error de Usuario. Por favor ingrese mayor que 0:");             
                  
    }  
        
    } while (ingresa==0);
    
int ResultadoP =(int) Math.pow(ingresa, exponente);
int ResultadoR = (int) Math.sqrt(ingresa);
    
    if (ingresa > 0) {        
    
                  JOptionPane.showMessageDialog(null," El resultado de los Calculos es el siguiente : \n" + "Cuadrado : " + ResultadoP + " \n" + "Raiz Cuadrada : " + ResultadoR );     
    }
}
    
}
