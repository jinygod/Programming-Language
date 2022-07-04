package people;

public class Sister extends Woman{

	Sister(){
		super("아름이");
		this.age = Woman.PREGNANCY_AGE;
	}
	
	void state() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age + "세");
		System.out.println("임신가능?:" + this.agePregnancy());
		System.out.println("임신개월?:" + this.childbirth(0));
		System.out.println("임신개월?:" + this.childbirth(3));
	}
	
}
