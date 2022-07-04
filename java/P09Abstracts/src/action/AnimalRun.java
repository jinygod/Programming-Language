package action;

public class AnimalRun {

	public static void main(String[] args) {
		action(new Bird());
		action(new Fish());
		
		//action(new Animal()); 
		//Cannot instantiate the type Animal
	}

	static void action(Animal animal) {
		animal.move();
	}
	/*
	static void action(Bird bird) {
		bird.fly();
	}
	
	static void action(Fish fish) {
		fish.swim();
	}
*/
}
