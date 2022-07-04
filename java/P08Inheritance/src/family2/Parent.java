package family2;

public class Parent {
	int asset;
	int money;

	Parent(){
		System.out.println("Parent()");
		this.asset = 100;
		this.money = 200;
	}

	Parent(int asset, int money) {
		System.out.printf("Parent(asset:%d, money:%d)\n", asset, money);
		this.asset = asset;
		this.money = money;
	}
	
	void print() {
		System.out.printf("Parent: asset(%d), money(%d)\n", this.asset, this.money);
	}
}
