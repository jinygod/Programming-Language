/*
 * 반복문: while
 * while(조건식) {
 * 		실행문
 * }
 * ------------------------------------
 * 1. 조건식이 만족하는 동안 실행문 반복해서 실행된다.
 * 2. 조건식이 참(ture)이면 루프문이 실행된다.
 * 3. 조건식의 결과는 boolean(true, false)
 */
package whilestmt;

public class WhileStmt01C {

	public static void main(String[] args) {
		int cnt = 0;
		
		//while(tf) { // 무한반복
		while(true) {
			if(cnt >= 1000000) {
				break; // 반복문을 탈출
			}
			System.out.println("cnt = " + cnt++);
		}
		System.out.println("작업완료");
	}
}
