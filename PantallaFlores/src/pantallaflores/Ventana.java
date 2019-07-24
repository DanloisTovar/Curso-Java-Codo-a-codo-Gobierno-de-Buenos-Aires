
package pantallaflores;


public class Ventana extends javax.swing.JFrame {

   
    public Ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logocodo = new javax.swing.JLabel();
        seleccion = new javax.swing.JLabel();
        ListaFlores = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        orquidea = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        logojava = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etiquetaResultado = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logocodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codoacodo1.png"))); // NOI18N
        getContentPane().add(logocodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 60));

        seleccion.setFont(new java.awt.Font("Felix Titling", 3, 20)); // NOI18N
        seleccion.setForeground(new java.awt.Color(255, 255, 255));
        seleccion.setText("Seleccione una flor :");
        getContentPane().add(seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, -1));

        ListaFlores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Rosa", "Clavel", "Orquidea", "Girasol", "Lirio" }));
        getContentPane().add(ListaFlores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 180, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danlois Tovar\\Pictures\\chk16.png")); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        orquidea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orquidea amarilla21.png"))); // NOI18N
        getContentPane().add(orquidea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 150));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danlois Tovar\\Pictures\\exit 16.png")); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 90, -1));

        logojava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java32_1.png"))); // NOI18N
        getContentPane().add(logojava, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        etiquetaResultado.setColumns(20);
        etiquetaResultado.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        etiquetaResultado.setForeground(new java.awt.Color(0, 102, 0));
        etiquetaResultado.setRows(5);
        etiquetaResultado.setMargin(new java.awt.Insets(30, 0, 0, 0));
        jScrollPane1.setViewportView(etiquetaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 330, 90));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondoverde.png"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String mensaje ;
        mensaje = "La flor seleccionada es : " + ListaFlores.getSelectedItem().toString();
        etiquetaResultado.setText(mensaje);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaFlores;
    private javax.swing.JTextArea etiquetaResultado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logocodo;
    private javax.swing.JLabel logojava;
    private javax.swing.JLabel orquidea;
    private javax.swing.JLabel seleccion;
    // End of variables declaration//GEN-END:variables
}
