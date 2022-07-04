/*
 * 바이트 타입:1바이트
 * 값의 범위: -128 ~ 127
 */
public class ByteType {

	public static void main(String[] args) {
	//	byte x1 = minus, x2 = plus; minus, plus가 아직 없기때문에 Err발생, 아래로 내려야함.
		byte zero = 0;
		byte minus = -128;
		byte plus = 127;
		byte abc = 123;
		byte x1 = minus, x2 = plus;

		
		System.out.println("zero: " + zero);
		System.out.println("minus: " + minus);
		System.out.println("plus: " + plus);
		System.out.println("abc: " + abc);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		// 초깃값을 지정하지 않고 선언
		byte b1, b2, b3;
		
		//변수는 선언되어 참조되기 전에 값이 지정되어야 한다.
		b1 = b2 = b3 = zero;
		
		 System.out.printf("b1(%d), b2(%d), b3(%d)\n", b1, b2, b3);
		 
		 b1 = 1; b2 = 2; b3 = 3;
		 System.out.printf("b3(%d), b2(%d), b1(%d)\n", b3, b2, b1);
	}

}
