
/*Write a program that prompt the user to enter
 * a new number unitll its the correct value 
 *  Usning While loop
 */
import java.util.Scanner; 

public class RepeatAdditionQuiz {

	public static void main (String[] args) {
	  //Intialising a random value using Randommethd 
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		Scanner scanner = new Scanner(System.in);

		System.out.print("What is: " + number1 
		+ " + " + number2 + "? ");
		int answer = scanner.nextInt();

		while(number1 + number2 != answer) 
		{ 
			System.out.print("Wrong Answer."
			+ "Try Again. what is" + number1 + " + " + number2 + "? ");
			answer = scanner.nextInt();
		}

		System.out.println("That's Correct!!");
	}
}

