
public class Address {
private String street;
	
	private String city;
	private int houseNumber;
	private int zipcode;
	
	public Address(){
		
	}
	
	public Address (int hN, String s, String c, int z){
		houseNumber = hN;
		street = s;
		city = c;
		zipcode = z;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String val) {
		city =val;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(int val) {
		houseNumber =val;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String val) {
		street =val;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(int val) {
		zipcode =val;
	}

}
