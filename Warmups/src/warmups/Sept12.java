package warmups;

public class Sept12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newStr1 = frontBack("HelloThere");
		System.out.println(newStr1);
	}
	
	public static String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String newStr = str.substring(str.length()-1);
		System.out.println(newStr);
		newStr = newStr + str.substring(1, str.length()-1) + str.substring(0,1);
		System.out.println(newStr);
		return newStr;
	}

}
