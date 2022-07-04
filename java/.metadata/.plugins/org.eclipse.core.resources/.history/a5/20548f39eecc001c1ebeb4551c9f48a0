package students3;

public class StudentRun {

	public static void main(String[] args) {
		System.out.println("[Student]");
		
		Student s1 = new Student("007","제임스본드");
		Student s2 = new Student("007","제임스본드");
		Student s3 = s1; // 주소를 서로 참조(공유)
		
		// s1과 s2는 다른 객체이므로 같지 않다. 결과는 false
		
		boolean s12 = s1.equals(s2);
		boolean s13 = s1.equals(s3);
		System.out.println("s1.equals(s2) ?" + s12);
		System.out.println("s1.equals(s3) ?" + s13);
		
	}

}
