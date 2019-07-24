
package ejerciciofecha;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operaciones {
    
int ingresaDia, ingresaMes, ingresaAño;

public void CalculoDias (){

ingresaDia = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el dia :"));

ingresaMes = Integer.parseInt(JOptionPane.showInputDialog("Poer favor ingrese el mes :"));

ingresaAño = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese el año :"));

    if ((ingresaDia>0) &&( ingresaDia<=30)) {
        
                   if ((ingresaMes>= 1) && (ingresaMes<=12)) {
            
                                    if (ingresaAño!=0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");               
            }
                                    else {
                                        JOptionPane.showMessageDialog(null, "El año es incorrecto");

                                    }                        
        }
        else {
            JOptionPane.showMessageDialog(null, "El mes es incorrecto");
        }      
    }
    else {
    JOptionPane.showMessageDialog(null, "El dia es incorrecto");
    }   
    
    switch (ingresaMes) {
        case 1: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Enero " + " " + ingresaAño);
        } break;
        
          case 2: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Febrero " + " " + ingresaAño);
        } break;
        
          case 3: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Marzo" + " " + ingresaAño);
        } break;
        
          case 4: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Abril " + " " + ingresaAño);
        } break;
        
          case 5: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Mayo " + " " + ingresaAño);
        } break;
          case 6: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Junio" + " " + ingresaAño);
        } break;
          case 7: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Julio" + " " + ingresaAño);
        } break;
          case 8: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Agosto " + " " + ingresaAño);
        } break;
          case 9: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Septiembre" + " " + ingresaAño);
        } break;
          case 10: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Octubre " + " " + ingresaAño);
        } break;
          case 11: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Noviembre " + " " + ingresaAño);
        } break;
          case 12: {
        JOptionPane.showMessageDialog(null, "La fecha que introdujo es : \n" + ingresaDia +" " + "Diciembre " + " " + ingresaAño);
        } break;
        default:
            throw new AssertionError();
    }
}

    
}
