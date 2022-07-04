/*
 * 지수
 * 가수 : M : mantissa
 * 지수 : E : exponent
 * 값 : M * En(10의 n승)
 */
public class FloatType2 {

	public static void main(String[] args) {
		float f1 = 123450000.0f;
		float f2 = 1.2345E8f;
		float f3 = 1.2345e8f;
		float f4 = 2e-3f;
		float f5 = 0.002f;
		
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("f4: " + f4);
		System.out.println("f5: " + f5);
	}

}