import java.util.List;

public class SeatingChart {
	private Student[][] seats;
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		int index = 0;
		for (int c = 0; c<seats[0].length; c++) {
			for (int r = 0; r< seats.length; r++) {
				seats[r][c] = studentList.get(index);
				index++;
			}
		}
	}
	public int removeAbsentStudents(int allowedAbsences) {
		int total = 0;
		for (int c = 0; c<seats[0].length; c++) {
			for (int r = 0; r< seats.length; r++) {
				Student current = seats[r][c];
				if (current.getAbsenceCount() > allowedAbsences) {
					seats[r][c] = null;
					total++;
				}
			}
		}
		return total;
	}
}
