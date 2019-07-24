
package numerospareseimpares;

import java.awt.TextField;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        initComponents();
    }

 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logocodo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        comprobar = new javax.swing.JButton();
        logojava = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logocodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codoacodo1.png"))); // NOI18N
        jPanel1.add(logocodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor ingrese un numero ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 80, -1));

        comprobar.setText("Comprobar");
        comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarActionPerformed(evt);
            }
        });
        jPanel1.add(comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        logojava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java31.png"))); // NOI18N
        jPanel1.add(logojava, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen 400.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarActionPerformed
       
              
        if (Integer.parseInt(numero.getText()) %2==0) {
            
            JOptionPane.showMessageDialog(null, "El numero " + numero.getText() + " es par ");
        } else {
            
              JOptionPane.showMessageDialog(null, "El numero " + numero.getText() + " es impar ");
            
        }
        
      
    }//GEN-LAST:event_comprobarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprobar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logocodo;
    private javax.swing.JLabel logojava;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables
}
