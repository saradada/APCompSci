
public class Car {
	private double fuelEfficency; //miles per gallon
	private double gasTank; // gallons
	
	public Car(double fuelEfficencyOfCar) {
		fuelEfficency = fuelEfficencyOfCar;
		gasTank = 0;
	}
	
	public void drive(double distance) {
		double usedGas = distance/fuelEfficency;
		gasTank = gasTank - usedGas;
	}
	
	public double getGasInTank() {
		return gasTank;
	}
	
	public void addGas(double gallons) {
		gasTank += gallons;
	}
}
