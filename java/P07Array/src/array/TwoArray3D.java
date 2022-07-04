/*
 * 2차원 배열: 계단식 배열 생성
 *  - m은 1부터 10까지 1씩 증가
 *  - n은 1부터 m까지 1씩 증가
 *  - 배열(m*n)을 만들어서 곱(m*n)값을 넣고 출력
 *  - 각 배열의 행(m)은 n만큼의 열을 만들어라.
 *  - 1행 1열, 2행 2열, 3행 3열
 */
package array;

public class TwoArray3D { 
	final static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		int[][] table = new int[MAX_NUMBER][];  //★★★열을 미리 만들지 않음
		
		for(int m = 1; m <= MAX_NUMBER; m++) {
		
			table[m-1] = new int[m]; // ★열을 동적으로 생성(행의 값만큼)
			
			for(int n = 1; n <= m; n++) {
				int mn = m * n;
				table[m-1][n-1] = mn;
			}
		}
		
		for(int m = 0; m < table.length; m++) { // 행
			for(int n = 0; n < table[m].length; n++) { // 열
				int mn = table[m][n];
				System.out.printf("m[%2d], n[%2d] : [%2d]", m+1, n+1, mn);
				for(int star=0; star < mn; star++) { //배열의 요소의 값만큼 "*" 출력
					System.out.print("*");
			}
					System.out.println();
		}
		System.out.println();

		}
	}
}
