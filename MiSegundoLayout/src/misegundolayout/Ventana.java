
package misegundolayout;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana  extends JFrame {
    
    public JPanel panel;
    JButton b0, b1,  b2,b3, b4, b5, b6, b7 , b8, b9 , b10 , b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    
    public Ventana () {
        
        IniciarComponentes();
        AgregarGridLayaout();
        
    
        this.setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mi segundo Layout");
        setLocationRelativeTo(null);   
    }  
    
    private void IniciarComponentes () {
    
        panel = new JPanel ();
        
        panel.setBackground(Color.blue);
        panel.setLayout(new GridLayout(5,4));
        this.getContentPane().add(panel);
        setContentPane(panel);
            
    }
    
    private void AgregarGridLayaout () {
        
        b0 = new JButton ("Boton 0");
        b1 = new JButton ("Boton 1");
        b2 = new JButton ("Boton 2");
        b3 = new JButton ("Boton 3");
        b4 = new JButton ("Boton 4");
        b5 = new JButton ("Boton 5");
        b6 = new JButton ("Boton 6");
        b7 = new JButton ("Boton 7");
        b8 = new JButton ("Boton 8");
        b9 = new JButton ("Boton 9");
        b10 = new JButton ("Boton 10");
        b11 = new JButton ("Boton 11");
        b12 = new JButton ("Boton 12");
        b13 = new JButton ("Boton 13");
        b14 = new JButton ("Boton 14");
        b15 = new JButton ("Boton 15");
        b16 = new JButton ("Boton 16");
        b17 = new JButton ("Boton 17");
        b18= new JButton ("Boton 18");
        b19 = new JButton ("Boton 19");
        b20 = new JButton ("Boton 20"); 
        b21 = new JButton ("Boton 21");
        b22 = new JButton ("Boton 22");
        b23 = new JButton ("Boton 23");
        b24 = new JButton ("Boton 24");
        
        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        panel.add(b17);
        panel.add(b18);
        panel.add(b19);
        panel.add(b20);
        panel.add(b21);
        panel.add(b22);
        panel.add(b23);
        panel.add(b24);             
        
    }
        
     
    
    
    
}
