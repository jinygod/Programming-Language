package students2;

public class Student {
	public String id;
	public String name;
	
	public Student() {}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(Student student) {
		this.id = student.id;
		this.name = student.id;
	}
	
	@Override
	public String toString() {
		String str = String.format("[%s]: id = %s, name = %s", super.toString(), this.id, this.name);
		return str;
	}
}
