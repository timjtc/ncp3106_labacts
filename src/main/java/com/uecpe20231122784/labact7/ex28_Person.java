package com.uecpe20231122784.labact7;

public class ex28_Person implements ex27_Displayable {
    private String name;
    // Constructor
    public ex28_Person(String n) {
       name = n;
    }
    // display method
    public void display() {
       System.out.println("My name is " + name);
    }
}

