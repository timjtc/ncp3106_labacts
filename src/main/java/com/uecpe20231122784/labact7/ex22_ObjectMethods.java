package com.uecpe20231122784.labact7;

public class ex22_ObjectMethods {
    public static void main(String[] args) {
       // Create two objects.
       ex20_PassFailExam exam1 = new ex20_PassFailExam(0, 0, 0);
       ex20_PassFailExam exam2 = new ex20_PassFailExam(0, 0, 0);
       // Send the objects to println, which
       // will call the toString method.
       System.out.println(exam1);
       System.out.println(exam2);
       // Test the equals method.
       if (exam1.equals(exam2)) {
          System.out.println("They are the same.");
       } else {
          System.out.println("They are not the same.");
       }
    }
}

