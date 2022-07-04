/*
 * Math.random() : 0.0 ~ 1.0 사이의 값을 생성
 * ------------------------------------------
 * 0부터 100까지의 점수를 난수 발생
 * 경우의 수 : 101가지, 0,1~100
 * 공식 : (int)(난수 * (최대값 - 최소값 + 1)) + 최소값
 * 점수 = (int)(Math.random() * (MAX_SCORE - MIN_SCORE + 1)) + MIN_SCORE;
 */
package subjects;

public class SubjectsMain {
	final static int MIN_SCORE = 0;
	final static int MAX_SCORE = 100;
	final static String[] SUB_LIST = { "국어", "영어", "수학", "과학", "교양" };

	public static void main(String[] args) {
		Subjects 홍길동 = Subjects.createInstance("홍길동");
		Subjects 이순신 = Subjects.createInstance("이순신");
		// Subjects 전우치 = new Subjects("전우치"); private으로 막아놔서 안됨
		//대신 createInstance 라는 static method 를 열어두었음.
		
		genSubject(홍길동);
		genSubject(이순신);
		
		infoSubject(홍길동);
		infoSubject(이순신);
		
	}
	static void genSubject(Subjects subject) {
		for(int index=0; index < Subjects.MAX_SUBJECTS; index++) {
			int score = (int)(Math.random() * (MAX_SCORE - MIN_SCORE + 1) + MIN_SCORE);
			subject.setSubject(index, new Subject(SUB_LIST[index], score));
	}
}

	static void infoSubject(Subjects subjects) {
		System.out.printf("[성적처리] %s\n" , subjects.getName());
		for(int index=0; index < Subjects.MAX_SUBJECTS; index++) {
			Subject subject = subjects.getSubject(index);
			System.out.printf("%s = %d\n" , subject.getSubject(), subject.getScore());
		}
		
		System.out.printf("----------------------\n");
		System.out.printf("총점: %d%n", subjects.total());
		System.out.printf("평균: %2f%n", subjects.average());
		System.out.printf("----------------------\n");
		
	}
}
