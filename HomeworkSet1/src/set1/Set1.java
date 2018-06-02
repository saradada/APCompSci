package set1;

import java.util.concurrent.ThreadLocalRandom;

public class Set1 {
	public static void main(String[] args) {
		//P1A
		System.out.println("Pizza");
		System.out.println("Blue");
		System.out.println("Avengers");
		System.out.println("Young the Giant");
		//P1B
		int a = 2;
		int b = 3;
		if (a<b) {
			System.out.println("The value of a is " + a + " and it is less than b whoose value is " + b +".");
		}
		else if (a>b) {
			System.out.println("The value of a is " + a + " and it is greater than b whoose value is " + b +".");
		}
		else {
			System.out.println("The value of a is " + a + " and it is equal to b whoose value is " + b +".");
		}
		//P1C
		evenOrOdd(12);
		//P1D
		for (int x = 1; x<=10; x++) {
			int numberSquared = x*x;
			System.out.println(x+"\t"+numberSquared+"\t"+randNum(x,numberSquared));
		}
		
	}
	public static void evenOrOdd(int num) { //P1C
        if (num%2 == 0) {
        	System.out.println(num + " is an even number");
        }
        else {
        	System.out.println(num + " is an odd number");
        }
    }
	public static int randNum(int min, int max) { //P1D
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
}
