/*
 * 비교연산자(관계연산자)
 * 	- 처리 결과는 논리형(boolean)
 *  - == : 같다
 *	- != : 같지 않다
 *	- >  : 크다
 *	- >= : 크거나 같다
 *	- <  : 작다
 *	- <= : 작거나 같다
 */
public class CompareOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.printf("a(%d), b(%d), c(%d)%n", a, b, c);
		
		boolean eq = (a == b);
		boolean ne = (a != b);
		boolean gt = (a > b);
		boolean ge = (a >= b);
		boolean lt = (c < b);
		boolean le = (b <= c);

		System.out.printf("eq : %b  %d == %d%n", eq, a, b);
		System.out.printf("ne : %b  %d != %d%n", ne, a, b);
		System.out.printf("gt : %b  %d > %d%n", gt, a, b);
		System.out.printf("ge : %b  %d >= %d%n", ge, a, b);
		System.out.printf("lt : %b  %d < %d%n", lt, c, b);
		System.out.printf("le : %b  %d <= %d%n", le, b, c);
		
	}

}
