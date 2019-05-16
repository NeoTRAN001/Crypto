package numericalbase2;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Neo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCipher = new javax.swing.JButton();
        btnDecipher = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 37, 38));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 57, 60));

        jtbData.setBackground(new java.awt.Color(35, 39, 43));
        jtbData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbData.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jtbData.setForeground(new java.awt.Color(218, 209, 209));
        jtbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Letter", "Value", "Base"
            }
        ));
        jtbData.setGridColor(new java.awt.Color(146, 146, 146));
        jtbData.setRowHeight(35);
        jtbData.setSelectionForeground(new java.awt.Color(35, 39, 42));
        jScrollPane1.setViewportView(jtbData);

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(35, 39, 42));
        txtResult.setColumns(20);
        txtResult.setForeground(new java.awt.Color(218, 209, 209));
        txtResult.setLineWrap(true);
        txtResult.setRows(5);
        txtResult.setAutoscrolls(false);
        txtResult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtResult);

        txtText.setBackground(new java.awt.Color(35, 39, 42));
        txtText.setColumns(20);
        txtText.setForeground(new java.awt.Color(218, 209, 209));
        txtText.setLineWrap(true);
        txtText.setRows(5);
        txtText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(txtText);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 237));
        jLabel1.setText("Result:");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 237));
        jLabel2.setText("Text: ");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 237));
        jLabel3.setText("Data: ");

        btnCipher.setBackground(new java.awt.Color(51, 57, 60));
        btnCipher.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        btnCipher.setForeground(new java.awt.Color(238, 238, 235));
        btnCipher.setText("Cipher");
        btnCipher.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCipherActionPerformed(evt);
            }
        });

        btnDecipher.setBackground(new java.awt.Color(51, 57, 60));
        btnDecipher.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        btnDecipher.setForeground(new java.awt.Color(238, 238, 235));
        btnDecipher.setText("Decipher");
        btnDecipher.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDecipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecipherActionPerformed(evt);
            }
        });

        btnUp.setBackground(new java.awt.Color(51, 57, 60));
        btnUp.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        btnUp.setForeground(new java.awt.Color(238, 238, 235));
        btnUp.setText("^");
        btnUp.setToolTipText("");
        btnUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCipher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDecipher)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnUp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCipher)
                    .addComponent(btnDecipher))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnCipher.getAccessibleContext().setAccessibleName("btnCipher");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCipherActionPerformed
        
        Cipher cipher = new Cipher();
        String text = cipher.init(txtText.getText());
        
        insertTable(txtText.getText(), text);
        txtResult.setText(text);
    }//GEN-LAST:event_btnCipherActionPerformed

    private void btnDecipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecipherActionPerformed
        Cipher cipher = new Cipher();
        String text = cipher.decipher(txtText.getText());
        
        insertTable(text, txtText.getText());
        txtResult.setText(text);
    }//GEN-LAST:event_btnDecipherActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        txtText.setText(txtResult.getText());
    }//GEN-LAST:event_btnUpActionPerformed

    private void insertTable(String text, String value)  {
        DefaultTableModel tableData = new DefaultTableModel();
        tableData.addColumn("Letter");
        tableData.addColumn("Value");
        tableData.addColumn("Base");
        
        jtbData.setModel(tableData);
        
        char[] letter = text.toCharArray();
        String[] letterValue = value.split(" ");
        int base = 2;
        
        for(int i = 0; i < text.length(); i++) {
            if(base == 37) base = 2;
            tableData.addRow(new Object[]{letter[i],letterValue[i], base});
            base++;
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCipher;
    private javax.swing.JButton btnDecipher;
    private javax.swing.JButton btnUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbData;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextArea txtText;
    // End of variables declaration//GEN-END:variables
}
