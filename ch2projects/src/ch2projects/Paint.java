// Paint.java
// By: Sara Dada
//purpose: determine how much paint is needed to paint the walls
// of a room given its length, width, and height
// can assume their are 4 walls and they are all the same

package ch2projects;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		final int COVERAGE = 350; //paint cover 350 sq ft/gal
		//declare integers length,width and height, doors and windows
		int length, width, height, doors, windows;
		//declare double totalSqFt
		double totalSqFt;
		//declare double paintNeeded
		double paintNeeded;
		
		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);
		//Prompt for and read in the length of the room
		System.out.println("What is the length of the room in feet? ");
		length = scan.nextInt();
		//Prompt for and read in the width of the room
		System.out.println("What is the width of the room in feet? ");
		width = scan.nextInt();
		//Prompt for and read in the height of the room
		System.out.println("What is the height of the room in feet? ");
		height = scan.nextInt();
		//Prompt for and read in the number of doors in the room
		System.out.println("What is the the number of doors in the room? ");
		doors = scan.nextInt();
		//Prompt for and read in the number of windows in the room
		System.out.println("What is the the number of windows in the room? ");
		windows = scan.nextInt();
		
		//Computes the total square feet to be painted--think
		//about the dimensions of each wall
		totalSqFt = (2*(length*height)) + (2*(width*height)) - ((doors*20) + (windows*15));	
		//compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE;
		//Print the length, width, height of the room
		// and the num of gallons of paint needed
		System.out.println("length: " + length + "\nwidth:"+ width +"\nheight:"+ height+ "\nNumber of doors: " + doors + "\nNumber of windows: " + windows +"\ngallons of paint needed: "+paintNeeded);
	}
}
