package students3;

public class StudentRun3 {

	public static void main(String[] args) {
		System.out.println("[Student]");
		
		Student s1 = new Student("007","제임스본드");
		Student s2 = new Student(s1);
		Student s3 = s1; // 주소를 서로 참조(공유)
		
		// s1과 s2는 다른 객체이므로 같지 않다. 결과는 false
		
		System.out.println("[s1] " + s1);
		System.out.println("[s2] " + s2);
		System.out.println("[s3] " + s3);
		
		System.out.println("s1 == s3 ? " + (s1 == s3));
		System.out.println("s2 == s3 ? " + (s2 == s3));
		System.out.println("s1 == s2 ? " + (s1 == s2));

		System.out.println();
		System.out.println("s1.equals(s3) ? " + (s1.equals(s3)));
		System.out.println("s2.equals(s2) ? " + (s2.equals(s2)));
		System.out.println("s1.equals(s2) ? " + (s1.equals(s2)));
		
	}

}
