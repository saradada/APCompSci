public class Student {
	private String name;
	private double totalScore;
	private int quizCount;
	
	/** Constructor initialize the variables */
	public Student (String n){  //Student myNewStudent = new Student("Robert");
		name = n;
		totalScore = 0;
		quizCount = 0;
	}
   
	public String getName(){
		return name;
	}
	public void addQuiz(double score){
		totalScore = totalScore + score;
		quizCount = quizCount + 1;
	}
	public double getTotalScore(){
		return totalScore;
	}
	public double getAverageScore(){
		return totalScore/quizCount;
	}
}

