
public class Employee {
	private int employeeID;
	private Date dateOfHire;
	private Address address;
	
	public Employee(){
		
	}
	
	public Employee(int employeeID, Date dateOfHire, Address address){
		this.employeeID = employeeID;
		this.dateOfHire = dateOfHire;
		this.address = address;
	}
	public boolean conflictsWith(Date d){
		if (d.equals(dateOfHire)) {
			return true;
			//You code this. Return true if the dates are the same, false if they are different
		}
		else {
			return false;
		}
	}
	public void setID(int ID) {
		employeeID =ID;
	}
	
	public void setDateOfHire(Date date) {
		dateOfHire = date;
	}
	
	public void setAddress(Address addressInput) {
		address = addressInput;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public Date getDateOfHire() {
		return dateOfHire;
	}
	
	public Address getAddress() {
		return address;
	}
}
