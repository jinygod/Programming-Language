/*
 * 2차원 배열
 */
package array;

public class TwoArray {

	public static void main(String[] args) {
		int[][] gg = new int[9][9];
		
		for(int m = 1; m <= 9; m++) {
			for(int n = 1; n <= 9; n++) {
				int mn = m * n;
				gg[m-1][n-1] = mn;
			}
		}

		
		for(int m=0; m<gg.length; m++) {
			System.out.printf("[%d]단%n", m+1);
			for(int n=0; n< gg[m].length; n++) {
				int mn = gg[m][n];
				System.out.printf("[%d] * [%d] = [%d]%n", m + 1 , n + 1 , mn);
			}
			System.out.println("--------------------------------------------------");
		}
	}

}
