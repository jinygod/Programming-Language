package family;

public class Child extends Parent {
	int money;
	
	public Child() {
		this.asset += 99;
		this.money = super.money; // 부모의 속성값을 물려 받음
	}
	
	void sale(int money) {
		this.money += money;
	}
}
