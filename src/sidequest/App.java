package sidequest;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_homepage = new javax.swing.JLabel();
        jTFsearchbar = new javax.swing.JTextField();
        usericon_deleteme = new javax.swing.JLabel();
        jPactivities = new javax.swing.JPanel();
        deleteme = new javax.swing.JTextField();
        jPsidebuttons = new javax.swing.JPanel();
        deleteme1 = new javax.swing.JTextField();
        deleteme2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 21, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        label_homepage.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        label_homepage.setForeground(new java.awt.Color(255, 255, 255));
        label_homepage.setText("Homepage");

        jTFsearchbar.setText("Search");

        usericon_deleteme.setForeground(new java.awt.Color(255, 255, 255));
        usericon_deleteme.setText("UserIcon_Placeholder");

        deleteme.setText("mainpanel_placeholder_toberemoved");
        deleteme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPactivitiesLayout = new javax.swing.GroupLayout(jPactivities);
        jPactivities.setLayout(jPactivitiesLayout);
        jPactivitiesLayout.setHorizontalGroup(
            jPactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPactivitiesLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(deleteme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        jPactivitiesLayout.setVerticalGroup(
            jPactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPactivitiesLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(deleteme, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteme1.setText("placeholder_toberemoved");
        deleteme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteme1ActionPerformed(evt);
            }
        });

        deleteme2.setText("sidepanel");
        deleteme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteme2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPsidebuttonsLayout = new javax.swing.GroupLayout(jPsidebuttons);
        jPsidebuttons.setLayout(jPsidebuttonsLayout);
        jPsidebuttonsLayout.setHorizontalGroup(
            jPsidebuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsidebuttonsLayout.createSequentialGroup()
                .addGroup(jPsidebuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPsidebuttonsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(deleteme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPsidebuttonsLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(deleteme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPsidebuttonsLayout.setVerticalGroup(
            jPsidebuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPsidebuttonsLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(deleteme2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteme1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288)
                        .addComponent(jTFsearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usericon_deleteme))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPsidebuttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jPactivities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFsearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(usericon_deleteme)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPactivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPsidebuttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(251, Short.MAX_VALUE))
        );

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

    private void deleteme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteme1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteme1ActionPerformed

    private void deleteme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteme2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteme2ActionPerformed

    private void deletemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletemeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deleteme;
    private javax.swing.JTextField deleteme1;
    private javax.swing.JTextField deleteme2;
    private javax.swing.JPanel jPactivities;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPsidebuttons;
    private javax.swing.JTextField jTFsearchbar;
    private javax.swing.JLabel label_homepage;
    private javax.swing.JLabel usericon_deleteme;
    // End of variables declaration//GEN-END:variables
}
