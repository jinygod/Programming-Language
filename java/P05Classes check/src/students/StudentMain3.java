package students;

public class StudentMain3 {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();

		student.id = 220406001;
		student.name = "홍길동";
		student.grade = 1;
		student.address = "한양";
		student.absence = true;
		
		student2.id = 220406002;
		student2.name = "전우치";
		student2.grade = 2;
		student2.address = "산골";
		student2.absence = true;
		
		printStudent(student);
		printStudent(student2);
	}
	
	// 정적(static) 메소드: 클래스 메소드
	// 클래스가 객체화 되지 않아도 호출 가능
	static void printStudent(Student student) {
		System.out.println("-----[학교정보]-----");
		System.out.println("\t id: " + student.id);
		System.out.println("\t name: " + student.name);
		System.out.println("\t grade: " + student.grade);
		System.out.println("\t address: " + student.address);
		System.out.println("\t absence: " + student.absence);
	}
}
