package people;

public abstract class People {
	public static final int SEX_MAN = 1;	// 남자
	public static final int SEX_WOMAN = 2;  // 여자
	
	String name;
	int height;
	int weight;
	int sex;	// 성별(SEX_MAN, SEX_WOMAN)
	int age;
	
	People(){
	}
	
	People(String name){
		this.name = name;
	}
	
	public People(String name, int height, int weight, int sex, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.age = age;
	}
	
	public abstract void speak();
	public abstract void walk();
	public abstract void run();
	public abstract void work();
}
	
