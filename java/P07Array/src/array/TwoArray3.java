/*
 * 2차원 배열: 계단식 배열 생성
 *  - m은 1부터 10까지 1씩 증가
 *  - n은 1부터 m까지 1씩 증가
 *  - 배열(m*n)을 만들어서 곱(m*n)값을 넣고 출력
 *  - 각 배열의 행(m)은 n만큼의 열을 만들어라.
 *  - 1행 1열, 2행 2열, 3행 3열
 */
package array;

public class TwoArray3 { 
	final static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		int[][] table = new int[MAX_NUMBER][MAX_NUMBER];
		
		for(int m = 1; m <= MAX_NUMBER; m++) {
			for(int n = 1; n <= m; n++) {
				int mn = m * n;
				table[m-1][n-1] = mn;
			}
		}
		
		for(int m = 0; m < table.length; m++) {
			System.out.printf("m[%2d]: " , m + 1);
			for(int n = 1; n < table[m].length; n++) {
				int mn = table[m][n];
				System.out.printf("[%3d]", mn);
			}
				System.out.println();
	}

}
}
