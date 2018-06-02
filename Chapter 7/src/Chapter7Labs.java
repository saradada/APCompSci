import java.util.ArrayList;

public class Chapter7Labs {

	public static void main(String[] args) {
		// NUMBER 1
		int[] x = {8,4,5,21,7,9,18,2,100};
		int sum = 0;
		for (int i: x) {
			sum+=i;
		}
		System.out.println("sum: " +sum);
		int sum2 = 0;
		for (int i = 0; i<x.length;i++) {
			sum2+=x[i];
		}
		System.out.println("sum 2: "+ sum2);
		int minVal = x[0];
		int minIndex = 0;
		for (int y = 0; y<x.length;y++){
			if (y<minVal) {
				minVal = x[y];
				minIndex =y; 
			}
		}
		System.out.println("min val: "+minVal +"\nmin index: "+minIndex);
		
		//NUMBER 2
		ArrayList<String> names = new ArrayList<String>();
	    System.out.println(names);
	    names.add("Alice");
	    names.add("Bob");
	    names.add("Connie");
	    names.add("David");
	    names.add("Edward");
	    names.add("Fran");
	    names.add("Gomez");
	    names.add("Harry");
	    System.out.println(names);
	    System.out.println("First name: "+names.get(0)+"\nLast name: "+ names.get(names.size() -1));
	    System.out.println("Size: "+ names.size());
	    names.set(0, "Alice B. Toklas");
	    names.add(4, "Doug");
	    System.out.println(names);
	    for (String i: names) {
	    	System.out.print(i +", ");
	    }
	    System.out.println();
	    ArrayList<ArrayList> names2 = new ArrayList<ArrayList>();
	    names2.add(names);
	    System.out.println(names2);
	    names.remove(0);
	    System.out.println(names);
	    System.out.println(names2);
	}

}
