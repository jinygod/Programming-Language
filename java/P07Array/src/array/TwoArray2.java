/*
 * 2차원 배열
 */
package array;

public class TwoArray2 { // {0}을 낭비함.귀찮아도 이따구로 코드쓰지마셈

	public static void main(String[] args) {
		int[][] gg = new int[10][10];
		
		for(int m = 1; m <= 9; m++) {
			for(int n = 1; n <= 9; n++) {
				int mn = m * n;
				gg[m][n] = mn;
			}
		}

		
		for(int m=1; m<gg.length; m++) {
			System.out.printf("[%d]단%n", m);
			for(int n=1; n< gg[m].length; n++) {
				int mn = gg[m][n];
				System.out.printf("[%d] * [%d] = [%d]%n", m  , n , mn);
			}
			System.out.println("--------------------------------------------------");
		}
	}

}
