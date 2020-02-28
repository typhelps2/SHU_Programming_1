// Name: Phelps Program 3
// Author: Tyler Phelps
// Date: Feb 21, 2020
// Version: 1.0
// Git User: typhelps2


import java.util.Scanner;

public class phelpsprogram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Variables
		Scanner keyboard = new Scanner(System.in);
		int number1; 
		String name;
		
		System.out.print("What is your name? ");
		name = keyboard.next();		
		
		do
		{		
		
			System.out.print("Please give me a number between 0 and 100: ");
			number1 = keyboard.nextInt();
		} while (number1 < 0 ||	number1 >100 );	
		
		System.out.println("Thank you for your input, " + name);
		
		
		
		for(int number2 = number1;number2 >= 0;number2--)
		{
			System.out.println("You have " +number2 + " chickens left.");
		}
		
						
	}

}
