/*
 * 산술연산 : 나누기(/), 나머지(%)
 */
public class Arithmetic2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a / b; //몫: 연산된 결과가 정수, 소숫점 이하는 잘림
		int d = a % b; //나머지
		System.out.println("몫 c= : " + c);
		System.out.println("나머지 d= : " + d);

		float f1 = a / b;
		System.out.println("float f1 = " + f1);

		float f2 = (float)(a / b);

		System.out.println("float f2 = " + f2);

		float f3 = (float)a / (float)b;
		float f4 = a / (float)b;
		System.out.println("float f3 = " + f3);
		System.out.println("float f4 = " + f4);
		
		float fa = 10.0f;
		float fb = 3.0f;
		float fc = fa / fb;
		System.out.printf("fc(%f)=fa(%f) / fb(%f)%n", fc, fa, fb);

	}

}
