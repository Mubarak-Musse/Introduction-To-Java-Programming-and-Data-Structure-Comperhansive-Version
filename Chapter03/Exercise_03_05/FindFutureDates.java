
/*Exercise 3.5 ( Find Future dates)
 * Write a program that prompts the user toenter an integer for today's 
 * day of the week (Sunday is 0 , Monday is 1 , ..., Saturday is 6)
 * also prompt the user to enter the number of days after today for a future
 * day and display the future day of the week
 *
 * **/

import java.util.Scanner; 

public class FindFutureDates { 

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		System.out.print("Enter the number of days elapsed since today:");
		int daysElapsed = input.nextInt();


		int futureDay = (day + daysElapsed) % 7;

		System.out.println("Today is:");

		switch (day) {

			case 0: System.out.println("Sunday!"); break;
			case 1: System.out.println("Monday!"); break;
			case 2: System.out.println("Tuesday!"); break;
			case 3: System.out.println("Wensday!"); break;
			case 4: System.out.println("Thuresday!"); break;
			case 5: System.out.println("Friday!"); break;
			case 6: System.out.println("Saterday!"); break; 
			case 7: System.out.println("Sunday!");

		}
		
		System.out.print(" and the future day is ");
		switch (futureDay)
		{
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday");
		}
	}
}




