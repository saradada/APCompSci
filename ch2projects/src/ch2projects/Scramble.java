package ch2projects;

public class Scramble {

	public static void main(String[] args) {
		System.out.println(stringScramble("A is for Apple"));
		System.out.println(stringScramble("BA is for BApple And A"));
	}
	
	public static String stringScramble(String str) {
		String newStr ="";
		for (int i = 0; i< str.length()-1; i++) {
			//loop through the str to check for a
			// check to see if the current letter is an A If A is the last letter, than just leave it
			if(str.substring(i, i+1).equals("A")) {
				newStr += str.substring(i+1,i+2) + str.substring(i, i+1);
				i++;
			}	
			else {
				newStr += str.substring(i,i+1);
			}
		}
		return newStr + str.substring(str.length()-1);
	}

}
