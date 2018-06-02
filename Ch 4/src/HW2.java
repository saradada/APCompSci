import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of cents (from 1 to 1000): ");
		int cents = scan.nextInt();
		int combos = 0;
		for (int quarters =0; quarters*25<=cents; quarters++){
			for(int dimes = 0; quarters*25+dimes*10 <= cents; dimes++){
				for(int nickels = 0; quarters*25+dimes*10 +nickels*5<=cents;nickels++){
					int pennies = cents-quarters*25-dimes*10 -nickels*5;
					combos++;
					System.out.println("Quarters: " + quarters + " Dimes: "+ dimes+ " Nickels: " +nickels+ " Pennies: "+ pennies);
					}
				}
			}
		System.out.println("A total number of "+combos+" combos is possible with "+ cents +" cents.");
		}
	}
