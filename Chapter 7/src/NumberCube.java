import java.util.Random;

public class NumberCube {
	private int totalTosses = 0;
	public int toss() {
		Random rand = new Random();
		int returnVal = rand.nextInt(6)+1;
		totalTosses++;
		return returnVal;
	}
	public int[] getCubeTosses(int numberOfTosses)
}
