package com.uecpe20231122784.labact7;

import java.util.Scanner;
/**
    This program demonstrates the CurvedActivity class,
    which inherits from the GradedActivity class.
*/
public class ex12_CurvedActivityDemo {
    public static void main(String[] args) {
        double score;               // Raw score
        double curvePercent;        // Curve percentage
        // Create a Scanner object to read keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the unadjusted exam score.
        System.out.print("Enter the student's raw numeric score: ");
        score = keyboard.nextDouble();
        // Get the curve percentage.
        System.out.print("Enter the curve percentage: ");
        curvePercent = keyboard.nextDouble();
        // Create a CurvedActivity object.
        ex11_CurvedActivity curvedExam = new ex11_CurvedActivity(curvePercent);
        // Set the exam score.
        curvedExam.setScore(score);
        // Display the raw score.
        System.out.println("The raw score is " + curvedExam.getRawScore() + 
" points.");
        // Display the curved score.
        System.out.println("The curved score is " + curvedExam.getScore());
        // Display the exam grade.
        System.out.println("The exam grade is " + curvedExam.getGrade());
    }
}

