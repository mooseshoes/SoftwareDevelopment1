//Joseph Gust 2/2/2017 Assignment 2.5
package hwWeek1;
import java.util.Scanner;

public class GratuityCalc {
	public static void main(String[] args) {
		//make a scanner object to receive user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number for the subtotal: ");
		
		//make sure the user gives us something that can work as a double
		while (!userInput.hasNextDouble()) {
	        System.out.println("That's not a number, please enter a number: ");
	        userInput.next();
	    }
		double subtotal = userInput.nextDouble();
		
		System.out.print("Enter a number for the percent gratuity: ");
		//make sure the user gives us something that can work as a double again
		while (!userInput.hasNextDouble()) {
	        System.out.println("That's not a number, please enter a number: ");
	        userInput.next();
	    }
		double percentGratuity = userInput.nextDouble();
		
		double gratuity = (percentGratuity / 100) * subtotal;
		double total = subtotal + gratuity;
		System.out.print("Gratuity: " + gratuity + " Total: " + total);
		userInput.close();
	}
}
