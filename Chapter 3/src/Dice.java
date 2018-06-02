import java.util.Random;

public class Dice {
	// number of sides for dice object
	private int numSides;
	// number of times dice object has been rolled
	private int rollCount;
	//  last rolled value for dice object
	private int value;
	
	
	// Creates a dice object with 6 sides, roll count set to zero, value set to flag of -1
	public Dice () {
		numSides = 6;
		rollCount = 0;
		value = -1;
	}
	
	// Creates a dice object with n sides, roll count set to zero, value set to flag of -1
	public Dice (int n) {
		//YOU DO
		numSides = n;
		rollCount = 0;
		value = -1;
	}
	
	// Rolls die object. Roll count increased by 1, and the value is set equal to a random 
	// int value from 1 to numSides, returns new face value rolled
	public void roll () {
		//YOU DO
		rollCount++;
		Random rand = new Random();
		value = rand.nextInt(numSides) +1;
	}
	
	//Gets the roll count, return the current roll count
	public int getRollCount() {
		return rollCount;
	}
	
	//Gets the face value, returns current face value
	public int getValue() {
		return value;
	}
}
