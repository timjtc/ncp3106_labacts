package com.uecpe20231122784.labact4;

public class labact4_program10 {
    public static void main(String[] args) {
        String customerName;
        customerName = fullName("John", "Martin");
        System.out.println(customerName);
    }
    /**
    The fullName method accepts two String arguments
    containing a first and last name. It concatenates
    them into a single String object.
    @param first The first name.
    @param last The last name.
    @return A reference to a String object containing
    the first and last names.
    */
    public static String fullName(String first, String last) {
        String name;
        name = first + " " + last;
        return name;
    }

}
