
public class SavingsAccountTester {

	public static void main(String[] args) {
		SavingsAccount mySavings = new SavingsAccount(1000, 10);
		mySavings.addInterest();
		System.out.println(mySavings.getBalance()); 
		System.out.println("Expected amount: 1100");
	}

}
