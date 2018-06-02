import java.util.Random;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		//PART A
		String[] firstNames = {"Andy","Barbara","Chandra", "Dyson", "Eric"};
		String[] middleInitials = {"F.","G.","H.","I."};
		String[] lastNames = {"Jackman", "Kincaid", "Lacy"};
		String[] names = new String[10];
		Random rand = new Random();
		names[0] = firstNames[0]+ " " +middleInitials[0]+ " " +lastNames[0];
		names[1] = firstNames[1]+ " " +middleInitials[1]+ " " +lastNames[1];
		for (int i=2; i < names.length -1; i++) {
			int val1 = rand.nextInt(5);
			int val2 = rand.nextInt(4);
			int val3 = rand.nextInt(3);
			names[i] = firstNames[val1] + " " + middleInitials[val2] + " " + lastNames[val3];
		}
		names[9] = firstNames[3] + " " + middleInitials[1]+ " " +lastNames[2];
		for (int i = 0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		
		//PART B
		int totalCombinations=60;
		int allNamesIndex = 0;
		String[] allNames = new String[totalCombinations];
		for (int i=0; i<firstNames.length;i++) {
			for (int j=0; j< middleInitials.length;j++) {
				for (int k=0; k< lastNames.length; k++) {
					allNames[allNamesIndex++] = firstNames[i] + " "+ middleInitials[j] + " "+lastNames[k];
				}
			}
		}
		
		for (int i = 0; i< allNames.length; i++) {
			System.out.println(allNames[i]);
		}
	}

}
