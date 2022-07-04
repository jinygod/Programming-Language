/*
 * super(...)
 *  - super(...)는 부모 생성자를 호출하며
 *    자식 생성자에서 다른 명령문보다가장 먼저 호출되어야 한다.O_O
 *  - 자식 생성자에서 명시적으로 부모의 생성자를 호출하지 않으면
 *    부모의 디폴트 생성자가 호출된다.
 *  - 부모가 디폴트 생성자를 가지고 있지 않은 상태에서
 *    자식 생성자에서 명시적으로 부모의 생성자를 호출하지 않으면 오류
 *    ----------------------------------------------------------------
 * 메소드 재정의(method overriding)
 * 	- 상속 받은 하위(자식) 클래스에서 상위(부모) 클래스에 정의되어 있는 메소드를 다시 정의
 * 	- 부모에 있는 메소드와 동일(리턴타입, 파라미터가 같음)
 *  - 기능의 재정의 : 새로운 기능으로 대체, 변경
 */
package family3;

public class Child extends Parent {

	public Child() {
		super(); // 부모 생성자를 명시적으로 호출(디폴트 생성자)
		System.out.println("Child()");
	}

	public Child(int asset, int money) {
		super(asset, money); //부모의 생성자를 호출(파라미터가 일치하는 부모 생성자)
		System.out.printf("Child(asset:%d, money:%d)%n",asset, money);
	}
	
	void sale(int money) {
		this.money += money;
	}
	void print(String title) {
		System.out.printf("[Child] print(%s): asset(%d), money(%d)\n",title,  this.asset, this.money);
}
}
