package ch2projects;

public class ch2frqreview {

	public static void main(String[] args) {
		System.out.println(mixString("Hello merry ewemes", "e"));
	}
	
	public static String mixString(String myStr, String ch) {
		String newStr = "";
		for (int i=0; i<myStr.length();i++) {
			if (myStr.substring(i, i+1).equals(ch)) {
				newStr += myStr.substring(i+1,i+2) + 'C';
				i++;
			}
			else {
				newStr += myStr.substring(i,i+1);
			}
		}
		return newStr;
	}

}
