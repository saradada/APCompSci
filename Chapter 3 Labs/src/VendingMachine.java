
public class VendingMachine {
	//getCanCount (return # of cans), 
	//addMoreCans (increase # of cans), 
	//insertMoney (increase amnt of money)
	//,and countMoney (return total amnt of money)
	
	private int tokens;
	private int cans;
	
	public void fillUp (int numberOfCans) {
		cans+=numberOfCans;
	}
	
	public void insertToken() {
		tokens++;
		cans--;
	}
	public int getCanCount(){
		return cans;
	}
	public int getTokenCount(){
		return tokens;
	}	
}
