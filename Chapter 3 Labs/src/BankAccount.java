/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private double fee;
   int freeTransactions;
   private double totalFees;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance,double transFee, int freeTrans)
   {   
      balance = initialBalance;
      fee = transFee;
      freeTransactions = freeTrans;
      totalFees = 0;
   } 

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double tempFee;
	  if (freeTransactions <= 1) {
    	  tempFee = 0;
      }
	  else {
		  tempFee = fee;
	  }
	  balance = balance + amount;
	  totalFees+=tempFee;
	  freeTransactions--;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
	   double tempFee;
		  if (freeTransactions <= 1) {
	    	  tempFee = 0;
	      }
		  else {
			  tempFee = fee;
		  }
	   balance = balance - amount;
	   totalFees+=tempFee;
	   freeTransactions--;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   
   public void addInterest(double rate) {
	   double val = rate/100; //convert to decimal
	   val=val*balance; 
	   balance= balance + val;
	   
   }
   
   public void setFee(double newFee) {
	   fee = newFee;
   }
   
   public void deductMonthlyCharge(int freeTrans) {
	   balance= balance - totalFees;
	   totalFees = 0;
	   freeTransactions = freeTrans;
   }
}
