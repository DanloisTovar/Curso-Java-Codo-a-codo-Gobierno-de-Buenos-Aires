
package pantallasuma;


public class Ventana extends javax.swing.JFrame {
    
     int primerNumero = 0;
        int segundoNumero = 0;

 
    public Ventana() {
        
        setTitle("Programa de suma");
        setDefaultCloseOperation(0);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoCodo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        suma1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        suma2 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        Datos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultadolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoCodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codoacodo1.png"))); // NOI18N
        jPanel1.add(logoCodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor introduzca el primer numero ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel1.add(suma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor introduzca el segundo numero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(suma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, -1));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chk16.png"))); // NOI18N
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 51, 255));
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, 40));

        Datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar 16.png"))); // NOI18N
        Datos.setText("Limpiar");
        Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosActionPerformed(evt);
            }
        });
        jPanel1.add(Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit 16.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 90, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resultado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        resultadolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen 400.jpg"))); // NOI18N
        jPanel1.add(resultadolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
       
        
        primerNumero = Integer.parseInt(this.suma1.getText());
        segundoNumero = Integer.parseInt(this.suma2.getText());
        
        int totalSuma= primerNumero + segundoNumero;
        
        resultado.setText( "La suma de los numeros ingresados da un total de  : "+String.valueOf(totalSuma));
        
        
        
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosActionPerformed

suma1.setText(null);
suma2.setText(null);
resultado.setText(null);
       
    }//GEN-LAST:event_DatosActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Datos;
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoCodo;
    private javax.swing.JTextArea resultado;
    private javax.swing.JLabel resultadolabel;
    private javax.swing.JTextField suma1;
    private javax.swing.JTextField suma2;
    // End of variables declaration//GEN-END:variables
}
