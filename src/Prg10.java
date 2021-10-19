/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  * /, *) find addition,
 * Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class Prg10 {

    //Main Method
    public static void main(String[] args) {
        //User input values and operator symbol
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter First Value:");
        int num1 = reader.nextInt();
        System.out.println("Enter Second Value:");
        int num2 = reader.nextInt();
        System.out.println("Enter any maths operators : *,+ ,- or /");
        char ch = reader.nextLine().charAt(0);

        // perform maths operation as per user requirements.
        if (ch == '+') {
            System.out.println("Addition of " + num1 + "+" + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Operator is not available");
        }

        reader.close();
    }
}
