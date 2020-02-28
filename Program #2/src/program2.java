// Name: Program #2
// Author: Tyler Phelps
// Date: Feb 14, 2020
// Version: 1.0
// Git User: typhelps2

	import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start Scanner
		Scanner keyboard = new Scanner (System.in);
				
		// Declare Variables		
		String firstName;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		
		// Collect User Input
		System.out.print("What is your name? ");
		firstName = keyboard.next();
		System.out.print("What is your first number? ");
		firstNumber = keyboard.nextInt();
		System.out.print("What is your second number? ");
		secondNumber = keyboard.nextInt();
		System.out.print("What is your third number? ");
		thirdNumber = keyboard.nextInt();
		
		
		
		
		// Close the keyboard
		keyboard.close(); 
		
		
		
		// Output results
		System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + (firstNumber + secondNumber + thirdNumber));
		System.out.println("Thank you for your input " + firstName);		
				
	}

}
