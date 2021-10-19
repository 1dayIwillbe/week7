/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Prg17 {
    public static void main(String[] args) {
        //manual input of values in array1 and array2
        int[] my_array1 = {
                1798, 2335, 1699, 1456, 2013,
                1358, 2658, 1354, 1472, 4365,
                1256, 2165, 1457, 3456};

        String[] my_array2 = {
                "Scrum",
                "Postman",
                "Java",
                "Selenium",
                "Gherkin",
                "Jira"
        };

        //Arrays to short in order

        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));

    }
}

