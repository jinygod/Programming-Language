/*
 * 실수(double) : 배정도 실수(8byte)
 * 	- 크기(64bit) : 부호(1bit) + 지수(11bit) + 가수(52bit)
 *	- 범위 : (4.9E-324) ~ 1.7976931348623157e308
 *	- 최대 소숫점 16자리 정도
 */
public class DoubleType {

	public static void main(String[] args) {
		double dbl = 0.12345678901234567;
		
		System.out.println("dbl = " + dbl);
		
		double pi = 3.141592653589793;
		double pi1 = 3.1415926535897932;
		double pi2 = 3.14159265358979323;
		double pi3 = 3.141592653589793238;
		double pi4 = 3.1415926535897932384;
		System.out.println("pi = " + pi);
		System.out.println("pi1 = " + pi1);
		System.out.println("pi2 = " + pi2);
		System.out.println("pi3 = " + pi3);
		System.out.println("pi4 = " + pi4);
		
		double n7a = 1234567.0;
		double n7b = 0.1234567e7; //10의 7승

		System.out.println("n7a = " + n7a);
		System.out.println("n7b = " + n7b);
		
		double n10 = 40000000000.0; // 4 * 10의 10승
		double n20 = 4.0e10; 
		
		System.out.println("n10 = " + n10);
		System.out.println("n10 = " + n20);
	}

}
