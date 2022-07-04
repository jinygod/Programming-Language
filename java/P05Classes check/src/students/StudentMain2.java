package students;

public class StudentMain2 {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();

		student.id = 220406001;
		student.name = "홍길동";
		student.grade = 1;
		student.address = "한양";
		student.absence = true;
		
		student2.id = 220406001;
		student2.name = "홍길동";
		student2.grade = 1;
		student2.address = "한양";
		student2.absence = true;
		
		System.out.println("student == student2 ?" + (student == student2));
		
		
		System.out.println("[학생정보] student");
		System.out.println("id: " + student.id);
		System.out.println("name: " + student.name);
		System.out.println("grade: " + student.grade);
		System.out.println("address: " + student.address);
		System.out.println("absence: " + student.absence);

		System.out.println("[학생정보] student2");
		System.out.println("id: " + student2.id);
		System.out.println("name: " + student2.name);
		System.out.println("grade: " + student2.grade);
		System.out.println("address: " + student2.address);
		System.out.println("absence: " + student2.absence);

	}

}
