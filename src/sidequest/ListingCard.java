package sidequest;

import javax.swing.*;
import java.awt.*;

public class ListingCard extends JPanel {
    public ListingCard(String title, String description, String status) {
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));
        setLayout(new BorderLayout(10, 10));
        setBackground(Color.WHITE);
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel descLabel = new JLabel("<html>" + description + "</html>");
        JLabel statusLabel = new JLabel(status);
        statusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        add(titleLabel, BorderLayout.NORTH);
        add(descLabel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        
        setMaximumSize(new Dimension(600,100));
    }
}
