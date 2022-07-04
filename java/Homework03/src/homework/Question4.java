package homework; //4월14일

public class Question4 {

	public static void main(String[] args) {
		int [][] table = new int[11][11];
		
		int min = 1;
		int max = 11;
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table.length; j++) {
				table[i][j] = (int)((Math.random() * (max - min)) + min);
			}
		}
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table.length; j++) {
				table[i][10] += table[i][j];
				table[10][j] += table[i][j];
				table[10][10] += table[i][j];
			}
		}
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table.length; j++) {
				System.out.printf("%5d ", table[i][j]);
			}
			System.out.println();
		}
		
			
	}
}
