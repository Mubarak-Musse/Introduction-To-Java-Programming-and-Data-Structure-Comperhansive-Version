



/*Exercise 3.6 Health application: BMI 
 * Write a program that calculate the user Body mass indux 
 * **/

import java.util.Scanner;

public class HealthApplication {

	public static void main(String[] args) {

		//Creating Scanner object 
		Scanner input = new Scanner(System.in);

		// Prompt User to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();



		// Prompt the User to enter height in inches 
		System.out.print("Enter Feets: ");
		double feet = input.nextDouble();
		System.out.print("Enter Inches: ");
		double inches = input.nextDouble();

		final double Kilogram_Per_Pound = 0.45359;
		final double Meters_Per_Inch = 0.0254;

		// Compute the BMI
		
		double height = feet * 12 + inches; 
		
		double weightInKilograms = weight * Kilogram_Per_Pound;
		double heightInMeters = height * Meters_Per_Inch;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		//Dispalay the result 
		System.out.println("BMI is: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Underweight !");
		} else if (bmi < 25 ) {
			System.out.println("Normal !");
		} else if (bmi < 30 ) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese!");
		}
	}
}
