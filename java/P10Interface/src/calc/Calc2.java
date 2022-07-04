/*
 * 1. 인터페이스를 기반으로 추상 클래스를 정의 할 수 있다.
 * 2. 인터페이스에 정의되어 있는 메소드를 구현하지 않으면
 *    자동으로 추상 메소드가 된다.
 * 3. 추상 클래스에서 추상 메소드를 추가할 수 있다.
 */
package calc;

public abstract class Calc2 implements Calcable {
	
	@Override
	public int add(int n1, int n2) {
		int x = n1 + n2;
		return x;
	}

	@Override
	public int sub(int n1, int n2) {
		int x = n1 - n2;
		return x;
	}

	@Override
	public int mul(int n1, int n2) {
		int x = n1 * n2;
		return x;
	}

	@Override
	public int div(int n1, int n2) {
		int x = n1 / n2;
		return x;
	}
	
	//Calcable.tot()로 정의 되어 있기 때문에 생략가능
	//코드의 확인을 위해서 명시적으로 넣을 수 있다.
	public abstract int tot();
	
	//Calcable 인터페이스에 없는 메소드를 추가
	public abstract float avg();
}
