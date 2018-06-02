import java.util.Scanner;

public class CreditCardCheck {

	public static void main(String[] args) { 
		 Scanner input = new Scanner(System.in); 
		 System.out.print("8-digit credit card number: "); 
		 int credit_card_number = input.nextInt(); 
		 input.close(); 
		 int digit_7 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_6 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_5 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_4 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_3 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_2 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_1 = credit_card_number % 10; 
		 credit_card_number /= 10; 
		 int digit_0 = credit_card_number % 10; 
		  
		 int part1 = digit_7 + digit_5 + digit_3 + digit_1; 
		 // part 2 
		 int twice = 2 * digit_6; 
		 int part2 = 0; 
		 part2 = part2 + ((twice % 10) + (twice / 10)); 
		 twice = 2 * digit_4; 
		 part2 = part2 + ((twice % 10) + (twice / 10)); 
		 twice = 2 * digit_2; 
		 part2 = part2 + ((twice % 10) + (twice / 10)); 
		 twice = 2 * digit_0; 
		 part2 = part2 + ((twice % 10) + (twice / 10)); 
		  
		 int total = part1 + part2; 
		 int remaining = total % 10; 
		 if (remaining == 0) { 
		     System.out.println("Card number is valid"); 
		 } 
		 else { 
		     System.out.println("Card number is invaid"); 
		     int check_digit = 0; 
		     if (digit_7 - remaining < 0) { 
		  check_digit = digit_7 + (10 - remaining); 
		     } 
		     else { 
		  check_digit = digit_7 - remaining; 
		     } 
		     System.out.println("Check digit should be: " + check_digit); 
		 } 
    } 
}
