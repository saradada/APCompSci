import java.util.ArrayList;
import java.util.Random;

public class ArrayListLab {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> finalNums = new ArrayList<Integer>();
		for (int i =1; i<11; i++) {
			nums.add(i);
		}
		
		Random rand = new Random();
		int x = rand.nextInt(10)+1;
		
		finalNums.add(0, nums.get(x));
		nums.remove(x);
		
		printArrayList(finalNums);
	}
	
	public static void printArrayList(ArrayList<Integer> nums) {
		for (int i: nums) {
			System.out.print((Integer)nums.get(i));
		}
	}
	


}
