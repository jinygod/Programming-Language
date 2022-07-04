/*
 * 1. super(...)는 부모 생성자를 호출하며
 *    자식 생성자에서 다른 명령문보다가장 먼저 호출되어야 한다.O_O
 * 2. 자식 생성자에서 명시적으로 부모의 생성자를 호출하지 않으면
 *    부모의 디폴트 생성자가 호출된다.
 * 3. 부모가 디폴트 생성자를 가지고 있지 않은 상태에서
 *    자식 생성자에서 명시적으로 부모의 생성자를 호출하지 않으면 오류
 */
package family2;

public class Child extends Parent {

	public Child() {
		super(); // 부모 생성자를 명시적으로 호출(디폴트 생성자)
		System.out.println("Child()");
	}

	public Child(int asset, int money) {
		super(asset, money); //부모의 생성자를 호출(파라미터가 일치하는 부모 생성자)
		System.out.printf("Child(asset:%d, money:%d)",asset, money);
	}
	
	void sale(int money) {
		this.money += money;
	}
}
