package swing;

/*
4a. Basic hello program of Swing displaying the message 
"Hello! VI C, Welcome to Swing Programming" 
in Blue color plain font with font size of 32 using JFrame and JLabel
*/

import javax.swing.*;
import java.awt.*;

public class foura {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Swing Hello");

        // Create JLabel with message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        // Set font (Plain, size 32)
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to Blue
        label.setForeground(Color.BLUE);

        // Center the text
        label.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        frame.add(label);

        // Frame settings
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
