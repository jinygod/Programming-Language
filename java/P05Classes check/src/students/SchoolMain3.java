package students;

public class SchoolMain3 {
	

	public static void main(String[] args) {
		School s1 = new School(2022042701, "서울고", 1958, "서울", "02");
		s1.setStudent(new Student(1234, "홍길동", 4, "한양", true));
		schoolInfo(s1);
		School s2 = new School(2021042701, "서고", 195, "경기", "031");
		s2.setStudent(new Student(1414, "울고", 120, "순신", true));
		schoolInfo(s2);

	}
	
	static void schoolInfo(School school) {

		System.out.println("-----[학교정보]-----");
		System.out.println("\t code: " + school.getCode());
		System.out.println("\t name: " + school.getName());
		System.out.println("\t year: " + school.getYear());
		System.out.println("\t address: " + school.getAddress());
		System.out.println("\t tel: " + school.getTel());
		
		Student student = school.getStudent();
		if(student == null) {
			System.out.println("학생정보가 없습니다.");
		}
		else {
		student.printStudent();
	}
}
}