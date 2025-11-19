


/*Write a program that evalute if this is a leap year
 * using the condtional statment**/

import java.util.Scanner;

public class LeapYear {

	public static void main (String[] args) {

		// Scanner
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a year! ");
       int year = input.nextInt();



       if (year % 4 == 0) {

           if (year % 100 == 0){

               if (year % 400 == 0){

                   System.out.print("Leap Year");
               }
               else {
                   System.out.print("Not Leap Year");
               }

           }else {
               System.out.print("Leap Year");
           }
       } 
       else {
                System.out.print("Not Leap Year! ");
         }    
    }

}
