
public class BankAccountArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(100);
		BankAccount c = new BankAccount(500);
		BankAccount d = new BankAccount(300);
		BankAccount e = new BankAccount(700);
		BankAccount f = new BankAccount(200);
		
		BankAccount[] accounts = new BankAccount[5];
		accounts[0] = b;
		accounts[1] = c;
		accounts[2] = d;
		accounts[3] = e;
		accounts[4] = f;
		
		BankAccount largestYet = accounts[0];
		for(int i=0;i<accounts.length; i++){
			BankAccount a = accounts[i];
			if(a.getBalance() > largestYet.getBalance()){
				largestYet = a;
			}
		}
		System.out.print("The largest balance is "+largestYet.getBalance());

	}

}
