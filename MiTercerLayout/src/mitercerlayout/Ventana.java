
package mitercerlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame {
    
    public JPanel panel;
    public JPanel panel1;
    JButton b0, b1,  b2,b3, b4, b5, b6, b7 , b8;

    public Ventana() {
        
        IniciarComponentes();
        AgregarBotones();
        Gridbotones();        
        
        this.setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mi Tercer Layout");
        setLocationRelativeTo(null);         
    }
    
     private void IniciarComponentes () {
    
        panel = new JPanel ();
        
        panel.setBackground(Color.blue);        
        this.getContentPane().add(panel);
        setContentPane(panel);
        panel.setLayout(new BorderLayout());       
        
        b0 = new JButton ("Boton 0");
        b1 = new JButton ("Boton 1");
        b2 = new JButton ("Boton 2");
        b3 = new JButton ("Boton 3");
        b4 = new JButton ("Boton 4");
        b5 = new JButton ("Boton 5");
        b6 = new JButton ("Boton 6");
        b7 = new JButton ("Boton 7");
        b8 = new JButton ("Boton 8");            
    }
    
     
     public void AgregarBotones (){  
         
         panel.add(b5, BorderLayout.NORTH);
         panel.add(b6, BorderLayout.WEST);
         panel.add(b8,BorderLayout.EAST);
         panel.add(b7,BorderLayout.SOUTH);          
     }   
     
     public void Gridbotones () {
     
         panel1 = new JPanel ();         
         panel1.setLayout(new GridLayout(2,2));         
         add(panel1, BorderLayout.CENTER);
         
         panel1.add(b0);
         panel1.add(b1);
         panel1.add(b2);
         panel1.add(b3);   
     }
     

    
}
