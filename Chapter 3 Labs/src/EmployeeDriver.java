// creates three Employee classes, initializes them, stores them in an array, and prints out the contents of the array

import java.util.Scanner;
public class EmployeeDriver {

	public static void main(String[] args) {
		// Creates a new array that can hold Employee Objects
		Employee [] employeeArray = new Employee[4];
		//Now create and intialize three Employee classes and
		//add them to the array.
		Date d1 = new Date(10, 6, 2016);
		Address a1 = new Address(1000, "Crow Canyon", "San Ramon", 95555);
		Employee e1 = new Employee(5, d1, a1 );
		
		Employee e2 = new Employee(6, new Date(10, 7, 2016), new Address(2009, "Bowl", "SR", 55555));
		
		employeeArray[0] = e1;
		employeeArray[1] = e2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month you were hired :)");
		int month = scan.nextInt();
		System.out.println("Please enter the day you were hired :)");
		int day = scan.nextInt();
		System.out.println("Please enter the year you were hired :)");
		int year = scan.nextInt();
		
		//Get the user input to do the address
		Employee e3 = new Employee(8, new Date(month, day, year), new Address(1111, "BowAAl", "SDV", 33333));////You do the address) and add e3 to the array
		
		employeeArray[2] = e3;
		
		Employee e4 = new Employee(10, new Date(month, day, year), new Address(12, "Alcosta", "Danville", 94555));
		employeeArray[3] = e4;
		boolean conflict = e3.conflictsWith(e4.getDateOfHire());
		
		System.out.println(conflict);
		
		
		
		for(int i=0;i<employeeArray.length;i++){
			Employee e = employeeArray[i];
			int eID = e.getEmployeeID();
			Date d = e.getDateOfHire();
			Address a = e.getAddress();
			System.out.println("Date "+d.getMonth()+"\\"+d.getDay()+"\\"+d.getYear());
		}
		
	}

}
