package normal;

public class AnimalRun {

	public static void main(String[] args) {
		action(new Bird());
		action(new Fish());
	}

	static void action(Bird bird) {
		bird.fly();
	}
	
	static void action(Fish fish) {
		fish.swim();
	}

}
