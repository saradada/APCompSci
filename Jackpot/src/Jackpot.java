//Jackpot.java
//Sara Dada Period 2

import java.util.Random;
import java.util.Scanner;

public class Jackpot {
	public static void main(String[] args) {
		//CREATE OBJECTS
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		// USER INPUT
		System.out.println("Enter the number of sides for the 3 die to be rolled:");
		System.out.print("Die 1: ");
		int die1sides = scan.nextInt();
		System.out.print("Die 2: ");
		int die2sides = scan.nextInt();
		System.out.print("Die 3: ");
		int die3sides = scan.nextInt();
		//LOGIC
		boolean matches = false;
		int die1Val=0, die2Val=1, die3Val=2,numberOfRolls=0;
		while (!matches) {
			//build/roll
			die1Val = rand.nextInt(die1sides)+1;
			die2Val = rand.nextInt(die2sides)+1;
			die3Val = rand.nextInt(die3sides)+1;
			numberOfRolls++;
			//print of results per round
			System.out.println("Round: "+ numberOfRolls + "\tDie 1 Val: " + die1Val + "\tDie 2 Val: " + die2Val + "\tDie 3 Val: " + die3Val);
			if (die1Val==die2Val && die2Val==die3Val && die3Val == die1Val) {
				matches = true;
			}
		}
	}
}
