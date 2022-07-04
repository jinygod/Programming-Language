package students;

public class School {
	private int code;
	private String name;
	private int year;
	private String address;
	private String tel;
	private Student student; //학생정보
	
	public School() {
		
	}
	
	public School(int code, String name, int year, String address, String tel) {
		this.code = code;
		this.name = name;
		this.year = year;
		this.address = address;
		this.tel = tel;
	}

	public Student getStudent() {
		return this.student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCode() {
		return this.code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}


	}
