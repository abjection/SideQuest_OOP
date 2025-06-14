package sidequest;

public class App extends javax.swing.JFrame {
    
    private UserProfile userProfileFrame;
    private String currentUsername;
    private String currentUserRole;
    private App parentApp;
    

    public App(String username, String userRole) {
        this.currentUsername = username;
        this.currentUserRole = userRole;
        this.parentApp = parentApp;
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
        placeholder_deleteme1 = new javax.swing.JLabel();
        jPsidebuttons = new javax.swing.JPanel();
        placeholder_deleteme = new javax.swing.JLabel();
        jBsearchbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 800));

        jPanel1.setBackground(new java.awt.Color(12, 21, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        label_homepage.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        label_homepage.setForeground(new java.awt.Color(255, 255, 255));
        label_homepage.setText("Homepage");

        jTFsearchbar.setText("Search");

        usericon_deleteme.setForeground(new java.awt.Color(255, 255, 255));
        usericon_deleteme.setText("usericon_placeholder");
        usericon_deleteme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usericon_deletemeMouseClicked(evt);
            }
        });

        placeholder_deleteme1.setText("mainpanel_placeholder_toberemoved");

        javax.swing.GroupLayout jPactivitiesLayout = new javax.swing.GroupLayout(jPactivities);
        jPactivities.setLayout(jPactivitiesLayout);
        jPactivitiesLayout.setHorizontalGroup(
            jPactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPactivitiesLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(placeholder_deleteme1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPactivitiesLayout.setVerticalGroup(
            jPactivitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPactivitiesLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(placeholder_deleteme1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        placeholder_deleteme.setText("sidepanel_placeholder_toberemoved");

        javax.swing.GroupLayout jPsidebuttonsLayout = new javax.swing.GroupLayout(jPsidebuttons);
        jPsidebuttons.setLayout(jPsidebuttonsLayout);
        jPsidebuttonsLayout.setHorizontalGroup(
            jPsidebuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsidebuttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholder_deleteme, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPsidebuttonsLayout.setVerticalGroup(
            jPsidebuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsidebuttonsLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(placeholder_deleteme)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jBsearchbutton.setText("Search");
        jBsearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsearchbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPsidebuttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jPactivities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(185, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288)
                        .addComponent(jTFsearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsearchbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usericon_deleteme)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFsearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsearchbutton)
                    .addComponent(usericon_deleteme))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsearchbuttonActionPerformed
        // TODO 
        // gawing icon yung button or okay na yung search 
    }//GEN-LAST:event_jBsearchbuttonActionPerformed

    private void usericon_deletemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericon_deletemeMouseClicked
        if (userProfileFrame == null || !userProfileFrame.isVisible()) {
            userProfileFrame = new UserProfile(currentUsername, currentUserRole, this);
            userProfileFrame.setVisible(true);
            userProfileFrame.pack();
            userProfileFrame.setLocationRelativeTo(null);
        } else {
            userProfileFrame.toFront();
            userProfileFrame.requestFocus();
        }
    }//GEN-LAST:event_usericon_deletemeMouseClicked

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App("test_user", "Employee").setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsearchbutton;
    private javax.swing.JPanel jPactivities;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPsidebuttons;
    private javax.swing.JTextField jTFsearchbar;
    private javax.swing.JLabel label_homepage;
    private javax.swing.JLabel placeholder_deleteme;
    private javax.swing.JLabel placeholder_deleteme1;
    private javax.swing.JLabel usericon_deleteme;
    // End of variables declaration//GEN-END:variables
}
