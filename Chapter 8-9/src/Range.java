
public class Range implements NumberGroup {
	private int[] values;
	public Range(int min, int max) {
		values = new int[max-min];
		int tempMin = min;
		for (int i = 0; i<=max-min; i++) {
			values[i] = tempMin;
			tempMin++;
		}
	}
	@Override
	public boolean contains(int number) {
		// TODO Auto-generated method stub
		return false;
	}
}
