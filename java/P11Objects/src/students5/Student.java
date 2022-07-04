/*
 * 클론(clone) : 객체 복제
 * 	- 새로운 객체를 생성하여 원본의 속성값을 똑같이 복제한다.
 * 	- 복제된 새로운 객체는 값은 같지만 원본 객체와는 다른 독립적인 객체이다.
 * 	- 메소드 : clone()을 사용하기 위해서는 Cloneable 인터페이스를 implements해야 한다.
 *  - Interface Cloneable은 추상메소드가 없으므로 재정의할 메소드가 없다.
 *  - 그러므로 Implements Cloneable 만 하면 된다.
 *  - clone()을 쓰는 위치에서 CloneNotSupportedException 예외처리를 해야한다.
 * ---------------------------------------------------------------------
 *  public interface Cloneable {
 *  } 
 */
package students5;

public class Student implements Cloneable {
	public String id;
	public String name;
	public int age;
	
	public Student() {}
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(Student student) {
		this.id = student.id;
		this.name = student.name;
		this.age = student.age;
	}
	
	public static Student cloneStudent(Student student) throws CloneNotSupportedException {
		return (Student)student.clone();
	}
	
	@Override
	public String toString() {
		String str = String.format("[%s]: hashcode=%s, id = %s, name = %s, age= %d",
				super.toString(),
				Integer.toHexString(this.hashCode()),
				this.id, this.name, this.age);
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
			if(this.id.equals(student.id) && this.name.equals(student.name) && this.age == student.age) {
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
