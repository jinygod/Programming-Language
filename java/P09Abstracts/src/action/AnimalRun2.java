package action;

public class AnimalRun2 {

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
		animal.breathe();
	}
	
}
