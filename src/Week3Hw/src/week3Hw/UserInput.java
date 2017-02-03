package week3Hw;

import java.util.Scanner;

public class UserInput {
	public UserInput input = new UserInput();
	public static int getInputInt(Scanner input){
		while (!input.hasNextInt()) {
	        System.out.print("That's not an integer, please enter an integer: ");
	        input.next();
	    }
		int myInt = input.nextInt();		
		return myInt;		
	}
	
}
