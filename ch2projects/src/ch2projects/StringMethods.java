package ch2projects;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "The quick brown fox jumps over the lazy dog";
		System.out.println(name.indexOf("q"));
		System.out.println(name.indexOf("quick"));
		String vowels = "eiou";
		for (int letterIndex = 0; letterIndex<name.length(); letterIndex++) {
			String letter = name.substring(letterIndex,letterIndex+1);
			if (vowels.indexOf(letter)> -1) {
				letter = "*";
			}
			System.out.print(letter);
		}
	}
}
