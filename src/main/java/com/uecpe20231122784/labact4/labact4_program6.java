package com.uecpe20231122784.labact4;

public class labact4_program6 {
    public static void main() {
        int number = 99; // number starts with 99
        // Display the value in number.
        System.out.println("number is " + number);
        // Call changeMe, passing the value in number as an argument.
        changeMe(number);
        // Display the value in number again.
        System.out.println("number is " + number);
    }
    /**
    The changeMe method accepts an argument and then 
    changes the value of the parameter.
    */
    public static void changeMe(int myValue) {
        System.out.println("I am changing the value.");
        // Change the myValue parameter variable to 0.
        myValue = 0;
        // Display the value in myValue.
        System.out.println("Now the value is " + myValue);
    }

}
