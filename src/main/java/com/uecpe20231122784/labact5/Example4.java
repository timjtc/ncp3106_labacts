package com.uecpe20231122784.labact5;

import javax.swing.JOptionPane; 

/** 

* @author Joan P. Lazaro 

*/ 

// labact5_program4
public class Example4 { 

    public static void main(String[] args) { 

        double number;       // To hold a number 

        double totalArea;    // The total area  

        String input;        // To hold user input 

        // Create three Rectangle objects. 

        Ex2_Rectangle kitchen = new Ex2_Rectangle(); 

        Ex2_Rectangle bedroom = new Ex2_Rectangle(); 

        Ex2_Rectangle den = new Ex2_Rectangle(); 

        // Get and store the dimensions of the kitchen. 

        input = JOptionPane.showInputDialog("What is the kitchen's length?"); 

        number = Double.parseDouble(input); 

        kitchen.setLength(number); 

        input = JOptionPane.showInputDialog("What is the kitchen's width?"); 

        number = Double.parseDouble(input); 

        kitchen.setWidth(number); 

        // Get and store the dimensions of the bedroom. 

        input = JOptionPane.showInputDialog("What is the bedroom's length?"); 

        number = Double.parseDouble(input); 

        bedroom.setLength(number); 

        input = JOptionPane.showInputDialog("What is the bedroom's width?"); 

        number = Double.parseDouble(input); 

        bedroom.setWidth(number); 

        // Get and store the dimensions of the garden. 

        input = JOptionPane.showInputDialog("What is the garden's length?"); 

        number = Double.parseDouble(input); 

        den.setLength(number); 

        input = JOptionPane.showInputDialog("What is the garden's width?"); 

        number = Double.parseDouble(input); 

        den.setWidth(number); 

        // Calculate the total area of the rooms. 

        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea(); 

        // Display the total area of the rooms. 

        JOptionPane.showMessageDialog(null, "The total area of the rooms is " + totalArea); 

    } 

} 