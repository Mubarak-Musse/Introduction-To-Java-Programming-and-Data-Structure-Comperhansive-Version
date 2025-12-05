

/* Write a program that evaluate 2 numbers that and show the highest values 
 * considere asking user for input  */

public class TextMax { 
	/** Main Metho */
	public static void main (String[] args) {

		int i = 5 ; 
		int j = 2 ; 
		int k = max(i, j);
		
		System.out.println("ThE maximum of  " + i + 
		" and " + j + " is " + k);
	}

	/** Return the max of Two numbers */
	public static int max(int num1 , int num2) { 
		
		int result;
		
		if(num1 > num2){
			result = num1;
		}else {
			result = num2;
		}
		return result; 
	}
}
