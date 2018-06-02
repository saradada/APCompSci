import java.util.ArrayList;
public class practice {

	public static void main(String[] args) {
		ArrayList<Integer> digitlist = new ArrayList<Integer>();
		Digits(digitlist, 0);
		System.out.println(digitlist);
	}

	private static void Digits(ArrayList<Integer> digitList, int num) {
		int digit;
		if (num == 0) {
			digitList.add(0);
		}
		else {
			while (num!= 0) {
				digit = num%10;
				digitList.add(0, digit);
				num /=10;
			}
		}
	}
		
}