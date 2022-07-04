/*
 * 반복문: do~while
 * --------------------------------
 * do {
 * 		실행문
 * } while(조건식);
 * --------------------------------
 * 1. 블럭을 최소 한 번 실행
 * 2. 조건식 판단
 * 3. 조건식이 만족하면 즉 참이면 다시 블럭을 실행
 * 4. 조건이 만족하지 않을 때까지 블럭을 실행
 */
package dowhilestmt;

public class DoWhileStmt03 {

	public static void main(String[] args) {
		final int MAX_CNT = 10;
		int cnt=1;
		int sum=0;
		
		do {
			sum += cnt;
		} while(cnt++ < MAX_CNT);
			
			System.out.printf("1부터 (%d)까지의 합은? %d", MAX_CNT, sum);

	}

}
