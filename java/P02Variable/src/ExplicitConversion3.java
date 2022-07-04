/*
 * 명시적 형변환(Explicit Conversion)
 *   - 특정한 타입으로 강제 자료형 변환
 *   - 큰 타입에서 작은 타입으로 변환
 *   - 자료의 손실이 발생
 *   - 새로운 변수 = (바꿀 자료형)기존 변수
 */
public class ExplicitConversion3 {

	public static void main(String[] args) {
		float fpi = 3.141592f;
		double dpi = 3.141592;
		
		// 실수를 정수로 변환하면 소숫점 이하는 잘림
		int npi1 = (int)fpi;
		int npi2 = (int)dpi;
		
		System.out.printf("fpi(%f)\n", fpi);
		System.out.printf("dpi(%f)\n", dpi);
		System.out.println("npi1 : " + npi1);
		System.out.println("npi2 : " + npi2);

		// 정수(int) : 2147483647(10자리)
		float f1 = 0.21e10f;   // 0.21 * 10의 10승
		int nf = (int)f1;
		
		System.out.println("f1 : " + f1);   // 2.1E9, 2.1 * 10의 9승
		System.out.println("nf : " + nf);   // 21억
		
		float f2 = 0.21e12f;   // 0.21 * 10의 12승
		int n2 = (int)f2;
		
		System.out.println("f2 : " + f2);   // 2.1E9, 2.1 * 10의 11승
		System.out.println("n2 : " + n2);   // 정수의 최대값(2147483647)
	}

}
