
public class SavingsAccount {
	private double balance;
	private double interest;
	
	public SavingsAccount(double balanceVal, double interestVal){
		balance = balanceVal;
		interest = interestVal;
	}
	
	public void addInterest() {
		double val = interest/100; //convert to decimal
		   val=val*balance; 
		   balance= balance + val;
	}
	
	public double getBalance()
	   {   
	      return balance;
	   }
}
