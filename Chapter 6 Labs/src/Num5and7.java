
public class Num5and7 {
	public static void main(String[] args) {
		// number 5
		for (int x = 1; x<=2; x++) {
			for (int y = 1; y<=4; y++) {
				System.out.println(x+"\t"+y);
			}
		}
		
		// number 7
		for (int x = 1; x<=5; x++){
			for (int y= 1; y<=x; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
