package sidequest;

public class SideQuest {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login LoginFrame = new Login();
                LoginFrame.setLocationRelativeTo(null);
                LoginFrame.setVisible(true);
            }
        });
    }
}