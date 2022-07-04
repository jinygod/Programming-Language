package students;

public class Student {
	// 멤버 속성(필드)
	int id;         	//학번
	String name;    	//이름
	int grade;      	//학년
	String address; 	//주소	
	boolean absence;	//휴학유무

	//[생성자]
	//클래스가 객체화 될 때 가장 먼저 호출되는 멤버 메소드
	//객체가 생성될 때 초깃값을 지정할 때 활용된다.
	//생성자의 이름은 클래스 이름과 동일해야 한다.
	//생성자는 리턴타입이 없다.(리턴값이 없다)
	//기본생성자: 정의하지 않으면 컴파일러 자동으로 만들어 준다.
	//파라미터를 이용하여 어떤 생성자를 호출할지 정해야 한다.
	//생성자의 파라미터의 순서, 갯수, 타입이 일치하면 호출됨
	Student() { 
		System.out.printf("Student(%s) : 기본생성자%n", this);
		this.grade = 1;
	}

	public Student(int id, String name) {
		System.out.printf("Student(%s) : 생성자(파라미터 갯수 2개)%n", this);
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, int grade, String address, boolean absence) {
		System.out.printf("Student(%s) : 생성자(파라미터 갯수 5개)%n", this);
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.absence = absence;
	}

	//멤버 메소드
	void printStudent() {
		System.out.println("=====[학생정보]=====");
		System.out.println("\t this: " + this);
		System.out.println("\t name: " + this.name);
		System.out.println("\t grade: " + this.grade);
		System.out.println("\t address: " + this.address);
		System.out.println("\t absence: " + this.absence);
 }
	
}