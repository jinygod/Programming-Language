/*
 * 메소드 오버로딩(overloading)
 * 	- 같은 클래스에서 메소드의 이름이 동일
 * 	- 파라미터가 다름(갯수나 타입이 같지 않음)
 * 	- 사용의 편의성: 같은 기능을 하는 메소드의 이름 다르게 지정하기 보다는
 *    동일한 이름으로 하여 파라미터에 따라서 해당하는 메소드가 호출됨
 */
package family4;

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
		System.out.printf("[Parent] print: asset(%d), money(%d)\n", this.asset, this.money);
	}
	
	/*
	 * 메소드 오버로딩에서 리턴타입은 관계없다.
	 * 리턴타입이 다르더라도 파라미터가 같으면 동일한 메소드로 본다.
	 * int print(){
	 * return 10;
	 */
	void print(String title) {
		System.out.printf("[Parent] print(%s): asset(%d), money(%d)\n",title,  this.asset, this.money);
	}
}
