// value object (container 역할)
package subjects;  

public class Subject {
	private String subject;
	private int score;
	
	public Subject(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
