package warmups;

import java.util.Random;

public class Warmups {
	public static void main(String[] args) {
		doSomething();
	}
	
	private int[] arr;
 	//Precondition: arr contains at least one element.
 	public static void doSomething()
 	{
	int[] arr = {3, 5, 6, 9, 12,}; 
          	int sum1 = 0;
          	int sum2 = 0;
          	for (int num : arr)
          	{
                   	if (num > 0 || Math.abs(num) % 2 != 0)
                            	sum1 += num;
                   	else if (num < 0 && Math.abs(num) % 2 == 0)
                            	sum2 += num;
          	}
          	System.out.println(sum1);
          	System.out.println(sum2);
 	}
}
