package com.uecpe20231122784.labact7;

public class ex26_CompSciStudentDemo {
    public static void main(String[] args) {
        // Create a CompSciStudent object.
        ex25_CompSciStudent csStudent = new ex25_CompSciStudent("Jennifer Haynes", "167W98337", 2015);
        // Store values for math, CS, and gen ed hours.
        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);
        // Display the student's data.
        System.out.println(csStudent);
        // Display the number of remaining hours.
        System.out.println("Hours remaining: " + csStudent.getRemainingHours());
    }
}

