/*
 * 1. final class는 더 이상 상속을 할 수 없다.
 * 2. 최종적인 클래스이다.
 * 3. 클래스가 final이면 메소드도 final이 된다.
 * 	  그러므로 생략해도 final로 작동된다.
 */
package promotions;

final public class FinalClass {
	public static final int MIN_VALUE = 10;
	public static final int MAX_VALUE = 100;
	public static final String VERSION = "10.0.1";
	
	public static int value = 0;
	
	public static int min() {
		return FinalClass.MIN_VALUE;
	}
	
	public static int max() {
		return FinalClass.MAX_VALUE;
	}
	
	public static String version() {
		return FinalClass.VERSION;
	}
	
	public static int value(int val) {
		FinalClass.value = val;
		return FinalClass.value;
	}
	
	public static int value() {
		return FinalClass.value;
	}
}
