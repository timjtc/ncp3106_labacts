package com.uecpe20231122784.labact7;
import javax.swing.JOptionPane;

public class ex18_ProtectedDemo {
    public static void main(String[] args) {
        String input;        // To hold input
        int questions;       // Number of questions
        int missed;          // Number of questions missed
        // Get the number of questions on the exam.
        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        questions = Integer.parseInt(input);
        // Get the number of questions the student missed.
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);
        // Create a FinalExam object.
        ex17_FinalExam2 exam = new ex17_FinalExam2(questions, missed);
        // Display the test results.
        JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() +
        " points.\nThe exam score is " + exam.getScore() + "\nThe exam grade is " +
        exam.getGrade());
        System.exit(0);
    }
}

