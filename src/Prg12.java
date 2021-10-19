/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;
public class Prg12 {

    //Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //user input character
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        //Checking input type using if statement
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");
        } else {
            System.out.println(ch + " is A SYMBOL.");
        }
        scanner.close();
    }
}