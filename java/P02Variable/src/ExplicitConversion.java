/*
 * 명시적 형변환(Explicit Conversion)
 *   - 특정한 타입으로 강제 자료형 변환
 *   - 큰 타입에서 작은 타입으로 변환
 *   - 자료의 손실이 발생
 *   - 새로운 변수 = (바꿀 자료형)기존 변수
 */
public class ExplicitConversion {

	public static void main(String[] args) {
		
		char hangeul = '한';

		System.out.printf("hangeul(%c)\n", hangeul); // 0xD55C
		
		// 자동 형 변환이 되지 않음
		// byte bitehangeul = haugeul;
		
		byte bitehangeul = (byte)hangeul;
		char hangeul2 = (char)bitehangeul;
		System.out.printf("원래(%x)(%c)\n", (int)hangeul,hangeul);
		System.out.printf("바이트 변환 후(%x)\n", bitehangeul);
		System.out.printf("byte -> 문자: (%x)(%c)\n", (int)hangeul2, hangeul2);
		
		byte b1 = Byte.MIN_VALUE; //-128
		char C1 = (char)b1; // 바이트(음수,양수), 문자(양수)
		char c1 = (char)b1;
		byte b2 = (byte)c1;
		System.out.printf("b1:(%d)(%x)\n", b1,b1);
		System.out.printf("c1:(%d)(%x)\n", (int)c1, (int)c1);
		System.out.printf("b2:(%d)(%x)\n", b1,b2);
		
		int n1 = c1;
		System.out.printf("n1:(%d)(%x)\n", n1, n1);
		
		byte b3 = (byte)n1;
		System.out.printf("n1:(%d)(%x)\n", b3, b3);
		
	}

}
