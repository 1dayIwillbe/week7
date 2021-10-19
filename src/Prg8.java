/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Prg8 {
    //Main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Character between A to F :"); //User input valid alphabet
        char alfa = reader.nextLine().toLowerCase().charAt(0); //reader convert it lowercase
        // if loop to verify a letter match and result display
        if (alfa =='a') {
            System.out.println("Ahmedabad");
        } else if (alfa =='b') {
            System.out.println("Baroda");
        } else if (alfa =='c') {
            System.out.println("Calcutta");
        } else if (alfa =='d') {
            System.out.println("Dehradun");
        } else if (alfa =='e') {
            System.out.println("Elora");
        }else if (alfa =='f') {
            System.out.println("Faridabad");
        }else{ System.out.println("Please enter valid alphabet between a to f");
        }
        reader.close(); //Scanner close

    }
}

