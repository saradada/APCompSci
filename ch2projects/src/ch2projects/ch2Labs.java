package ch2projects;

import java.awt.Rectangle;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ch2Labs {

	public static void main(String[] args) {
		// NUMBER 1
		//see method Number1 below
		System.out.print(Number1( "      abc   "));
		System.out.print(Number1( "   def"));
		System.out.print(Number1( "ghi         "));    
		System.out.println();
		
		//NUMBER 2/3/4
		// Tokenizer class allows an application to break a string into tokens.
		//The String sentence is passed into the StringTokenizer object mystery.
		//The .countTokens() method counts the number of tokens in the given string
		//The .nextToken() method prints the next token in the given string.
		String sentence = "Mary had a little lamb.";
	    StringTokenizer mystery = new StringTokenizer(sentence);
	    System.out.println(mystery.countTokens()); // prints number of tokens (5)
	    System.out.println(mystery.nextToken()); // prints the next token ("Mary")
	    System.out.println(mystery.nextToken()); // prints the next token ("had")
	    System.out.println("Hello " + mystery.nextToken());
	    
	    //NUMBER 5
	    Rectangle r1 = new Rectangle(0, 0, 100, 50);
	    Rectangle r2 = r1;
	    r2.grow(10, 20);

	    System.out.println(r1);
	    System.out.println(r2);
	    
	    //java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
	    //java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
	    // r2 refers to the same object as r1. When r2 'grows', r1 reffers to the
	    //same 'grown' rectangle
	    
	    double n1 = 150;
	    double n2 = n1;

	    n2 = n2 * 20; // Grow n2

	    System.out.println(n1);
	    System.out.println(n2);
	    //150 and 3000
	    // With the variables, the original and the copy are independent values.
	    // When you copy the same object reference, the original and the copy refer 
	    // to the same value.
	    
	    // NUMBER 6
	    //see method AreaTester below
	    System.out.println(AreaTester(0, 0, 10, 10));
	    
	    //Number 7
	    //see method ReplaceTester below
	    System.out.println(ReplaceTester("Mississippi"));
	    
	    //NUMBER 8
	    String str = "Hello, World!";
	    System.out.println(str.replace("e", "&").replace("o", "$").replace("&", "o").replace("$", "e"));
	    
	    //NUMBER 9
	    System.out.println(DieSimulator());
	    
	    //NUMBER 10
	    System.out.println(appendString("Always","yo"));
	    
	    //NUMBER 11
	    System.out.println(appendString("Hello","Hell","y"));
	    
	    //NUMBER 12
	    // The code creates a window the size of the given rectangle. 
	    //The window is created with the JFrame object.
	    // The rectangle is created with the Rectangle object. 
	    //If the rectangle is translated and the frame bounds are reset, the window moves.
	    
	    // Construct a frame and show it
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// Your work goes here:
		// Construct a rectangle and set the frame bounds
		Rectangle rect = new Rectangle(0, 0, 100, 200);
		frame.setBounds(rect);
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		// Your work goes here:
		// Move the rectangle and set the frame bounds again
		rect.translate(200, 300);
		frame.setBounds(rect);
		
		//NUMBER 13
		//The code uses the gregorian calendar object to convert the inputs to a string output.
		//The getWeekday() uses the date object to convert the given input into a string.
		//The getMonth() also uses the date object to convert the given input into a string.
		GregorianCalendar date = new GregorianCalendar();

	      // Calculate date and weekday 100 days from today
	      date.add(GregorianCalendar.DAY_OF_MONTH, 100);
	      System.out.printf("100 days from today is %s %s %d, %d\n",
	            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)),
	            getMonth(date.get(GregorianCalendar.MONTH)),
	            date.get(GregorianCalendar.DAY_OF_MONTH),
	            date.get(GregorianCalendar.YEAR));

	      // Calculate the birthday of Edsger Wybe Dijkstra
	      // Born May 11, 1930
	      date = new GregorianCalendar(1930, GregorianCalendar.MAY, 11);

	      System.out.printf("Edsger Wybe Dijkstra was born on a %s\n",
	            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)));

	      // Calculate the date 10,000 days from Dujkstra's birthday
	      date.add(GregorianCalendar.DAY_OF_MONTH, 10000);
	      System.out.printf(
	            "10,000 days from Dijkstra's birthday is %s %s %d, %d\n",
	            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)),
	            getMonth(date.get(GregorianCalendar.MONTH)),
	            date.get(GregorianCalendar.DAY_OF_MONTH),
	            date.get(GregorianCalendar.YEAR));

	}	

	public static String Number1(String inputVal) {
		String message = "";
		for (int x = 0; x<inputVal.length();x++) {
			if (inputVal.substring(x,x+1).equals(" ") == false) {
				message += inputVal.substring(x,x+1);
			}
		}
		return message;
	}
	
	public static double AreaTester(int x, int y, int width, int height) {
		double returnVal = 0;
		Rectangle rect = new Rectangle(x,y,width,height);
		returnVal = rect.getHeight() * rect.getWidth();
		return returnVal;
	}

	public static String ReplaceTester(String inputVal) {
		String returnVal = "";
		for (int x = 0; x<inputVal.length();x++) {
			if (inputVal.substring(x,x+1).equals("i")) {
				returnVal += "!";
			}
			else if (inputVal.substring(x,x+1).equals("s")) {
				returnVal += "$";
			}
			else {
				returnVal += inputVal.substring(x,x+1);
			}
		}
		return returnVal;
	}

	public static int DieSimulator() {
		int returnVal = 0;
		Random rand = new Random();
		returnVal = rand.nextInt(6) +1;
		return returnVal;
	}

	public static String appendString(String str1, String str2) {
		String newStr = "";
		str1.toUpperCase();
		for (int x = 0; x<str1.length();x++) {
			if (str1.substring(x,x+1).equals("A")) {
				newStr += str2;
				x++;
			}
			else {
				newStr +=str1.substring(x,x+1);
			}
		}
		return newStr;
	}

	public static String appendString(String str1, String str2, String str3) {
		if (str1.contains(str2)) {
			str1 = str1.replace(str2, str3);
		}
		return str1;
	}
	
	private static String getWeekday(int day_of_week)
	   {
	      String day = "";

	      switch (day_of_week)
	      {
	         case (GregorianCalendar.SUNDAY):
	            day = "Sunday";
	            break;
	         case (GregorianCalendar.MONDAY):
	            day = "Monday";
	            break;
	         case (GregorianCalendar.TUESDAY):
	            day = "Tuesday";
	            break;
	         case (GregorianCalendar.WEDNESDAY):
	            day = "Wednesday";
	            break;
	         case (GregorianCalendar.THURSDAY):
	            day = "Thursday";
	            break;
	         case (GregorianCalendar.FRIDAY):
	            day = "Friday";
	            break;
	         case (GregorianCalendar.SATURDAY):
	            day = "Saturday";
	            break;
	      }

	      return day;
	   }

	   /**
	    * Returns the string of GregorianCalendar MONTH
	    */
	private static String getMonth(int month)
	   {
	      String monthStr = "";

	      switch (month)
	      {
	         case (GregorianCalendar.JANUARY):
	            monthStr = "January";
	            break;
	         case (GregorianCalendar.FEBRUARY):
	            monthStr = "February";
	            break;
	         case (GregorianCalendar.MARCH):
	            monthStr = "March";
	            break;
	         case (GregorianCalendar.APRIL):
	            monthStr = "April";
	            break;
	         case (GregorianCalendar.MAY):
	            monthStr = "May";
	            break;
	         case (GregorianCalendar.JUNE):
	            monthStr = "June";
	            break;
	         case (GregorianCalendar.JULY):
	            monthStr = "July";
	            break;
	         case (GregorianCalendar.AUGUST):
	            monthStr = "August";
	            break;
	         case (GregorianCalendar.SEPTEMBER):
	            monthStr = "September";
	            break;
	         case (GregorianCalendar.OCTOBER):
	            monthStr = "October";
	            break;
	         case (GregorianCalendar.NOVEMBER):
	            monthStr = "November";
	            break;
	         case (GregorianCalendar.DECEMBER):
	            monthStr = "December";
	            break;
	      }

	      return monthStr;
	   }
	}



