/*
 *  상수(constant)
 *    - 한 번 값이 지정되면 값을 변경할 수가 없다.
 *    - 상수를 지정하는 방법은 변수 앞에 final 사용한다.
 *    - final을 지정한 후 초기값을 지정하지 않으면 사용하기 전에
 *      반드시 초기값을 할당해야 한다.
 *    - 상수의 이름은 관례적으로 대문자를 쓴다.
 *    - 상수를 사용하는 이유 
 *      > 의미를 쉽게 파악할 수 있다.
 *      > 상수가 여러군데 사용되었을 때 변경이 용이
 *      > 잘못된 값을 지정하는 오류를 최소화
 *      > 잘못해서 값이 변경되는 것을 막을 수가 있다.
 */
public class Constant {
	
	final static float PI = 3.141592f;
	
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		//MAX_NUM = 99;  상수는 바꿀 수 없음
		System.out.println("MAX_NUM : " + MAX_NUM);
		
		// 초기값이 지정되어 있지 않으면 사용하기 전에 초기값을 할당해야 한다.
		MIN_NUM = 1;
		System.out.println("MIN_NUM : " + MIN_NUM);
		System.out.println("PI : " + PI);
		// 한 번 할당되면 값을 변경할 수 없다.
		// MIN_NUM = 2;
	}

}
