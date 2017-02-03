//Joseph Gust 2/2/17 Assignment 3.17
package week3Hw;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int  myPick = rand.nextInt(3);
		int  yourPick = -1;
		String userChoice = "";
		String myChoice = chooseWeapon(myPick);
		boolean iWin = false;
		while(yourPick < 0 || yourPick > 2){
			System.out.print("Enter a number from 0 to 2, 0 being rock, 1 being paper, and 2 being scissors: ");
			yourPick = UserInput.getInputInt(input);
		}
		userChoice = chooseWeapon(yourPick);
		iWin = winGame(myPick, yourPick);
		System.out.print("I picked " + myChoice + ".  You picked " + userChoice + ". ");
		if(iWin){
			System.out.print("I won!");
		}
		else if((myPick - yourPick) == 0){			
			System.out.print("It's a tie!");
		}
		else{
			System.out.print("You won!");
		}
		input.close();
	}

	public static String chooseWeapon(int choice){
		String weapon = "";
		switch(choice){
			case 0:
				weapon = "Rock";
				break;
			case 1:
				weapon = "Paper";
				break;
			case 2:
				weapon = "Scissors";
				break;
		}
		return weapon;
	}
	public static boolean winGame(int myPick, int yourPick){
		if ((myPick - yourPick) == 1 || (myPick - yourPick) == -2 ){
			return true;
		}
		return false;
	}
}
