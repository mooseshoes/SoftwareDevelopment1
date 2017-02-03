//Joseph Gust  2/2/2017 Assignment 2.11
package hwWeek1;
import java.util.Scanner;

public class PopulationCalc2 {

	public static void main(String[] args) {
		Double startPopulation = 312032486.0;
		Double currentPopulation = startPopulation;
		int secBirth = 7;
		int secDeath = 13;
		int secImmigrant = 45;	
		//scanner object for user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an integer for the number of years: ");
		
		//make sure the user gives us an integer
		while (!userInput.hasNextInt()) {
	        System.out.println("That's not an integer, please enter a number: ");
	        userInput.next();
	    }
		int years = userInput.nextInt();
		
		currentPopulation = currentPopulation + popChanger(secBirth, secDeath, secImmigrant, years);
		int currentPop = currentPopulation.intValue();
		System.out.println("After " + years + " year(s) the population will reach " + currentPop);
		
		userInput.close();
	}
	//calculate the number of seconds in a year
	public static double yearToSeconds(){
		double daysPerY = 365.0;
		double hoursPerD = 24.0;
		double minsPerH = 60.0;
		double secondsPerM = 60.0;
		
		return (daysPerY * hoursPerD * minsPerH * secondsPerM);
	}
	//calculate the population change for the number of years specified
	public static double popChanger(int secBirth, int secDeath, int secImmigrant, int years){
		double secondsElapsed = yearToSeconds() * years;
		double popChange = (secondsElapsed / secBirth) + (secondsElapsed / secImmigrant) - (secondsElapsed/ secDeath);
		return popChange;
	}

}
