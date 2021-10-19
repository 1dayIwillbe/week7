/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Prg1 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //user input number by Scanner

        System.out.print("Enter a number: ");
        int num = reader.nextInt(); // input stored in num variable

        String evenOdd = (num % 2 == 0) ? "even" : "odd"; //Checking odd or even using ternary operator ( ? : )

        System.out.println(num + " is " + evenOdd);// Result displayed
        reader.close();
    }

}
