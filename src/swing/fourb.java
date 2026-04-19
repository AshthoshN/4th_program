package swing;

/*
4b. Develop a Swing program in Java to display a message 
“Srilanka is pressed” or “India is pressed” depending upon the JButton 
either Srilanka or India is pressed using addActionListener()
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fourb {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Event");

        // Create buttons
        JButton btn1 = new JButton("Srilanka");
        JButton btn2 = new JButton("India");

        // Label to display message
        JLabel label = new JLabel("Press a button");
        label.setHorizontalAlignment(JLabel.CENTER);

        // Action for Srilanka button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Action for India button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Layout
        frame.setLayout(new FlowLayout());
        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}