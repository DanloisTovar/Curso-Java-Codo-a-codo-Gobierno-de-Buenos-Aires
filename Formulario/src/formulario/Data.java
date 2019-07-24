
package formulario;

import javax.swing.JOptionPane;


public class Data {

    public Data() {
    }
    
    String nombre = "";
    String apellidos="" ;
    
    
    
    

    
    
     public void CapturarData () {
    
         nombre = Ventana.nombre.getText();
        apellidos = Ventana.apellidos.getText();        
    
    }
    
    public void ImprimirData () {
    
        JOptionPane.showMessageDialog(null, "El nombre que introdujo es : " + nombre +"\n El apellido que introdujo es : "  + apellidos, "mensaje" + "", JOptionPane.PLAIN_MESSAGE);
    
    }
    
}
