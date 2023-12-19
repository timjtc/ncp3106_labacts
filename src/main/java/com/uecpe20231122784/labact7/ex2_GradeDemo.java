package com.uecpe20231122784.labact7;

import javax.swing.JOptionPane;

public class ex2_GradeDemo {
    public static void main(String[] args) {
        String input;        // To hold input
        double testScore;    // A test score
        // Create a GradedActivity object.
        ex1_GradedActivity grade = new ex1_GradedActivity();
        // Get a test score.
        input = JOptionPane.showInputDialog("Enter  a numeric test score.");
        testScore = Double.parseDouble(input);
        // Store the score in the grade object.
        grade.setScore(testScore);
        // Display the letter grade for the score.
        JOptionPane.showMessageDialog(null, "The grade for that test is " + grade.getGrade());
        System.exit(0);
    }
 }
