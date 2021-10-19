import java.util.Scanner;

public class Prg2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //user input using scanner
        System.out.println("Enter any Year:");
        int year = scan.nextInt(); // input saved in year variable
        scan.close();
        boolean isLeap = false;
/**
 * To determine whether a year is a leap year, follow these steps:
 * 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
 * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
 * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
 * 4. The year is a leap year (it has 366 days).
 * 5. The year is not a leap year (it has 365 days). Source of these steps.
 */
        if(year % 4 == 0 )  //If the year is evenly divisible by 4 then it's a leap year
        {
            if( year % 100 == 0) //If the year is evenly divisible by 100 then it's not leap year
            {
                if ( year % 400 == 0) //If the year is evenly divisible by 400 then it's a leap year
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true) //Display Result to user
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }


}

