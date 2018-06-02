package warmups;

public class ch2 {

	public static void main(String[] args) {	
		System.out.println(Scramble("A is for Apple"));
		int sum = 0,  p = 1;
		for (int count=1; count<=50; count++) {
			sum += p;
			p *= 2;
		}
		System.out.println(sum);

	}
	
	public static String Scramble(String str) {
		String returnVal = "";
		for (int i = 0; i<str.length()-1;i++) {
			if (str.substring(i,i+1).equals("A")) {
				returnVal += str.substring(i+1,i+2) +str.substring(i,i+1);
				i++;
			}
			else {
				returnVal += str.substring(i,i+1);
			}
		}
		return returnVal+ str.substring(str.length()-1);
	}

}
