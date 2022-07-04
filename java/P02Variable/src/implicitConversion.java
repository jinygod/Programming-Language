/*
 * 묵시적 형변환(Implicit Conversion)
 *   - 암시적 형변환
 *   - 자동 타입변환(Promotion)
 *   - 작은 자료형에서 큰 자료형으로 변환
 *     byte > short > int > long
 *     byte > char > int > long
 *   - 낮은 정밀도의 자료형에서 높은 정밀도의 자료형으로 변환
 *     float > double
 *   - 문자형(char)은 양수값만 처리하므로 byte의 마이너스 값을 변환하면 양수(plus)로 바뀐다.
 */
public class implicitConversion {

	public static void main(String[] args) {
		byte A1 = 65; // 1바이트: 'A'
		int An = A1;  // 4바이트: 65
		
		System.out.println("A1 = " + A1);
		System.out.println("An = " + An);

		char Cc = 'C';
		int Cn = Cc;
		
		System.out.println("Cc = " + Cc);
		System.out.println("Cn = " + Cn);
		
		float fpi = 3.141592f;
		double dpi = fpi;
		
		System.out.println("fpi = " + fpi);
		System.out.println("dpi = " + dpi);
	}

}
