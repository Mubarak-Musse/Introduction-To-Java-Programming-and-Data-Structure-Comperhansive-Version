

/*Find radix of a number given in a string 
 * Question form learn java programming - Beginner to master
 * **/

import java.util.Scanner;

public class RadixNumber { 

	public static void main (String[] args) { 

		Scanner input = new Scanner(System.in);

		//prompt user to Enter a string value
		System.out.print("Please Enter a value of at least 5 digit!");
		String userInput = input.nextLine();

		int minLength = 5 ;
		
		//check the radix value 
		System.out.print(" The radix value");
		if (userInput.length() >= minLength ) {
			if (userInput.matches("[01]+"))
			{
				System.out.println(" Binary Radix=2 ");
			}
			else if (userInput.matches("[0-7]+")) {
				
				System.out.println("Octal Radix=8");
			}
			else if (userInput.matches("[0-9]+")) {

				System.out.println ("Decimal Radix=8");
			}
			else if (userInput.matches("[0-9A-F]+")) {

				System.out.println("Hexa Radix=16");
			}
			else 
		{
				System.out.println("Invalid input");
			} 
		}
		else
		{ 

			System.out.println("Error: the entered vaue is too short");
		}

	}

}

