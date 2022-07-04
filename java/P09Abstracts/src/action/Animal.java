/*
 * [추상클래스]
 * 	- 추상 메소드를 포함하는 클래스는 반드시 추상 클래스가 되어야 한다.
 * 	- 추상 메소드:
 * 		> 메소드 이름 앞에 abstract를 붙임
 * 		> 실행 코드가 없다.(구현 코드가 없다)
 * 		> 메소드의 시그니처만 가지고 있다.
 * 	- 추상 클래스는 클래스 이름 앞에 abstract를 붙임
 * 	- 추상 클래스에서는 일반 메소드와 추상 메소드를 혼합하여 정의 할 수 있다.
 * 	- 추상 클래스는 상속을 하여 구현 클래스를 정의해서 객체를 생성해야 한다.
 * 	- 추상 메소드는 구현 클래스에서 오버라이드하여 정의해야 한다.
 */
package action;

public abstract class Animal {
	public abstract void move();	// 추상 메소드
	
	public void breathe() {  // 일반 메소드
		System.out.println("모든 동물은 호흡한다.");
	}
	
	
}
/*
public class Animal {
	public void move() {
		System.out.println("동물은 움직인다.");
		
	}
	
}
*/