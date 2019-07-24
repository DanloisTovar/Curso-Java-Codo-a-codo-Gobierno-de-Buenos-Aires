
package formulario;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

 
    public Ventana() {
        
        setTitle("Formulario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        initComponents();
        
    }

     Data datos = new Data ();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Codo = new javax.swing.JLabel();
        nombrelabel = new javax.swing.JLabel();
        apellidolabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        genero = new javax.swing.JLabel();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        deacuerdo = new javax.swing.JCheckBox();
        enviar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Codo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codoacodo1.png"))); // NOI18N
        jPanel1.add(Codo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        nombrelabel.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        nombrelabel.setForeground(new java.awt.Color(255, 255, 255));
        nombrelabel.setText("Nombre");
        jPanel1.add(nombrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        apellidolabel.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        apellidolabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidolabel.setText("Apellidos");
        jPanel1.add(apellidolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, -1));
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, -1));

        genero.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        genero.setForeground(new java.awt.Color(255, 255, 255));
        genero.setText("Genero");
        jPanel1.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 245, -1, -1));

        generos.add(hombre);
        hombre.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        hombre.setForeground(new java.awt.Color(255, 255, 255));
        hombre.setText("H");
        hombre.setOpaque(false);
        hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreActionPerformed(evt);
            }
        });
        jPanel1.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 245, -1, -1));

        generos.add(mujer);
        mujer.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        mujer.setForeground(new java.awt.Color(255, 255, 255));
        mujer.setText("M");
        mujer.setOpaque(false);
        mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujerActionPerformed(evt);
            }
        });
        jPanel1.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 245, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Estás de acuerdo ? ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        deacuerdo.setOpaque(false);
        deacuerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deacuerdoActionPerformed(evt);
            }
        });
        jPanel1.add(deacuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 287, -1, -1));

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen 400.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

   
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        
        datos.CapturarData();
         datos.ImprimirData();
         
    }//GEN-LAST:event_enviarActionPerformed

    private void hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreActionPerformed
        if (hombre.isSelected()) {
            
            JOptionPane.showMessageDialog(null, "Es hombre");
            
        } else {
         JOptionPane.showMessageDialog(null, "Seleccione sexo");
        }
    }//GEN-LAST:event_hombreActionPerformed

    public void ValidarCheck () {
        
        
    
        if (deacuerdo.isSelected()) {
            
            enviar.setEnabled(true); 
            
        } else if (deacuerdo.isSelected()==false) {
            enviar.setEnabled(false);
            
        }
    
    }   
    
    private void deacuerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deacuerdoActionPerformed
  
        ValidarCheck();
   
    }//GEN-LAST:event_deacuerdoActionPerformed

    private void mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerActionPerformed
        if (mujer.isSelected()) {
            
             JOptionPane.showMessageDialog(null, "Es mujer");
            
        }else {
         JOptionPane.showMessageDialog(null, "Seleccione Sexo");
        }
    }//GEN-LAST:event_mujerActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codo;
    private javax.swing.JLabel Fondo;
    public static javax.swing.JLabel apellidolabel;
    public static javax.swing.JTextField apellidos;
    public static javax.swing.JCheckBox deacuerdo;
    private javax.swing.JButton enviar;
    public static javax.swing.JLabel genero;
    private javax.swing.ButtonGroup generos;
    public static javax.swing.JRadioButton hombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton mujer;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JLabel nombrelabel;
    // End of variables declaration//GEN-END:variables
}
