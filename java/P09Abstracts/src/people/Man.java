package people;

public abstract class Man extends People {
	public static final int HUNT_LEVEL_LOW = 1;
	public static final int HUNT_LEVEL_MIDDLE = 2;
	public static final int HUNT_LEVEL_HIGH = 3;
	
	int huntlevel; // 사냥레벨
	
	public Man() {}
	
	public Man(String name, int height, int weight, int age) {
		super(name,height,weight,SEX_MAN, age);
	}
	
	final int huntLevel() {
		return huntlevel;
	}
	
	final void huntLevel(int huntlevel) {
		this.huntlevel = huntlevel;
	}
	
	// People
	public abstract void speak();
	public abstract void walk();
	public abstract void run();
	public abstract void work();
	
	public abstract void hunt();

}
