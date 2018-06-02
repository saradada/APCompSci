package ch2projects;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		int numToGuess;		//Number the user tries to guess
		int guess;			//The user's guess
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		//randomly generate the number to guess
		numToGuess = generator.nextInt(10)+1;
		//print message asking user to enter a guess
		System.out.print("Enter a guess: ");
		//read in guess
		guess = scan.nextInt();
		while (guess!=numToGuess) //keep going as long as guess is wrong
		{
			//print message saying guess is wrong
			System.out.print("Guess is wrong! Enter another guess: ");
			//get another guess from user
			guess = scan.nextInt();
		}
		
		// print message saying guess is right
		System.out.println("Guess is right!");
	}

}
