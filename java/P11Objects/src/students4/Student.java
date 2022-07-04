package students4;

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
		this.name = student.name;
	}
	
	@Override
	public String toString() {
		String str = String.format("[%s]: hashcode=%s, id = %s, name = %s",
				super.toString(),
				Integer.toHexString(this.hashCode()),
				this.id, this.name);
		return str;
	}
	/*
	 * return : true(같다), false(같지 않다)
	 * 문자열의 값이 같은지 비교하기 위해서는 String.equals()를 사용
	 * 해시코드가 같고 객체의 속성값이 같아야 같은 객체로 처리
	 * 그러므로 hashCode() 메소드를 재정의 하여야 한다.
	 * 	public int hashCode() {
		return this.id.hashCode();
	    }
	 */

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if(this.hashCode() == obj.hashCode()) {
			Student student = (Student)obj;
			if(this.id.equals(student.id) && this.name.equals(student.name)) {
				return true;
				}
			}
		}
		return false;
	}
	/*
	 * 해시코드가 다르더라도 객체의 속성값이 같으면 동일한 객체로 처리
	 */
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
}
