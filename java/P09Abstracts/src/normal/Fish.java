package normal;

public class Fish extends Animal {
	String name = "물고기";
	
	@Override
	public void swim() {
		System.out.printf("%s는 민물과 바다에서 수영을 한다.\n", name);
		super.swim();
	}
}
