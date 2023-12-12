package com.uecpe20231122784.labact8;
import javax.swing.*; 

public class ex3_ExampleGUI extends JFrame 

{ 

    final int WINDOW_WIDTH = 350; 

    final int WINDOW_HEIGHT = 250;    

    /** 

       Constructor 

    */ 

    public ex3_ExampleGUI() 

    { 

       setTitle("A Simple Window"); 

       setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

       setVisible(true); 

    } 

    public static void main(String[] args) 

    { 

       ex3_ExampleGUI em = new ex3_ExampleGUI(); 

    } 

}  