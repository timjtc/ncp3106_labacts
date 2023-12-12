package com.uecpe20231122784.labact8;

import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface
public class ex8_ExampleGUI extends JFrame
{
    private final JButton button1;    
    private final JButton button2;    
    private final JButton button3;   
    private final JPanel panel;     
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 70;
        /**
         Constructor
    */
    public ex8_ExampleGUI()
    {
        setTitle("Event Object Demonstration");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());
        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        add(panel);
        setVisible(true);
    }
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {       
            if (e.getSource() == button1)
                JOptionPane.showMessageDialog(null, "You clicked the first button.");
            else if (e.getSource() == button2)
                JOptionPane.showMessageDialog(null, "You clicked the second button.");
            else if (e.getSource() == button3)
                JOptionPane.showMessageDialog(null, "You clicked the third button.");
        }
    }
    /**
        main method
        @param args
    */
    public static void main(String[] args)
    {
        ex8_ExampleGUI ex = new ex8_ExampleGUI();
    }
 }

