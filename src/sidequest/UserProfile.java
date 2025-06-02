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
    private String currentUserRole;

    public UserProfile(String username, String userRole) {
        this.currentUsername = username;
        this.currentUserRole = userRole;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        connectToDatabase();
        loadUserProfile();
        
        jTFuserrole.setText(currentUserRole);
        jTFuserrole.setEditable(false);
        
        jBsave.setVisible(false);
        jBedit.addActionListener( e -> {
            jTFfullname.setEditable(true);
            jTFemail.setEditable(true);
            jTFphonenumber.setEditable(true);
            jTAaddress.setEditable(true);
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
                jTFfullname.setText(rs.getString("full_name"));
                jTFemail.setText(rs.getString("email"));
                jTFphonenumber.setText(rs.getString("phone_number"));
                jTAaddress.setText(rs.getString("address"));
                
                jTFfullname.setEditable(false);
                jTFemail.setEditable(false);
                jTFphonenumber.setEditable(false);
                jTAaddress.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "User profile not found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading profile: " + e.getMessage());
        }
    }
    
    private void saveChanges() {
        try {
        String fullName = jTFfullname.getText().trim();
        String email = jTFemail.getText().trim();
        String phoneNumber = jTFphonenumber.getText().trim();
        String address = jTAaddress.getText().trim();
        
        if (fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all user information fields.");
            return;
        }
        
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
                jTFfullname.setEditable(false);
                jTFemail.setEditable(false);
                jTFphonenumber.setEditable(false);
                jTAaddress.setEditable(false);
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
            PreparedStatement stmt = null;
            try {
                String sql = "DELETE FROM users WHERE username = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, this.currentUsername);
                int rowsDeleted = stmt.executeUpdate();
                
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Account deleted successfully.");
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                    dispose();
                    java.awt.EventQueue.invokeLater(() -> {
                        new Login().setVisible(true);
                    });
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete account.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error deleting account." + e.getMessage());
            } finally {
                try { if (stmt != null) stmt.close(); } catch (Exception ex) {}
                try { if (conn != null) conn.close(); } catch (Exception ex) {}
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
        jBedit = new javax.swing.JButton();
        jBsave = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jBreturn = new javax.swing.JButton();
        label_userinfo = new javax.swing.JLabel();
        label_fullname = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_phonenumber = new javax.swing.JLabel();
        label_address = new javax.swing.JLabel();
        jTFfullname = new javax.swing.JTextField();
        jTFemail = new javax.swing.JTextField();
        jTFphonenumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAaddress = new javax.swing.JTextArea();
        label_userrole = new javax.swing.JLabel();
        jTFuserrole = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(12, 21, 52));
        setPreferredSize(new java.awt.Dimension(415, 590));

        jPanel1.setBackground(new java.awt.Color(12, 21, 52));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 610));

        jBedit.setText("Edit");

        jBsave.setText("Save");

        jBdelete.setText("Delete User");

        jBreturn.setText("Return");

        label_userinfo.setBackground(new java.awt.Color(255, 255, 255));
        label_userinfo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        label_userinfo.setForeground(new java.awt.Color(255, 255, 255));
        label_userinfo.setText("User Info");

        label_fullname.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_fullname.setForeground(new java.awt.Color(255, 255, 255));
        label_fullname.setText("Full Name:");

        label_email.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_email.setForeground(new java.awt.Color(255, 255, 255));
        label_email.setText("Email:");

        label_phonenumber.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_phonenumber.setForeground(new java.awt.Color(255, 255, 255));
        label_phonenumber.setText("Phone Number:");

        label_address.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_address.setForeground(new java.awt.Color(255, 255, 255));
        label_address.setText("Address:");

        jTAaddress.setColumns(20);
        jTAaddress.setRows(5);
        jScrollPane1.setViewportView(jTAaddress);

        label_userrole.setForeground(new java.awt.Color(255, 255, 255));
        label_userrole.setText("User Role:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_address)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 30, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBdelete)
                                            .addComponent(jBedit))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBsave)
                                            .addComponent(jBreturn))
                                        .addGap(19, 19, 19))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jTFphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(label_fullname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(jTFfullname, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_email)
                    .addComponent(label_phonenumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_userrole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFuserrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_userinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fullname)
                    .addComponent(jTFfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_address)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_userrole)
                    .addComponent(jTFuserrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBedit)
                    .addComponent(jBsave))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdelete)
                    .addComponent(jBreturn))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        java.awt.EventQueue.invokeLater(() -> new UserProfile("test_user", "Employee").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jBedit;
    private javax.swing.JButton jBreturn;
    private javax.swing.JButton jBsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAaddress;
    private javax.swing.JTextField jTFemail;
    private javax.swing.JTextField jTFfullname;
    private javax.swing.JTextField jTFphonenumber;
    private javax.swing.JTextField jTFuserrole;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_fullname;
    private javax.swing.JLabel label_phonenumber;
    private javax.swing.JLabel label_userinfo;
    private javax.swing.JLabel label_userrole;
    // End of variables declaration//GEN-END:variables
}
