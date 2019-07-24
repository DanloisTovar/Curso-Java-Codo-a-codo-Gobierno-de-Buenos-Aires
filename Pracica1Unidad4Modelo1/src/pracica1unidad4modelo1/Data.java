
package pracica1unidad4modelo1;

import javax.swing.JOptionPane;

public class Data {

    public Data() {
        
        
    }
    
    String nombre= "";
    String apellido = "";
    
    public void CapturaData () {
        
        nombre = Ventana.nombre.getText();
        apellido = Ventana.apellido.getText();
    
    }
    
    public void ImprimirData () {
    
        JOptionPane.showMessageDialog(null, "El nombre que introdujo es : " + nombre +"\n El apellido que introdujo es : "  + apellido, "mensaje", JOptionPane.PLAIN_MESSAGE);
    
    }
    
}
