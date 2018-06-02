
public class Array2DPartA {
	public static void main(String[] args) {
		String[][] people = {
				{"Aaron", "Brandy", "Ken","Greg", "David", "Jason"},
				{"Steve", "Carol", "Kim", "Nicole"},
				{"Arani", "Christopher", "David", "Erik"}
		};
		String[] titles = {"Friends", "Family", "Students"};
		for(int arrayIndex=0; arrayIndex<people.length; arrayIndex++){
			System.out.println(titles[arrayIndex]+":");
			for(int i=0; i< people[arrayIndex].length; i++){
				System.out.println("["+i+"]="+people[arrayIndex][i]);	
			}
		}
	}
}
