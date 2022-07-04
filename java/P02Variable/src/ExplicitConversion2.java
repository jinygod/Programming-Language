/*
 * 명시적 형변환(Explicit Conversion)
 *   - 특정한 타입으로 강제 자료형 변환
 *   - 큰 타입에서 작은 타입으로 변환
 *   - 자료의 손실이 발생
 *   - 새로운 변수 = (바꿀 자료형)기존 변수
 */
public class ExplicitConversion2 {

	public static void main(String[] args) {

		int n1 = 300;   // 0x012c(0000 0001 0010 1100)
		
		//	Type mismatch: cannot convert from int to byte
		// byte b1 = n1;
		byte b1 = (byte)n1; // 0x012c -> 0x2c(0010 1100)
		
		System.out.printf("n1(%d)(0x%x) -> byte b1(%d)(0x%x)\n", n1, n1, b1, b1);
		
	}

}
