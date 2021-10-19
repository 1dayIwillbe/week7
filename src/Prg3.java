/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+
 */

import java.util.Scanner;

public class Prg3 {

    static Scanner scan = new Scanner(System.in);

    static char grade,Extra;
    static int Maths;
    static int Science;
    static int English;

    public static void main(String[] args) {  //User input using Scanner
        System.out.println("Enter Student's First Name here: ");
        String Name = scan.next();
        System.out.println("Enter Student RollNum: ");
        int RollNum = scan.nextInt();


        Prg3.reEnter(); // Calling method to enter user marks
        double Total = Maths + Science + English;
        System.out.println("Total marks out of 300 are: " + Total); //Total Marks to display
        double percentage = ((Total / 300) * 100); //Percentage to display
        System.out.println("Percentage: " + percentage);
        String result;  //result to display
        // Workout result to display
        if (Science < 35 || English < 35 || Maths < 35) {
            result = "Fail";
            grade = 'f';
        } else if (percentage >= 80) {
            result = "Pass";
            grade = 'A';
        } else if (percentage <= 79 && percentage >= 60) {
            result = "Pass";
            grade = 'A';
        } else if (percentage <= 59 && percentage >= 50) {
            result = "Pass";
            grade = 'B';
        } else if (percentage <= 49 && percentage >= 35) {
            result = "Pass";
            grade = 'C';
        } else {
            result = "FAIL";
        }

        System.out.println("|__________________________________________________|");
        System.out.println("|                                                  |");
        System.out.println("|                     Mark Sheet                   |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Name      :    " + Name + "             |");
        System.out.println("|          RoLlNum   :    " + RollNum + "          |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Subject   :          Marks              |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Maths     :     " + Maths + "           |");
        System.out.println("|          Science   :     " + Science + "         |");
        System.out.println("|          English   :     " + English + "         |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Total     :    " + Total + "            |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Percentage:    " + percentage + "       |");
        System.out.println("|          Result    :     " + result + "          |");
        System.out.println("|          Grade     :         " + grade + "       |");
        System.out.println("|__________________________________________________|");

        scan.close();
    }
    //Enter marks for subject
    static void reEnter() {
        System.out.println("Enter Maths Marks out of 100: ");
        Maths = scan.nextInt();
        validate(Maths);
        System.out.println("Enter Science Marks out of 100: ");
        Science = scan.nextInt();
        validate(Science);
        System.out.println("Enter English Marks out of 100: ");
        English = scan.nextInt();
        validate(English);

    }
    //Static method to revalidate marks if enter incorrectly.
    static void validate(int x) {
        if (x >= 0 && x <= 100) {
            System.out.println();
        } else {
            System.out.println("Please enter value for all Subject again (Range  between 1 and 100)");
            reEnter();
        }
    }

}


