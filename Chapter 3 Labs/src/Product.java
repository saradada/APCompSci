//Implement a class Product. A product has a name and a price, for example new Product("
//Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a
//program ProductPrinter that makes two products, prints the name and price, reduces
//their prices by $5.00, and then prints the prices again.
public class Product {
	private String name;
	private double price;
	
	public Product(String prodName, double prodPrice) {
		name = prodName;
		price = prodPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void reducePrice(double value) {
		price = price - value;
	}
}
