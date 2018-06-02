//Implement a class Product. A product has a name and a price, for example new Product("
//Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a
//program ProductPrinter that makes two products, prints the name and price, reduces
//their prices by $5.00, and then prints the prices again.
public class ProductPrinter {

	public static void main(String[] args) {
		Product keyboard = new Product("Keyboard", 20.00);
		Product mouse = new Product("Mouse", 10.00);
		System.out.println(keyboard.getName());
		System.out.println(keyboard.getPrice());
		keyboard.reducePrice(5.00);
		System.out.println(mouse.getPrice());
		System.out.println(mouse.getName());
		System.out.println(mouse.getPrice());
		mouse.reducePrice(5.00);
		System.out.println(mouse.getPrice());

	}

}
