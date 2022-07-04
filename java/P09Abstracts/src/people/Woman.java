package people;

public class Woman extends People {
	public static final int PREGNANCY_AGE = 18; // 임신가능연령
	public static final int PREGNANCY_MAX = 10; // 출산개월수
	int pregnancy; // 임신유무, 임신개월수(0이면 임신하지 않음)
	
	public Woman() {
		
	}
	
	public Woman(String name) {
		super(name);
	}

	final boolean agePregnancy() {  // 임신가능유무
		return this.age >= PREGNANCY_AGE;
	}
	
	int childbirth(int monthcount) {
		this.pregnancy += monthcount;
		if(this.pregnancy > 0 && this.pregnancy < PREGNANCY_MAX) {
		
		System.out.printf("[woman]%s(은)는 임신 %d개월이며 출산예정일이 아닙니다.\n", this.name, this.pregnancy);
		
		return this.pregnancy;
		}
		if(this.pregnancy >= PREGNANCY_MAX) {

		System.out.printf("[woman], 산모(%s)는 출산을 축하합니다.\n", this.name);
	}
		System.out.printf("[woman](%s)(은)는 임신하지 않았습니다.\n", this.name);
		return this.pregnancy;
	}
	

	@Override
	public void speak() {
		System.out.println("[Woman] 말한다.");
	}

	@Override
	public void walk() {
		System.out.println("[Woman] 걷는다.");
		
	}

	@Override
	public void run() {
		System.out.println("[Woman] 달린다.");
		
	}

	@Override
	public void work() {
		System.out.println("[Woman] 일한다.");
		
	}


}
