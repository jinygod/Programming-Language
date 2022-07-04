/*
 * 추상 클래스를 상속한 구현 클래스
 * 추상 클래스에 정의된 추상 메소드를 오바리드해서 구현해야 한다.
 */
package action2;

public class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("새는 난다.");
	}
/*
 * 상위 클래스에서 final로 정의된 메소드는 재정의 할 수 없다.	
 
	public void lifecycle() {
		System.out.println("상위 클래스에서 final로 정의된 것을 재정의 하려한다.");
	}
	*/
}
