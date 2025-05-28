package sidequest;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignUp extends javax.swing.JFrame {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUp signUpFrame = new SignUp();
                signUpFrame.setVisible(true);
                signUpFrame.pack();
                signUpFrame.setLocationRelativeTo(null);
            }
        });
    }

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        label_fullname = new javax.swing.JLabel();
        jTFfullname = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        jTFemail = new javax.swing.JTextField();
        label_phonenumber = new javax.swing.JLabel();
        jTFphonenumber = new javax.swing.JTextField();
        label_address = new javax.swing.JLabel();
        jTFaddress = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        jPpassword = new javax.swing.JPasswordField();
        label_confirmpassword = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jBsignup = new javax.swing.JButton();
        label_username = new javax.swing.JLabel();
        jTFusername = new javax.swing.JTextField();
        label_userrole = new javax.swing.JLabel();
        jCBgender = new javax.swing.JComboBox<>();
        label_gender = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        jBlogin = new javax.swing.JButton();
        jCBuserrole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 188, 126));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setRequestFocusEnabled(false);

        label_fullname.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_fullname.setForeground(new java.awt.Color(12, 21, 52));
        label_fullname.setText("Full Name");

        jTFfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFfullnameActionPerformed(evt);
            }
        });

        label_email.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_email.setForeground(new java.awt.Color(12, 21, 52));
        label_email.setText("Email Address");

        jTFemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFemailActionPerformed(evt);
            }
        });

        label_phonenumber.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_phonenumber.setForeground(new java.awt.Color(12, 21, 52));
        label_phonenumber.setText("Phone Number");

        jTFphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFphonenumberActionPerformed(evt);
            }
        });

        label_address.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_address.setForeground(new java.awt.Color(12, 21, 52));
        label_address.setText("Address");

        label_password.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_password.setForeground(new java.awt.Color(12, 21, 52));
        label_password.setText("Password");

        label_confirmpassword.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_confirmpassword.setForeground(new java.awt.Color(12, 21, 52));
        label_confirmpassword.setText("Confirm Password");

        jBsignup.setForeground(new java.awt.Color(0, 0, 0));
        jBsignup.setText("Sign Up");
        jBsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsignupActionPerformed(evt);
            }
        });

        label_username.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_username.setForeground(new java.awt.Color(12, 21, 52));
        label_username.setText("Username");

        label_userrole.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_userrole.setForeground(new java.awt.Color(12, 21, 52));
        label_userrole.setText("User Role");

        jCBgender.setForeground(new java.awt.Color(0, 0, 0));
        jCBgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to say" }));

        label_gender.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_gender.setForeground(new java.awt.Color(12, 21, 52));
        label_gender.setText("Gender");

        label_login.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        label_login.setForeground(new java.awt.Color(12, 21, 52));
        label_login.setText("I have an account");

        jBlogin.setForeground(new java.awt.Color(0, 0, 0));
        jBlogin.setText("Login");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });

        jCBuserrole.setForeground(new java.awt.Color(0, 0, 0));
        jCBuserrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer", "Employee" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_fullname)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_gender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFemail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_confirmpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFusername, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTFfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_phonenumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFphonenumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_userrole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBuserrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFaddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBlogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsignup)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fullname)
                    .addComponent(jTFfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gender)
                    .addComponent(jCBgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_phonenumber)
                    .addComponent(jTFphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_address)
                    .addComponent(jTFaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_username)
                    .addComponent(jTFusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(jPpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_confirmpassword)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_userrole)
                    .addComponent(jCBuserrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jBsignup)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBlogin)
                            .addComponent(label_login))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFfullnameActionPerformed

    private void jTFemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFemailActionPerformed

    private void jTFphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFphonenumberActionPerformed

    private void jBsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsignupActionPerformed
        String full_name = jTFfullname.getText().trim();
        String gender = (String) jCBgender.getSelectedItem();
        String email = jTFemail.getText().trim();
        String phone_number = jTFphonenumber.getText().trim();
        String address = jTFaddress.getText().trim();
        String username = jTFusername.getText().trim();
        String password = new String(jPpassword.getPassword());
        String confirmPassword = new String(jPasswordField2.getPassword());
        String userRole = (String) jCBuserrole.getSelectedItem();
        
        if (full_name.isEmpty() || gender.isEmpty() || email.isEmpty() || phone_number.isEmpty() ||
                address.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.");
            return;
        }
        
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
            return;
        }
        
        if (!phone_number.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number (11 digits).");
            return;
        }
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/java_user_database";
            Connection conn = DriverManager.getConnection(url, "root", "");
            
            String checkUsername = "SELECT * FROM users WHERE username = ?";
            PreparedStatement checkUsernameStmt = conn.prepareStatement(checkUsername);
            checkUsernameStmt.setString(1, username);
            ResultSet userResult = checkUsernameStmt.executeQuery();
            
            if (userResult.next()) {
                JOptionPane.showMessageDialog(this, "Username is already in use. Please choose another one");
                conn.close();
                return;
            }
            
            String checkEmail = "SELECT * FROM users WHERE email = ?";
            PreparedStatement checkEmailStmt = conn.prepareStatement (checkEmail);
            checkEmailStmt.setString(1, email);
            ResultSet emailResult = checkEmailStmt.executeQuery();
            
            if (emailResult.next()) {
                JOptionPane.showMessageDialog(this, "Email is already in use.");
                conn.close();
                return;
            }
            
            String checkPhoneNumber = "Select * FROM users WHERE phone_number = ?";
            PreparedStatement checkPhoneNumStmt = conn.prepareStatement (checkPhoneNumber);
            checkPhoneNumStmt.setString(1, phone_number);
            ResultSet phonenumResult = checkPhoneNumStmt.executeQuery();
            
            if (phonenumResult.next()) {
                JOptionPane.showMessageDialog(this, "Phone number is already taken.");
                conn.close();
                return;
            }
            

            String sql = "INSERT INTO users (full_name, gender, email, phone_number, address, username, password, user_role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, full_name);
            stmt.setString(2, gender);
            stmt.setString(3, email);
            stmt.setString(4, phone_number);
            stmt.setString(5, address);
            stmt.setString(6, username);
            stmt.setString(7, password);
            stmt.setString(8, userRole);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Sign Up successful!");
                Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);
                this.dispose();
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jBsignupActionPerformed

    private void jBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloginActionPerformed
        Login LoginFrame = new Login ();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jBloginActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBlogin;
    private javax.swing.JButton jBsignup;
    private javax.swing.JComboBox<String> jCBgender;
    private javax.swing.JComboBox<String> jCBuserrole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPpassword;
    private javax.swing.JTextField jTFaddress;
    private javax.swing.JTextField jTFemail;
    private javax.swing.JTextField jTFfullname;
    private javax.swing.JTextField jTFphonenumber;
    private javax.swing.JTextField jTFusername;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_confirmpassword;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_fullname;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_phonenumber;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel label_userrole;
    // End of variables declaration//GEN-END:variables
}
