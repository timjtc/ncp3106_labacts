package com.uecpe20231122784.labact8;

import javax.swing.*; // Needed for Swing classes
 public class ex4_ExampleGUI extends JFrame
 {
    private JPanel panel;                 // To reference a panel
    private JLabel messageLabel;          // To reference a label
    private JTextField kiloTextField;     // To reference a text field
    private JButton calcButton;           // To reference a button
    private final int WINDOW_WIDTH = 310; // Window width
    private final int WINDOW_HEIGHT = 100;// Window height
    /**
       Constructor
    */
    public ex4_ExampleGUI()
    {
       setTitle("Kilometer Converter");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       buildPanel();
       add(panel);
       setVisible(true);
    }
    private void buildPanel()
    {
       // Create a label to display instructions.
       messageLabel = new JLabel("Enter a distance in kilometers: ");
       // Create a text field 10 characters wide.
       kiloTextField = new JTextField(10);
       // Create a button with the caption "Calculate".
       calcButton = new JButton("Calculate");
       // Create a JPanel object and let the panel field reference it.
       panel = new JPanel();
       // Add the label, text field, and button components to the panel.
       panel.add(messageLabel);
       panel.add(kiloTextField);
       panel.add(calcButton);
    }
    /**
       main method
     * @param args
    */
    public static void main(String[] args)
    {
        ex4_ExampleGUI ex = new ex4_ExampleGUI();
    }
}
