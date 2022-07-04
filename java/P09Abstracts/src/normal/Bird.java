package normal;

public class Bird extends Animal {
	String name = "앵무새";
	
	@Override
	public void fly() {
		System.out.printf("%s는 사람의 목소리를 흉내낸다.\n", name);
		super.fly();
	}
}
