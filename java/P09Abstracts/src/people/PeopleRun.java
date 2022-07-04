package people;

public class PeopleRun {

	public static void main(String[] args) {
		//People people = new People();
		
		Woman woman = new Woman();
		//얘는 Override로 다 구현해놔서 추상클래스가 아니라서 가능하당
		
		//Man man = new Man();
		//추상클래스는 new를 할 수 없당
		
		woman.speak();
		woman.walk();
		woman.run();
		woman.work();
		
		Sister sister = new Sister();
		
		sister.speak();
		sister.walk();
		sister.run();
		sister.work();
		
		Brother brother = new Brother();
		
		brother.speak();
		brother.walk();
		brother.run();
		brother.work();
		brother.hunt();
	}

	

}
