/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * |        Salary Slip           |
 * |______________________________|
 * | Employee Id : 2564           |
 * | Employee Name : Jay          |
 * |______________________________|
 * | Basic Salary : 25000.0       |
 * | HRA 10% : 2500.0             |
 * | TA 8% : 2250.0               |
 * | DA 9% : 2000.0               |
 * | PF - 20& : 5000.0            |
 * |______________________________|
 * | Gross Salary : 26750.0       |
 * |==============================|
 */

import java.util.Scanner;

public class Prg5 {
    //static float basicSal;
    public static void main(String[] args) //main method
    {
        //static area
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee ID  ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Employee name  ");
        String name=sc.nextLine();
        System.out.println("Employee basic salary  ");
        float basicSal=sc.nextInt();
        sc.close();
        finalSalary(id,name,basicSal);
    }

    static void finalSalary(int id,String name,float basicSal)//instance method
    {
        //logic to get basic salary of employee
        float har,ta,da,pf,gs;
        har=basicSal*10/100;
        ta=basicSal*9/100;
        da=basicSal*8/100;
        pf=basicSal*20/100;
        gs=(basicSal+har+ta+da)-pf;
        System.out.println("----------------------------");
        System.out.println("|     Salary Slip          |");
        System.out.println("|__________________________|");
        System.out.println("|Employee Id   :"+id+"     |");
        System.out.println("|Employee Name :"+name+"   |");
        System.out.println("|__________________________|");
        System.out.println("|Basic Salary  :"+basicSal+"|");
        System.out.println("|HAR 10%       :"+har+"     |");
        System.out.println("|TA  8%        :"+ta+"   |");
        System.out.println("|DA  9%        :"+da+"  |");
        System.out.println("|PF  20%       :"+pf+"  |");
        System.out.println("|___________________________|");
        System.out.println("|Gross Salary  :"+gs+" |");
        System.out.println("|===========================|");


    }

}