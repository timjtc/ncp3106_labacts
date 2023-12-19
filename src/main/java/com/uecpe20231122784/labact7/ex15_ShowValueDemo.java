package com.uecpe20231122784.labact7;

public class ex15_ShowValueDemo {         
    public static void main(String[] args) {
        // Create a SubClass3 object.
        ex14_SubClass3 myObject = new ex14_SubClass3();
        myObject.showValue(10);          // Pass an int.
        myObject.showValue(1.2);         // Pass a double.
        myObject.showValue("Hello");     // Pass a String.
    }
}

