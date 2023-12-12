package com.uecpe20231122784.labact8;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class
public class ex12_ExampleGUI extends JFrame
{
    private final int WINDOW_WIDTH = 400; 
    private final int WINDOW_HEIGHT = 200;
    /**
       Constructor
    */
    public ex12_ExampleGUI()
    {
        setTitle("Grid Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        add(button1);  // Goes into row 1, column 1
        add(button2);  // Goes into row 1, column 2
        add(button3);  // Goes into row 1, column 3
        add(button4);  // Goes into row 2, column 1
        add(button5);  // Goes into row 2, column 2
        add(button6);  // Goes into row 2, column 3
        setVisible(true);
    }
    public static void main(String[] args)
    {
        ex12_ExampleGUI ex = new ex12_ExampleGUI();
    }
 }
