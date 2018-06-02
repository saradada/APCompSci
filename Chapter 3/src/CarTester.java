
public class CarTester {

	public static void main(String[] args) {
		Car myHybrid = new Car(50); // 50 mis per gal
		myHybrid.addGas(20); //Tank 20 gallons
		myHybrid.drive(100);// Drive 100 miles
		double gasLeft = myHybrid.getGasInTank(); // get remaining gas in tank
		System.out.println(gasLeft);

	}

}
