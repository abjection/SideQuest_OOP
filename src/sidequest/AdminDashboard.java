package sidequest;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminDashboard.class.getName());
    private String currentUsername;

    public AdminDashboard(String username) {
        this.currentUsername = username;
        initComponents();
        setTitle("Admin Dashboard - " + currentUsername);
        
        label_currentuser.setText("Welcome, " + currentUsername);
        
        jBlogout.addActionListener(e -> {
            int result = javax.swing.JOptionPane.showConfirmDialog(
            this,
                    "Are you sure you want to logout?",
                    "Confirm Logout",
                    javax.swing.JOptionPane.YES_NO_OPTION,
                    javax.swing.JOptionPane.QUESTION_MESSAGE
            );
            if (result == javax.swing.JOptionPane.YES_OPTION) {
                Login newLogin = new Login();
                newLogin.setVisible(true);
                newLogin.setLocationRelativeTo(null);
                this.dispose();
            }
        });
        
        jBsearch.addActionListener(e -> searchUsers());
        
        jTFsearch.addActionListener(e -> searchUsers());
        
        jCBrole.addActionListener(e -> searchUsers());
        
        startClock();
        
        updateDashboardCounts();
        
        searchUsers();
        
    }
        private void startClock() {
               String pattern = "EEEE, MMMM dd, yyyy hh:mm:ss a";
               SimpleDateFormat sdf = new SimpleDateFormat(pattern);
               label_timedate.setText(sdf.format(new Date()));

               Timer timer = new Timer(1000,e -> {
                   label_timedate.setText(sdf.format(new Date()));
            });
            timer.start();
    }
        
        private void updateDashboardCounts() {
            label_count.setText(getUserCount("users"));
            label_countemployers.setText(getRoleCount("Employer"));
            label_countemployees.setText(getRoleCount("Employee"));
            label_countemployees1.setText(getActiveUserCount());
        }
        
        private String getUserCount(String table) {
            int count = 0;
            try (Connection conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/java_user_database", "root", "")) {
                String sql = "SELECT COUNT(*) FROM " + table;
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            } catch (Exception e) {
                count = 0;
            }
            return String.valueOf(count);
        }
        
        private String getRoleCount(String role) {
            int count = 0;
            try (Connection conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/java_user_database", "root", "")) {
                String sql = "SELECT COUNT(*) FROM users WHERE user_role = ? ";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, role);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            } catch (Exception e) {
                count = 0;
            }
            return String.valueOf(count);
        }
        
        private String getActiveUserCount() {
            int count = 0;
            try (Connection conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/java_user_database", "root", "")) {
                String sql = "SELECT COUNT(*) FROM users WHERE active = 1 ";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            } catch (Exception e) {
                count = 0;
            }
            return String.valueOf(count);
        }
        
        private void searchUsers() {
            String keyword = jTFsearch.getText().trim();
            String selectedRole = jCBrole.getSelectedItem().toString();
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            try (java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:MySQL://localhost:3306/java_user_database", "root", "")) {
                String sql = "SELECT id, username, full_name, user_role, registration_date FROM users WHERE (username LIKE ? OR full_name LIKE ?) AND user_role = ?";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, "%" + keyword + "%");
                stmt.setString(2, "%" + keyword + "%");
                stmt.setString(3, selectedRole); 
                
                java.sql.ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("full_name"),
                        rs.getString("user_role"),
                        rs.getString("registration_date")
                    };
                    model.addRow(row);
                }
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Search failed: " + e.getMessage());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        label_dashboard = new javax.swing.JLabel();
        label_timedate = new javax.swing.JLabel();
        label_currentuser = new javax.swing.JLabel();
        jBlogout = new javax.swing.JButton();
        jPcards = new javax.swing.JPanel();
        jPtotalusers = new javax.swing.JPanel();
        label_totalusers = new javax.swing.JLabel();
        label_count = new javax.swing.JLabel();
        jPemployers = new javax.swing.JPanel();
        label_countemployers = new javax.swing.JLabel();
        label_totalemployers = new javax.swing.JLabel();
        jPemployees = new javax.swing.JPanel();
        label_totalemployees = new javax.swing.JLabel();
        label_countemployees = new javax.swing.JLabel();
        jPactiveusers = new javax.swing.JPanel();
        label_totalemployees1 = new javax.swing.JLabel();
        label_countemployees1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTFsearch = new javax.swing.JTextField();
        label_search = new javax.swing.JLabel();
        label_role = new javax.swing.JLabel();
        jCBrole = new javax.swing.JComboBox<>();
        jBsearch = new javax.swing.JButton();
        label_usertable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 860));
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(860, 860));

        jPanel1.setBackground(new java.awt.Color(12, 21, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 860));

        label_dashboard.setFont(new java.awt.Font("Helvetica Neue", 3, 48)); // NOI18N
        label_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        label_dashboard.setText("Admin Dashboard");

        label_timedate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_timedate.setForeground(new java.awt.Color(255, 255, 255));
        label_timedate.setText("Time");

        label_currentuser.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_currentuser.setForeground(new java.awt.Color(255, 255, 255));
        label_currentuser.setText("Welcome, current_user");

        jBlogout.setText("Logout");

        jPtotalusers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_totalusers.setText("Total Users");

        label_count.setText("0");

        javax.swing.GroupLayout jPtotalusersLayout = new javax.swing.GroupLayout(jPtotalusers);
        jPtotalusers.setLayout(jPtotalusersLayout);
        jPtotalusersLayout.setHorizontalGroup(
            jPtotalusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtotalusersLayout.createSequentialGroup()
                .addGroup(jPtotalusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPtotalusersLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(label_totalusers))
                    .addGroup(jPtotalusersLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label_count)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPtotalusersLayout.setVerticalGroup(
            jPtotalusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPtotalusersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_totalusers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_count)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPemployers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_countemployers.setText("0");

        label_totalemployers.setText("Total Employers");

        javax.swing.GroupLayout jPemployersLayout = new javax.swing.GroupLayout(jPemployers);
        jPemployers.setLayout(jPemployersLayout);
        jPemployersLayout.setHorizontalGroup(
            jPemployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPemployersLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPemployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPemployersLayout.createSequentialGroup()
                        .addComponent(label_countemployers)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPemployersLayout.createSequentialGroup()
                        .addComponent(label_totalemployers)
                        .addGap(80, 80, 80))))
        );
        jPemployersLayout.setVerticalGroup(
            jPemployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPemployersLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_totalemployers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_countemployers)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPemployees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_totalemployees.setText("Total Employees");

        label_countemployees.setText("0");

        javax.swing.GroupLayout jPemployeesLayout = new javax.swing.GroupLayout(jPemployees);
        jPemployees.setLayout(jPemployeesLayout);
        jPemployeesLayout.setHorizontalGroup(
            jPemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPemployeesLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPemployeesLayout.createSequentialGroup()
                        .addComponent(label_totalemployees)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPemployeesLayout.createSequentialGroup()
                        .addComponent(label_countemployees)
                        .addGap(115, 115, 115))))
        );
        jPemployeesLayout.setVerticalGroup(
            jPemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPemployeesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_totalemployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_countemployees)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPactiveusers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_totalemployees1.setText("Active Users");

        label_countemployees1.setText("0");

        javax.swing.GroupLayout jPactiveusersLayout = new javax.swing.GroupLayout(jPactiveusers);
        jPactiveusers.setLayout(jPactiveusersLayout);
        jPactiveusersLayout.setHorizontalGroup(
            jPactiveusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPactiveusersLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPactiveusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPactiveusersLayout.createSequentialGroup()
                        .addComponent(label_totalemployees1)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPactiveusersLayout.createSequentialGroup()
                        .addComponent(label_countemployees1)
                        .addGap(108, 108, 108))))
        );
        jPactiveusersLayout.setVerticalGroup(
            jPactiveusersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPactiveusersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_totalemployees1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_countemployees1)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPcardsLayout = new javax.swing.GroupLayout(jPcards);
        jPcards.setLayout(jPcardsLayout);
        jPcardsLayout.setHorizontalGroup(
            jPcardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcardsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPtotalusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPemployers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPemployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPactiveusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPcardsLayout.setVerticalGroup(
            jPcardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcardsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPactiveusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPemployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPtotalusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPemployers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label_search.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_search.setForeground(new java.awt.Color(255, 255, 255));
        label_search.setText("Search:");

        label_role.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_role.setForeground(new java.awt.Color(255, 255, 255));
        label_role.setText("Role:");

        jCBrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer", "Employee" }));

        jBsearch.setText("Search");

        label_usertable.setForeground(new java.awt.Color(255, 255, 255));
        label_usertable.setText("Users Table");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Name", "Role", "Registration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(label_timedate)
                        .addGap(153, 153, 153)
                        .addComponent(label_currentuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBlogout)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jPcards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(label_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_role)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBsearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(552, 552, 552)
                                .addComponent(label_usertable)))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_timedate)
                    .addComponent(label_currentuser)
                    .addComponent(jBlogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPcards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFsearch)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_search)
                        .addComponent(label_role)
                        .addComponent(jCBrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBsearch)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_usertable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
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
        java.awt.EventQueue.invokeLater(() -> new AdminDashboard("test_user").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlogout;
    private javax.swing.JButton jBsearch;
    private javax.swing.JComboBox<String> jCBrole;
    private javax.swing.JPanel jPactiveusers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPcards;
    private javax.swing.JPanel jPemployees;
    private javax.swing.JPanel jPemployers;
    private javax.swing.JPanel jPtotalusers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFsearch;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_count;
    private javax.swing.JLabel label_countemployees;
    private javax.swing.JLabel label_countemployees1;
    private javax.swing.JLabel label_countemployers;
    private javax.swing.JLabel label_currentuser;
    private javax.swing.JLabel label_dashboard;
    private javax.swing.JLabel label_role;
    private javax.swing.JLabel label_search;
    private javax.swing.JLabel label_timedate;
    private javax.swing.JLabel label_totalemployees;
    private javax.swing.JLabel label_totalemployees1;
    private javax.swing.JLabel label_totalemployers;
    private javax.swing.JLabel label_totalusers;
    private javax.swing.JLabel label_usertable;
    // End of variables declaration//GEN-END:variables
}
