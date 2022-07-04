/*
 * if ~ else if
 * 1. 순차적으로 조건식을 물어본 후 조건이 만족할 때까지 단계적으로 아래의 조건식을 물어본다.
 * 2. 조건이 만족하면 다음 단계의 조건식을 물어보지 않고 종료한다.
 * -------------------------------------------
 * [Q] if문을 사용하여 주어진 값의 등급을 지정하라.
 * score(0부터 100까지)
 * 등급:
 * 	- A: 90점 이상
 * 	- B: 80점 이상
 * 	- C: 70점 이상
 * 	- D: 60점 이상
 * 	- E: 60점 미만
 */
package ifstmt;

public class ifStmt10B {

	public static void main(String[] args) {
		int score = 59;
		char grade;
		
		if(score < 60) {
			grade = 'E';
		}
		else if(score <70) {
			grade = 'D';
		}
		else if(score <80) {
			grade = 'C';
		}
		else if(score <90) {
			grade = 'B';
		}
		else {
			grade = 'A';
		}
		System.out.printf("점수는 (%d)점이며, 등급은 (%c)입니다.%n", score, grade);
				
	}
}

