


/*Exercise 3.7 ( Financial Application )
 * Modify listing 2.10 Compute Change java
 * Display the nonzero denomination only , using singular words for single unit
 * such as 1 dollar and 1 penny , and plural words for more than one unit such as 
 * 2 dollars and 3 pennies 
 * **/

import java.util.Scanner; 

public class FinancialApplication {

	public static void main (String [] args) {

		// Scanner objects
		Scanner input = new Scanner(System.in);

		//prompt user to the amount 
		System.out.print("Enter an amount in double," +
		"example 11.56");
		double amount = input.nextDouble();

		double remainingAmount = (amount * 100 );
		
		//Find the number of one dollars 
		double numberOfOneDollars = remainingAmount / 100
