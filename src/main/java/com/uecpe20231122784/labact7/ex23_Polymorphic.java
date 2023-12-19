package com.uecpe20231122784.labact7;

public class ex23_Polymorphic {
    public static void main(String[] args) {
        // Create an array of GradedActivity references.
        ex1_GradedActivity[] tests = new ex1_GradedActivity[3];
        // The first test is a regular exam with a
        // numeric score of 75.
        tests[0] = new ex1_GradedActivity();
        tests[0].setScore(95);
        // The second test is a pass/fail test. The
        // student missed 5 out of 20 questions, and
        // the minimum passing grade is 60.
        tests[1] = new ex20_PassFailExam(20, 5, 60);
        // The third test is the final exam. There were
        // 50 questions and the student missed 7.
        tests[2] = new ex3_FinalExam(50, 7);
        // Display the grades.
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + "score " + 
            tests[i].getScore() + ", grade " + tests[i].getGrade());
        }
    }
}

