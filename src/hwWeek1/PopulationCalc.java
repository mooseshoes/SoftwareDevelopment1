//Joseph Gust 2/2/2017 Assignment 1.11
package hwWeek1;

public class PopulationCalc {

	public static void main(String[] args) {
		Double startPopulation = 312032486.0;
		Double currentPopulation = startPopulation;
		int secBirth = 7;
		int secDeath = 13;
		int secImmigrant = 45;
				
		//Loop to run the calculate yearly increase and print out the population for all five years.
		for (int i = 1; i < 6; i++){
			currentPopulation = currentPopulation + popChangeYr(secBirth, secDeath, secImmigrant);
			int currentPop = currentPopulation.intValue();
			System.out.println("After " + i + " year(s) the population will reach " + currentPop);
		}
		
	}
	//Calculates how many seconds are in a year
	public static double yearToSeconds(){
		double daysPerY = 365.0;
		double hoursPerD = 24.0;
		double minsPerH = 60.0;
		double secondsPerM = 60.0;
		
		return (daysPerY * hoursPerD * minsPerH * secondsPerM);
	}
	//calculates the population change in one year
	public static double popChangeYr(int secBirth, int secDeath, int secImmigrant){
		double secondsPerYear = yearToSeconds();
		double popChange = (secondsPerYear / secBirth) + (secondsPerYear / secImmigrant) - (secondsPerYear / secDeath);
		return popChange;
	}

}
