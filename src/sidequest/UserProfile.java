package sidequest;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserProfile extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserProfile.class.getName());
    private Connection conn;
    private String currentUsername;

    public UserProfile(String username) {
        this.currentUsername = username;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        connectToDatabase();
        loadUserProfile();
        jTAuserinfo.setEditable(false);
        jBsave.setVisible(false);

        jBedit.addActionListener( e -> {
            jTAuserinfo.setEditable(true);
            jBsave.setVisible(true);
    });
        
        jBsave.addActionListener( e -> saveChanges());
        jBreturn.addActionListener( e -> dispose());
        jBdelete.addActionListener( e -> deleteUser());
}

    private void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/java_user_database";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
        }
    }
    
    private void loadUserProfile() {
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.currentUsername);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                String userInfo = "Full Name: " + rs.getString("full_name") + "\n" +
                                  "Email: " + rs.getString("email") + "\n" +
                                  "Phone Number: " + rs.getString("phone_number") + "\n" +
                                  "Address: " + rs.getString("address");
                jTAuserinfo.setText(userInfo);
            } else {
                JOptionPane.showMessageDialog(this, "User profile not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading profile: " + e.getMessage());
        }
    }
    
    private void saveChanges() {
        try {
        String[] userInfo = jTAuserinfo.getText().split("\n");
        
        if (userInfo.length < 4) {
            JOptionPane.showMessageDialog(this, "Please complete all user information fields.");
            return;
        }
        
        String fullName = userInfo[0].split(": ")[1];
        String email = userInfo[1].split(": ")[1];
        String phoneNumber = userInfo[2].split(": ")[1];
        String address = userInfo[3].split(": ")[1];
        
        String currentUsername = "current_user";
        
            String sql = "UPDATE users SET full_name = ?, email = ?, phone_number = ?, address = ? WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullName);
            stmt.setString(2, email);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, address);
            stmt.setString(5, this.currentUsername);
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully!");
                jTAuserinfo.setEditable(false);
                jBsave.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Profile update failed.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating profile." + e.getMessage());
        }
    }
    
    private void deleteUser() {
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete your account?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM users WHERE username = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, this.currentUsername);
                int rowsDeleted = stmt.executeUpdate();
                
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Account deleted successfully.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete account.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error deleting account." + e.getMessage());
                }
            }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTAuserinfo = new javax.swing.JTextArea();
        jBedit = new javax.swing.JButton();
        jBsave = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jBreturn = new javax.swing.JButton();
        label_userinfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(12, 21, 52));
        setPreferredSize(new java.awt.Dimension(415, 590));

        jPanel1.setBackground(new java.awt.Color(12, 21, 52));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(415, 590));

        jTAuserinfo.setEditable(false);
        jTAuserinfo.setColumns(20);
        jTAuserinfo.setRows(5);

        jBedit.setText("Edit");

        jBsave.setText("Save");

        jBdelete.setText("Delete User");

        jBreturn.setText("Return");

        label_userinfo.setBackground(new java.awt.Color(255, 255, 255));
        label_userinfo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        label_userinfo.setForeground(new java.awt.Color(255, 255, 255));
        label_userinfo.setText("User Info");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBedit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBsave))
                                .addComponent(jTAuserinfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBdelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBreturn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_userinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTAuserinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBedit)
                    .addComponent(jBsave))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBreturn)
                    .addComponent(jBdelete))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserProfile("test_user").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jBedit;
    private javax.swing.JButton jBreturn;
    private javax.swing.JButton jBsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTAuserinfo;
    private javax.swing.JLabel label_userinfo;
    // End of variables declaration//GEN-END:variables
}
