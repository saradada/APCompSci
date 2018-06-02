package lab;

public class Lab {
	public static void main(String[] args) {
		String printVal = "This is a Test";
		String smallTestString = printVal.toLowerCase();
		System.out.println(smallTestString);
		String bigTestString = smallTestString.toUpperCase(); 
		   // Replace "smallTestString" with the 
		   // name you used for your lowercase string
		System.out.println(bigTestString);
		
		String animal1 = "quick brown fox";
	      String animal2 = "lazy dog";

	      String article = "the";
	      String action = "jumps over";

	      String message = article.concat(" " + animal1);
	      message = message.concat(" " + action);
	      message = message.concat(" " + article);
	      message = message.concat(" " + animal2);
	     
	      System.out.println(message);

	}
}
