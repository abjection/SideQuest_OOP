package sidequest;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    public HomePanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(40, 40, 40));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        
        //Example Listings
        add(new ListingCard("Car Wash", "Help needed to wash my car. Pays P500.", "Available"));
        add(Box.createVerticalStrut(10));
        add(new ListingCard("Dog Walking", "Walk my dog around the block for 30 minutes.", "Available"));
        add(Box.createVerticalStrut(10));
        add(new ListingCard("Grocery Shopping", "Pick up groceries from the nearby store.", "Available"));
        add(Box.createVerticalStrut(10));
        add(new ListingCard("Lawn Mowing", "Mow the front and back lawn.", "Available"));
        add(Box.createVerticalGlue());
    }
}