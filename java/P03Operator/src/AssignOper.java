
public class AssignOper {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = y = x;
		
		System.out.printf("x(%d), y(%d), z(%d) %n", x, y, z);

		float f1 = 1.1234f;
		float f2 = 2.4567f;
		float f3 = f2 = (int)f1;
		System.out.printf("f1(%f), f2(%f), f3(%f) %n", f1, f2, f3);
		
		//float f4 = (float)(int)f2 = f1;
		//float f4 = (int)f2;
		
		f2 = f1;
		float f4 = (float)(int)f2;
		float f5 = (float)((int)f2);
		int n5 = (int)((float)((int)f2));
		
		System.out.printf("f1(%f), f2(%f), f4(%f), f5(%f), n5(%d) %n", f1, f2, f4, f5, n5);

		// 하나의 타입에 여러 변수를 선언하면서 초깃값을 지정할 수 있다.
		int k = 0, e = 0, m = 0;
		System.out.printf("k(%d), e(%d), m(%d)%n", k, e, m);

	}

}
