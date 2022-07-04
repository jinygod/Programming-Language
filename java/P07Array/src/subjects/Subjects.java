package subjects;

public class Subjects {
	public static int MAX_SUBJECTS = 5;   // 총 과목 수 
	
	private String name;  // 학생이름
	//Subject[] subjects = new Subject[MAX_SUBJECTS]; // 점수(5과목)
	private Subject[] subjects;
	
	private Subjects() {
		subjects = new Subject[MAX_SUBJECTS];
	}
	
	private Subjects(String name){
		this(); //내 생성자를 호출해라. 
		this.name = name;
	}
	
	public static Subjects createInstance(String name) {
		return new Subjects(name);
	}
	
	public String getName() {
		return this.name;
	}
	Subject getSubject(int index) {
		return subjects[index];
	}
	
	public void setSubject(int index, Subject subject) {
		subjects[index] = subject;
	}
	
	public int total() {
		int tot = 0;
		for(Subject subject : subjects) {
			tot += subject.getScore();
		}
		return tot;
	}
	public float average() {
		return total() / subjects.length;
		
	}
}
