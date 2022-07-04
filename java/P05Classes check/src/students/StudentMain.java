package students;

public class StudentMain {

	public static void main(String[] args) {
		int id;
		//System.out.println("local id : " + id);
		Student student = new Student();
		
		student.id = 220406001;
		student.name = "홍길동";
		student.grade = 1;
		student.address = "깊은 산골";
		student.absence = true;

		System.out.println("[학생정보]");
		System.out.println("id: " + student.id);
		System.out.println("name: " + student.name);
		System.out.println("grade: " + student.grade);
		System.out.println("address: " + student.address);
		System.out.println("absence: " + student.absence);

	}

}
