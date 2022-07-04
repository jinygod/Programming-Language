package students4;

public class StudentRun {

	public static void main(String[] args) {
		System.out.println("[Student]");
		
		Student s1 = new Student("007","제임스본드");
		Student s2 = new Student(s1);
		Student s3 = s1; 
		
		System.out.printf("[s1] %s, %s \n" , s1, s1.hashCode());
		System.out.printf("[s2] %s, %s \n" , s2, s2.hashCode());
		System.out.printf("[s3] %s, %s \n" , s3, s3.hashCode());
		
		System.out.println("[인스턴스로 비교] 메모리 생성 위치");
		System.out.println("s1 == s3 ? " + (s1 == s3));
		System.out.println("s2 == s3 ? " + (s2 == s3));
		System.out.println("s1 == s2 ? " + (s1 == s2));

		System.out.println();
		System.out.println("[객체가 가지고 있는 값으로 비교]");
		System.out.println("s1.equals(s3) ? " + (s1.equals(s3)));
		System.out.println("s2.equals(s2) ? " + (s2.equals(s2)));
		System.out.println("s1.equals(s2) ? " + (s1.equals(s2)));
		
	}

}
