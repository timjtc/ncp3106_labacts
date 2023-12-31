package com.uecpe20231122784.labact8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex15_ExampleGUI extends JFrame
{
    private final JLabel messageLabel;
    private final JCheckBox yellowCheckBox;
    private final JCheckBox redCheckBox;
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 100;   
    /**
       Constructor
    */
    public ex15_ExampleGUI()
    {
        setTitle("Color Check Boxes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageLabel = new JLabel("Select the checkboxes to change colors.");
        yellowCheckBox = new JCheckBox("Yellow background");
        redCheckBox = new JCheckBox("Red foreground");
        yellowCheckBox.addItemListener(new CheckBoxListener());
        redCheckBox.addItemListener(new CheckBoxListener());
        setLayout(new FlowLayout());
        add(messageLabel);
        add(yellowCheckBox);
        add(redCheckBox);
        setVisible(true);
    }
    private class CheckBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        { 
            if (e.getSource() == yellowCheckBox)
            {
                if (yellowCheckBox.isSelected())
                {
                   getContentPane().setBackground(Color.YELLOW);
                   yellowCheckBox.setBackground(Color.YELLOW);
                   redCheckBox.setBackground(Color.YELLOW);
                }
                else
                {
                   getContentPane().setBackground(Color.LIGHT_GRAY);
                   yellowCheckBox.setBackground(Color.LIGHT_GRAY);
                   redCheckBox.setBackground(Color.LIGHT_GRAY);
                }
             }
             else if (e.getSource() == redCheckBox)
             {
                if (redCheckBox.isSelected())
                {
                   messageLabel.setForeground(Color.RED);
                   yellowCheckBox.setForeground(Color.RED);
                   redCheckBox.setForeground(Color.RED);
                }
                else
                {
                   messageLabel.setForeground(Color.BLACK);
                   yellowCheckBox.setForeground(Color.BLACK);
                   redCheckBox.setForeground(Color.BLACK);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        ex15_ExampleGUI ex = new ex15_ExampleGUI();
    }
 }
