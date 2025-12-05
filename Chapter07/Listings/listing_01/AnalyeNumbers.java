

/*Case study ( AnalyzeNumbers ) 
 * write a program that using array to solve the problem of reading 
 * 100 number , get the average */


import java.util.Scanner; 

public class AnalyeNumbers {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		double [] numbers = new double[];
		double sum = 0;

		System.out.print("Enter the numbers: ");

		for ( int i = 0 ; i < n; i++) { 
			number[i] = input.nextDouble();
			sum += numbers[i];
		}

		double average = sum / n;

		int count = 0;

		for(int i = 0; i < n; i++) {
			if (numbers[] average) { 
				count++;
			}
		}
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above teh average is " + count);
	}
}

