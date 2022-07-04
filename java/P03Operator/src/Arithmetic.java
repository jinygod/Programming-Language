/*
 * 산술연산자
 */
public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b ;
		System.out.printf("c(%d) = a(%d) + b(%d) %n", c, a, b);

		int d = c - 40;
		int e = a + b + c + d;
		System.out.printf("d(%d) , e(%d) %n", d, e);

		int f = a + b + c - 10;
		System.out.printf("f(%d) = e(%d)%n", f, e);

		int g = a + b + c  + (- 10);
		int g1 = a + b + c - 10;
		System.out.printf("f(%d) = g(%d)%n", f, g);
		System.out.printf("f(%d) = g1(%d)%n", f, g1);
		
		int h = a + b * 2 ;    // 50 = 10 + 20 * 2
		int i = (a + b) * 2;   // 60 = (10 + 20) * 2
		System.out.printf("a(%d), b(%d), h(%d), i(%d)%n",a, b, h, i);

		// 변수앞에 minus(-) 기호를 붙이면 음수가 되는데
		// 변수 자체는 값이 변경되지 않음
		int x = a + b * -c;
		int cm = -c;
		int y = a + b * cm;
		System.out.printf("a(%d), b(%d), c(%d), x(%d)%n",a, b, c, x);
		System.out.printf("c(%d) 자체는 변경되지 않음%n",c);
		System.out.printf("a(%d), b(%d), c(%d), y(%d)%n",a, b, c, y);

	}

}
