/*
 * 증감연산자: ++,--
 * 	- 자기 자신의 값을 변경 시킴
 * 	- 변수의 뒤에 연산자가 붙으면 변수의 값을 참조 후 증강 시킴
 * 	- 변수의 앞에 연산자가 붙으면 증감을 시키고 참조
 * 	- 증가연산자 : ++(1씩 증가)
 * 	- 감소연산자 : --(1씩 감소)
 */
public class SingleOper {
	public static void main(String[] args) {
		int pp = 0;
		pp++; // pp = pp + 1
		System.out.println("pp=" + pp);
		
		++pp; // pp = pp + 1
		System.out.println("pp=" + pp);
		
		int p1 = pp++; // pp에 들어있는 값을 p1에 할당 후 증가
		System.out.printf("pp(%d), p1(%d) \n" , pp, p1);

		int p2 = ++pp; // pp에 들어있는 값을 증가 후 p1에 할당
		System.out.printf("pp(%d), p1(%d) \n" , pp, p2);
		
		int n1 = pp--; //n1 = pp, pp= pp -1;
		System.out.printf("pp(%d), n1(%d) \n" , pp, n1);

		int n2 = --pp; //pp = pp - 1 , n2 = pp;
		System.out.printf("pp(%d), n2(%d) \n" , pp, n2);
		
		int x1 = 10;
		int x2 = 10;
		int y1 = (x1++) + (--x2); // 10 + 9 -> 19
		System.out.printf("x1(%d), x2(%d), y1(%d) \n" , x1, x2, y1);
		
		int y2 = (++x1) + (--x1); // 12 + 11 -> 23
		System.out.printf("x1(%d), y2(%d) \n" , x1, y2);

	}

}
