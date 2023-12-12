package com.uecpe20231122784.labact6;

public class example12 {
    public static void main(String[] args) {
        double[] values;
        values = getArray();
        for (double num : values)
           System.out.print(num + " ");
    }
    /**
        getArray method
        @return A reference to an array of doubles.
    */
    public static double[] getArray() {
        double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };
        return array;
    }

}
