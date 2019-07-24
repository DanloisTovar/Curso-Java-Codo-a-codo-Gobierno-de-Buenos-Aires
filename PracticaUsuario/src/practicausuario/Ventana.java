
package practicausuario;

import java.awt.Color;
import javax.swing.JPanel;


public class Ventana extends javax.swing.JFrame {

   
    public Ventana() {
        initComponents();
        
        setSize(600, 400); // tamaño de ventana
        setTitle("Usuario"); // Titulode ventana
        //setLocation(100, 200); // poscion de la ventana
        //setBounds(100, 200, 500, 500); // poscion ancho y largo de la ventana
        setLocationRelativeTo(null); // centrar ventana
        setResizable(false); //esblecemos si la pantalla puedecambiar de tamañoo no
        
        
        
        //this.getContentPane().setBackground(Color.blue); //establecemos color.
      //InicarCompontes () ; // esto se agrega par que aparezca toda la configuracion del panel cuando uno mismo lo hace
       
                
    }
    
    // esto es el mismo  initComponents(); pero hecho por uno 
    private void InicarCompontes () {
    
        JPanel panel = new JPanel (); // creacion del panel en la en la ventana        
         this.getContentPane().add(panel); //aregar panel en la ventana
         panel.setBackground(Color.BLUE); 
    
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
