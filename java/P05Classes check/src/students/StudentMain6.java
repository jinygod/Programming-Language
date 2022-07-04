package students;

public class StudentMain6 {

	public static void main(String[] args) {
		Student student = new Student(); // 기본생성자를 통해서 객체를 생성
		student.id = 220406001;
		student.name = "홍길동";
		// student.grade = 1;
		student.address = "한양";
		student.absence = true;
		
		Student student2 = new Student(220406002, "전우치", 2, "산골", true);
		
		Student student3 = new Student(220406002, "강감찬", 1, "개성", false);
		
		printStudent(student);
		printStudent(student2);
		printStudent(student3);
	}
	
	// 정적(static) 메소드: 클래스 메소드
	// 클래스가 객체화 되지 않아도 호출 가능
	static void printStudent(Student student) {
		System.out.println("-----[학생정보]-----");
		System.out.println("\t this: " + student);
		System.out.println("\t id: " + student.id);
		System.out.println("\t name: " + student.name);
		System.out.println("\t grade: " + student.grade);
		System.out.println("\t address: " + student.address);
		System.out.println("\t absence: " + student.absence);
	}
}
