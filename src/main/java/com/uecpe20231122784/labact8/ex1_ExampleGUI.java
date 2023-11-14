package com.uecpe20231122784.labact8;
import javax.swing.*; 

/** 

 * @author Joan Lazaro 

 */ 

public class ex1_ExampleGUI { 

    /** 

     * @param args the command line arguments 

     */ 

    public static void main(String[] args) { 

        // TODO code application logic here 

        final int WINDOW_WIDTH = 350;   // Window width in pixels 

        final int WINDOW_HEIGHT = 250;  // Window height in pixels 

        // Create a window. 

        JFrame window = new JFrame(); 

        // Set the title. 

        window.setTitle("A Simple Window"); 

        // Set the size of the window. 

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 

        // Specify what happens when the close button is clicked. 

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Display the window. 

        window.setVisible(true); 

    } 

} 