
package pantallaalumnos;


public class Ventana extends javax.swing.JFrame {


    public Ventana() {
        
         setTitle("Alumnos");
         initComponents();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    Data datos = new Data ();
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        logoJava = new javax.swing.JLabel();
        LogoCodoaCodo = new javax.swing.JLabel();
        logoalumnos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chk16.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit 16.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 110, -1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 20));

        jLabelApellido.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        logoJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java31.png"))); // NOI18N
        logoJava.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(logoJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 280));

        LogoCodoaCodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codoacodo1.png"))); // NOI18N
        getContentPane().add(LogoCodoaCodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logoalumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alumnos 333.png"))); // NOI18N
        getContentPane().add(logoalumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen 4.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       datos.CapturarData();
       datos.ImprimirData();
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoCodoaCodo;
    public static javax.swing.JTextField apellido;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel logoJava;
    private javax.swing.JLabel logoalumnos;
    public static javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
