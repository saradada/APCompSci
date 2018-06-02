import java.util.Random;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		//Part A
		String[] firstNames = {"Andy","Barbara","Chandra", "Dyson", "Eric"};
		String[] middleInitials = {"F.","G.","H.","I."};
		String[] lastNames = {"Jackman", "Kincaid", "Lacy"};
		replaceName(firstNames,"Chandra", "Charlize");
		dumpArray("firstNames (with Charlize)",firstNames);
		replaceName(firstNames,"Barbara", "Betty");
		dumpArray("firstNames (with Betty)",firstNames);
		firstNames[firstNames.length-1] = "Zachary";
		dumpArray("firstNames (with Zachary)", firstNames);
		
		//Part B
		dumpArray("firstNames (before swap)", firstNames);
		swapValues(firstNames, 0, 2);
		dumpArray("firstNames (after swap)", firstNames);
		dumpArray("middleInitials (before swap)", middleInitials);
		swapLoop(middleInitials);
		dumpArray("middleInitials (after swap)", middleInitials);
		// Changing the iterator from 2 to 1 pushes the first array value to the end of the array. 
		// This is because the loop swaps already swapped values.
		
		//Part C
		String[] names = new String[10];
		Random rand = new Random();
		for (int i= 0; i < names.length; i++) {
			int val1 = rand.nextInt(5);
			int val2 = rand.nextInt(4);
			int val3 = rand.nextInt(3);
			names[i] = firstNames[val1] + " " + middleInitials[val2] + " " + lastNames[val3];
			if (i>0) {
				if(names[i] == names[i-1]){
					int vals1 = rand.nextInt(5);
					int vals2 = rand.nextInt(4);
					int vals3 = rand.nextInt(3);
					names[i] = firstNames[vals1] + " " + middleInitials[vals2] + " " + lastNames[vals3];
				}
			}
		}
		dumpArray("names", names);
	}
	public static void dumpArray(String title, String[] arr) {
		System.out.println(title);
		for (int i=0; i< arr.length; i++) {
			System.out.println("["+i+"]="+arr[i]);
		}
	}
	public static void replaceName(String[] vals, String originalVal, String newVal) {
		for (int i =0; i<vals.length; i++) {
			if (vals[i].equals(originalVal)) {
				vals[i] = newVal;
			}
		}
	}
	
	public static void swapValues(String[] vals, int index1,int index2) {
		String temp = vals[index1];
		vals[index1] = vals[index2];
		vals[index2] = temp;
	}
	public static void swapLoop(String[] vals) {
		for (int i=0; i<vals.length-1; i+=1) {
			String temp = vals[i];
			vals[i] = vals[i+1];
			vals[i+1] = temp;
		}
	}
	public static String searchArrayString(String[] arr, String find) {
		boolean match=false;
		for (int i=0; i<arr.length; i++) {
			if (arr[i].equals(find)) 
				match=true;
		}
		if (match==true) 
			return find + " is found.";
		else 
			return find + " is not found.";			
	}

	public static boolean searchArrayBool(String[] arr, String find) {
		boolean match=false;
		for (int i=0; i<arr.length; i++) {
			if (arr[i].equals(find)) 
				match=true;
		}
		return match;		
	}
}
