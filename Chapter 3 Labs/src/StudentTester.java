public class StudentTester {

	public static void main(String[] args) {
		Student student = new Student("Bob THe COder");
		student.addQuiz(8);
		student.addQuiz(7);
		student.addQuiz(9);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Total Score: " + student.getTotalScore());
		System.out.println("Average: " + student.getAverageScore());
	}

}

