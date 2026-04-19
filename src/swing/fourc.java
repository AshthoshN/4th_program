package swing;

/*
4c. Develop a Swing program in Java to display a message 
“Digital Clock is pressed” or “Hour Glass is pressed” 
depending upon the JButton with image either Digital Clock or Hour Glass 
is pressed by implementing the event handling mechanism with addActionListener()
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fourc {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Event");

        // Load original images
        ImageIcon clockIcon = new ImageIcon(fourc.class.getResource("clock.png"));
        ImageIcon hourglassIcon = new ImageIcon(fourc.class.getResource("hourglass.png"));

        // Resize images (width = 80, height = 80)
        Image clockImg = clockIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        Image hourglassImg = hourglassIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);

        // Convert back to ImageIcon
        ImageIcon scaledClockIcon = new ImageIcon(clockImg);
        ImageIcon scaledHourglassIcon = new ImageIcon(hourglassImg);

        // Create buttons with scaled images
        JButton btnClock = new JButton("Digital Clock", scaledClockIcon);
        JButton btnHourGlass = new JButton("Hour Glass", scaledHourglassIcon);

        // Adjust text position
        btnClock.setHorizontalTextPosition(JButton.CENTER);
        btnClock.setVerticalTextPosition(JButton.BOTTOM);

        btnHourGlass.setHorizontalTextPosition(JButton.CENTER);
        btnHourGlass.setVerticalTextPosition(JButton.BOTTOM);

        // Label to display result
        JLabel label = new JLabel("Press a button");
        label.setHorizontalAlignment(JLabel.CENTER);

        // Event handling
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Layout
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}