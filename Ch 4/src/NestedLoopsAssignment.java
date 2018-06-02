import java.util.Scanner;

public class NestedLoopsAssignment {

	public static void main(String[] args) {
		//Pattern A
		System.out.println("Test Pattern \"A\"");
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
		//Pattern B
		for (int x=1; x<=5; x++) {
			for(int b=1; b<=x; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
		//Pattern C
		for (int x=5; x>=1; x--) {
			for(int b=1; b<=x; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
		//Pattern D
		int y = 1;
		for (int x=5; x>=1; x--) {
			for(int b=1; b<=x; b++) {
				System.out.print(b*y);
			}
			System.out.println();
			y++;
		}
		System.out.println();
		//Pattern E
		for (int x=1; x<=5; x++) {
			for(int b=1; b<=x; b++) {
				System.out.print(">");
			}
			System.out.print("*");
			for(int b=1; b<=x; b++) {
				System.out.print("<");
			}
			System.out.println();
		}
		System.out.println();
		//Pattern F 
		for (int a = 1; a <= 5; a++) { //Which row
			if (a==1 || a==5) {
				for (int b = 1; b <= 5; b++) { //num characters
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//FINAL
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of a side(or a negative number to exit) : ");
		int sideLength = scan.nextInt();
		for (int a = 1; a <= sideLength; a++) { //Which row
			if (a==1 || a==sideLength) {
				for (int b = 1; b <= sideLength; b++) { //num characters
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for (int b = 1; b <= sideLength-2; b++) { //num characters
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
