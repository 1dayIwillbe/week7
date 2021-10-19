/**
 * Write a Java program to test if an array contains a specific value
 */

import java.util.Scanner;

public class Prg20 {
    static int item;
    //Checking if value is in database;
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                System.out.println("Number is in Database");
                return true;
            }
        }
        System.out.println("Number not in database");
        return false;
    }

    //main method and manual entry to array
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println("Array Contain Following Values: 1789, 2035, 1899, 1456, 2013,\n" +
                "                                    1458, 2458, 1254, 1472, 2365,\n" +
                "                                    1456, 2265, 1457, 2456 ");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the value you want to find out. :");
        item = reader.nextInt();
        System.out.println(contains(my_array1,item));


    }
}


