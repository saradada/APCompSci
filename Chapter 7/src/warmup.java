
public class warmup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	
        int[] x = {3, 4, 2, 1, 8};
        increase(x);

        int[] y = {7, 6, 3, 2, 8};
        increase(y[0]);

        System.out.println(x[0] + " " + y[0]);
    }

    public static void increase(int[] x) {
        for (int i = 0; i < x.length; i++)
            x[i]++;
    }

    public static void increase(int y) {
        y++;
    }

}
