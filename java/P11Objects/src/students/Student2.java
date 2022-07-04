package students;

public class Student2 {
	public String id;
	public String name;
	
	public Student2() {}
	public Student2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = String.format("[%s]: id = %s, name = %s", super.toString(), this.id, this.name);
		return str;
	}
}
