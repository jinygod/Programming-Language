/*
 * [문제]
 * 		- 국어, 영어, 수학, 과학, 역사, 교양
 * 		- 점수는 0부터 100까지
 * 		- 각 과목의 점수를 배열에 넣어라
 * 		- 총점과 평균을 구하라
 */
package array.exercises;

public class IntArrayExercise {

	public static void main(String[] args) {
		String[] subjects = { "국어", "영어", "수학", "과학", "역사", "교양" };
		int[] subscores = { 60, 70, 80, 90, 100, 50 };
		float total = 0.0f, avg = 0.0f;
		
		System.out.println("[성적처리]");
		
		for(int index = 0; index < subjects.length; index++) {
			String subject = subjects[index];
			int score = subscores[index];
			total += score;
			System.out.printf("%s: %d%n", subject, score);
		}
		
		avg = total / subscores.length;
		
		System.out.println();
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}
}