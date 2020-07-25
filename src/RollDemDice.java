import java.util.Scanner;

public class RollDemDice {

	public static void main(String[] args) {
		
		int numOfSides = 0;
		String playAgain;
		int rollCount = 1;
		
										
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
	
	do {		
		System.out.println();	
		System.out.println("How many sides should each die have?");	
		numOfSides = scnr.nextInt();
		
		generateRandomDieRoll(numOfSides,rollCount);
		
		System.out.println();
		System.out.println("Continue Y/N ");
		playAgain = scnr.next();
		rollCount++;
	}
	while (playAgain.equalsIgnoreCase ("y")); {	
	}
	if (playAgain.equalsIgnoreCase ("N")) {
		System.out.println("Thank you for rolling dem dice, please gamble responsibly");
	}
	scnr.close();

	}
	
	public static void generateRandomDieRoll(int numOfSides, int rollCount) {
		
		int dieOne = (int)(Math.random()*numOfSides) + 1;
        int dieTwo = (int)(Math.random()*numOfSides) + 1;
        System.out.println("Roll " + rollCount + ":");
        
        if (dieOne+dieTwo == 7) {
        	System.out.println(dieOne);
        	System.out.println(dieTwo);
        	System.out.println("Craps!");
        }else if (dieOne == 1 && dieTwo == 1) {
        	System.out.println(dieOne);
        	System.out.println(dieTwo);
        	System.out.println("Snake Eyes!");
        }else if (dieOne == 6 && dieTwo == 6) {
        	System.out.println(dieOne);
        	System.out.println(dieTwo);
        	System.out.println("Box Cars!");
        }else {
        System.out.println(dieOne);
        System.out.println(dieTwo);
        }
	}
}


