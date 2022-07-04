package action2;

public class AnimalRun {

	public static void main(String[] args) {
		action(new Bird());
		action(new Fish());

	}

	static void action(Animal animal) {
		specify(animal);
		animal.move();
	}

	static void specify(Animal animal) {
		System.out.println("[동물의 공통적인 특징]");
		lifecycle(animal);
		animal.breathe();
	}
	
	static void lifecycle(Animal animal) {
		System.out.println("[동물의 삶]");
		animal.lifecycle();
	}
	
}
