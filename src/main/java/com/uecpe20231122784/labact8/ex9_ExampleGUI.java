package com.uecpe20231122784.labact8;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for FlowLayout class
public class ex9_ExampleGUI extends JFrame
{
    private final int WINDOW_WIDTH = 200;  // Window width
    private final int WINDOW_HEIGHT = 105; // Window height
    /**
       Constructor
    */
    public ex9_ExampleGUI()
    {
        setTitle("Flow Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        add(button1);
        add(button2);
        add(button3);
        setVisible(true);
    }
    /**
    * @param args
    */
    public static void main(String[] args)
    {
        ex9_ExampleGUI ex = new ex9_ExampleGUI();
    }
 }

