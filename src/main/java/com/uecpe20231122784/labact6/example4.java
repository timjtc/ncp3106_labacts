package com.uecpe20231122784.labact6;

public class example4 {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int index = 0; index < 12; index++) {
           System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
        }
    }
}
