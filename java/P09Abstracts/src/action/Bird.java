/*
 * 추상 클래스를 상속한 구현 클래스
 * 추상 클래스에 정의된 추상 메소드를 오바리드해서 구현해야 한다.
 */
package action;

public class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("새는 난다.");
	}
	
}
