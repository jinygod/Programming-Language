package people;

public class Brother extends Man {
	
	Brother() {
		super("사냥꾼", 180, 80, 24);
		huntLevel(HUNT_LEVEL_HIGH);

	}

	@Override
	public void speak() {
		System.out.println("[Brother] 말한다.");
	}

	@Override
	public void walk() {
		System.out.println("[Brother] 걷는다.");
		
	}

	@Override
	public void run() {
		System.out.println("[Brother] 달린다.");
		
	}

	@Override
	public void work() {
		System.out.println("[Brother] 일한다.");
		
	}

	@Override
	public void hunt() {
		System.out.println("[Brother] 사냥한다.");
		
	}
	
	public void state() {
		System.out.println("이름: "+ this.name);
		System.out.println("사냥레벨: "+ this.huntLevel());
		
	}

}
