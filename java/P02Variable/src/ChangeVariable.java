/*
 * 변수의 값을 변경
 */
public class ChangeVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.printf("a(%d), b(%d)\n", a, b);
		
		// 데이터 교환
		int 임시 = a;
		a = b;
		b = 임시;
		
		System.out.printf("a(%d), b(%d)\n", a, b);

	}

}
