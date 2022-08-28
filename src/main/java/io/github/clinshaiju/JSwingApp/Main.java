package net.cvslinc.JSwingApp;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        final int[] clicks = {0};

        JFrame mainFrame = new JFrame("Click Counter");

        JTextField textField = new JTextField("Clicks: " + clicks[0]);
        textField.setBounds(50, 50, 100, 50);

        JButton clickMe = new JButton("Click Me!");
        clickMe.setBounds(130, 100, 100, 50);
        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks[0]++;
                textField.setText("Clicks: " + clicks[0]);

            }
        });

        mainFrame.add(clickMe);
        mainFrame.add(textField);

        mainFrame.setSize(500, 400);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

    }
}
