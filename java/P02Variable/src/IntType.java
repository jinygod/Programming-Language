/*
 * 정수(int) : 4byte(32bit) integer
 * 자바에서 숫자를 처리하는 기본단위
 * 범위 : -2147483648 ~ 2147483647
 */
public class IntType {

	public static void main(String[] args) {
		int intval = 1234567;
		int intmin = -2147483648;
		int intmax = 2147483647;
		
		System.out.println("intval : " + intval);
		System.out.println("intmin : " + intmin);
		System.out.println("intmax : " + intmax);

		int minone = intmin - 1;
		int maxone = intmax + 1;
		System.out.println("minone : " + minone);
		System.out.println("maxone : " + maxone);
		
	}

}
