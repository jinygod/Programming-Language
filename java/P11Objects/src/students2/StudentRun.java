package students2;

public class StudentRun {

	public static void main(String[] args) {
		System.out.println("[Student]");
		
		Student s1 = new Student("007","제임스본드");
		Student s2 = new Student("007","제임스본드");
		Student s1a = s1; // 주소를 서로 참조(공유)
		Student s2a = s2;
		
		// s1과 s2는 다른 객체이므로 같지 않다. 결과는 false
		System.out.println("s1 == s2 ?" + (s1 == s2));
		
		System.out.println("s1 == s2 ?" + (s1 == s1a));
		System.out.println("s1 == s2 ?" + (s2 == s2a));
		
	}

}
