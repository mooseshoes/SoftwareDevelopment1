//Joseph Gust  2/2/2017   Assignment 2.13
package hwWeek1;
import java.util.Scanner;

public class SavingsCalc {

	public static void main(String[] args) {
		double interestRate = .05;
		double savings;
		//scanner object to take user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number for the amount of money you deposit into savings per month: ");
		
		//make sure the user gives us a double
		while (!userInput.hasNextDouble()) {
	        System.out.println("That's not a number, please enter a number: ");
	        userInput.next();
	    }
		double monthlySav = userInput.nextDouble();		
		userInput.close();
		
		savings = calcSavings(monthlySav, interestRate, 6);
		System.out.print("After 6 months you've saved: $" + savings);

	}

	public static double calcSavings(double monthlySav, double interest, int months){
		double savings = 0;
		double intRate = interest / 12;
		for (int i = 0; i < months; i++){
			savings += monthlySav;
			savings *= (intRate + 1);
		}
		savings = Math.round(savings * 100);
		savings /= 100.0;
		return savings;
	}
}
