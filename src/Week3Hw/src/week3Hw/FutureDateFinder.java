//Joseph Gust 2/2/17 Assignment 3.5
package week3Hw;
import java.util.Scanner;

public class FutureDateFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int today = -1;
		int futureDay = 0;
		String currentDate = "";
		String futureDate = "";
		//let's just make sure the current date is between 0 and 6 to be simpler
		while(today < 0 || today > 6){	
			System.out.print("Please enter an integer between 0 and 6 to represent the day of the week: ");
			today = UserInput.getInputInt(input);
		}
		//make sure this day is actually a future date, has to be atleast 1
		while(futureDay < 1){	
			System.out.print("Please enter the number of days in the future you want to look at, must be at least 1: ");
			futureDay = UserInput.getInputInt(input);
		}
		input.close();
		currentDate = dayOfWeek(today);
		futureDate = dayOfWeek((futureDay + today));
		System.out.println("Today is: " + currentDate);
		System.out.print("The future day is: " + futureDate);
	}
	//determines what day of the week the day specified falls on
	public static String dayOfWeek(int day){
		String date = "";
		day %= 7;
		switch(day){
		case 0:
			date = "Sunday";
			break;
		case 1:
			date = "Monday";
			break;
		case 2:
			date = "Tuesday";
			break;
		case 3:
			date = "Wednesday";
			break;
		case 4:
			date = "Thursday";
			break;
		case 5:
			date = "Friday";
			break;
		case 6:
			date = "Saturday";
			break;
	}
		return date;
	}
}
