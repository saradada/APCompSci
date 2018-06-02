import java.util.Random;

public class SumTables {
	public static void main(String[] args) {
		int rows=5, cols=5;
		int min=1, max=10;
		int[][] table1=fillTable(rows, cols, min, max);
		int[][] table2=fillTable(rows, cols, min, max);
		int[][] sumTable=sumTables(table1, table2);
		outputTable("Table 1", table1);
		outputTable("Table 2", table2);
		outputTable("Sum of Table 1 and Table 2", sumTable);
	}

	private static void outputTable(String string, int[][] table1) {
		System.out.println(string);
		System.out.print("\t");
		for (int col=0; col<table1[0].length;col++) {
			System.out.print(col+"\t"); 
		}
		System.out.println();
		for(int row=0; row<table1.length; row++) {
			System.out.print(row+"\t");
			for(int col=0; col<table1[0].length; col++) {
				System.out.print(table1[row][col]+"\t"); 
			}
			System.out.println(); 
		}
	}

	private static int[][] sumTables(int[][] table1, int[][] table2) {
		int[][] returnVal = new int[table1.length][table2.length];
		for(int r=0; r<returnVal.length; r++) {
			for(int c=0; c<returnVal[0].length; c++) {
				returnVal[r][c] = table1[r][c]+table2[r][c];
			}
		}
		return returnVal;
	}

	private static int[][] fillTable(int rows, int cols, int min, int max) {
		int[][] returnVal = new int[rows][cols];
		Random rand = new Random();
		for(int r=0; r<returnVal.length; r++) {
			for(int c=0; c<returnVal[0].length; c++) {
				returnVal[r][c] = rand.nextInt(max)+min;
			}
		}
		return returnVal;
	}
}