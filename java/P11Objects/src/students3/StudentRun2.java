package students3;

public class StudentRun2 {

	public static void main(String[] args) {
		System.out.println("[Student]");
		
		Student s1 = new Student("008","제임스본드");
		Student s2 = new Student("007","제임스본드");
		Student s3 = s1;		

		boolean s12 = s1.equals(s2);
		boolean s13 = s1.equals(s3);
		System.out.println("*s1.equals(s2) ? " + s12);
		System.out.println("*s1.equals(s3) ? " + s13);
		
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s1 == s3 ? " + (s1 == s3));
		
		System.out.println();
		System.out.println("[String]");
		
		// 문자열이 있는 상수 풀(constant pool)을 공유
		String j1 = "제임스본드";
		String j2 = "제임스본드";
		
		String j3 = new String(j1);
		String j4 = new String("제임스본드");
		String j5 = j1;

		System.out.printf("j1[%s] j1 == j2 ? %b\n", j1, (j1 == j2));
		System.out.printf("j3[%s] j1 == j3 ? %b\n", j3, (j1 == j3));
		System.out.printf("j4[%s] j1 == j4 ? %b\n", j4, (j1 == j4));
		System.out.printf("j4[%s] j3 == j4 ? %b\n", j4, (j3 == j4));
		System.out.printf("j5[%s] j1 == j5 ? %b\n", j5, (j1 == j5));
		
		System.out.println();
		System.out.println("[문자열은 equals로 비교하면 값으로 비교]");
		System.out.printf("j3[%s] j1.equlas(j3) == j3 ? %b\n", j3, (j1.equals(j3)));
		System.out.printf("j4[%s] j1.equals(j4) j4 ? %b\n", j4, (j1.equals(j4)));
		
		j5 = "로저무어";
		System.out.printf("j1[%s], j5[%s] j1 == j5 ? %b\n",j1,  j5, (j1 == j5));
		
		String j6 = j3;
		System.out.printf("j6[%s] j3 == j6 ? %b\n", j6, (j3 == j6));
		
		j6 = "숀코네리";
		System.out.printf("j6[%s] j3 == j6 ? %b\n", j6, (j3 == j6));
		
	}
	
}
