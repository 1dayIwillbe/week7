/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales Commission
 * Sales amount    >= 50,000 35%
 * Sales amount    >= 30,000 20%
 * Sales amount    >= 20,000 10%
 * Sales amount    >= 10,000 5%
 * Sales amount    < 10,000 2%
 */

import java.util.Scanner;

public class Prg7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int sID = scan.nextInt();
        System.out.print("Enter Seller's First name: ");  //First Name
        String FName = scan.next();
        System.out.print("Enter Seller's Last name: ");   //Last Name
        String LName = scan.next();
        System.out.print("Enter Sales amount: ");         //Sales Amount
        double SAmount = scan.nextDouble();
        System.out.print("Enter basic salary: ");         //Basic Salary
        double salary = scan.nextDouble();
        //
        double commission;
        //Calculate Commission
        if (SAmount >= 50000) {
            commission = 35;
        } else if (SAmount < 50000 && SAmount >= 30000) {
            commission = 20;
        } else if (SAmount <30000 && SAmount >= 20000) {
            commission = 10;
        } else if (SAmount < 20000 && SAmount >= 10000) {
            commission = 5;
        } else {
            commission = 2;
        }
        double CAmount = (commission / 100) * SAmount;
        System.out.println("Commission percentage    : "+commission +"%");
        System.out.println("Total Commission         : "+CAmount);
        System.out.println("Total (Salary +Commission:" +(CAmount+salary));
        scan.close();
    }
}


