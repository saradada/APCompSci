/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      /*BankAccount harrysChecking = new BankAccount();
      harrysChecking.deposit(1000);
      harrysChecking.withdraw(500);
      harrysChecking.withdraw(400);
      System.out.println(harrysChecking.getBalance());
      System.out.println("Expected: 100");  
      BankAccount momsSavings = new BankAccount();
      momsSavings.deposit(1000);
      momsSavings.addInterest(10); // 10% interest the balance in momsSavings is $1,100. 
      System.out.println(momsSavings.getBalance());
      System.out.println("Expected: 1100");  */
      
      BankAccount test = new BankAccount(1000,5,3);
      test.deposit(10); // bal = 1010, fees = 0, tries left = 2
      System.out.println(test.getBalance());
      test.withdraw(2); // bal = 1008, fees = 0, tries left = 1
      System.out.println(test.getBalance());
      test.deposit(20); // bal = 1028, fees = 0, tries left = 0
      System.out.println(test.getBalance());
      test.withdraw(5); // bal = 1023, fees = 5
      System.out.println(test.getBalance());
      test.deposit(7);  // bal = 1030, fees = 10
      System.out.println(test.getBalance());
      
      test.deductMonthlyCharge(3); // bal = 1020, fees = 0, tries = 3;
      System.out.println(test.getBalance());
      
      test.deposit(10); // bal = 1030, fees = 0, tries left = 2
      System.out.println(test.getBalance());
      test.withdraw(2); // bal = 1028, fees = 0, tries left = 1
      System.out.println(test.getBalance());
      test.deposit(20); // bal = 1048, fees = 0, tries left = 0
      System.out.println(test.getBalance());
      test.withdraw(5); // bal = 1043, fees = 5
      System.out.println(test.getBalance());
      test.deposit(7);  // bal = 1050, fees = 10
      test.deductMonthlyCharge(3); // bal = 1040, fees = 0, tries = 3;
      System.out.println(test.getBalance());
   }
}
