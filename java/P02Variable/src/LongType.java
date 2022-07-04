/*
 * 정수(long) : 배정도 정수(8byte, 64bit)
 * 범위 : -9,223,373,036,854,775,808 ~ 9,223,373,036,854,775,807
 * 값을 지정할 때 
 *   - int 범위안에 있으면 숫자를 지정
 *   - int 범위를 넘어서면 숫자 끝에 영문자 (l, L) 붙임
 *   - 대문자(L)을 일반적으로 붙임
 */
public class LongType {

	public static void main(String[] args) {

		long intmin = -2147483648;
		long intmax = 2147483647;
		long longval = 2147483648L;
		long lv1 = intmin + intmax;
		long lv2 = 12345678901234L;
		long lv3 = 1234567890123456789L;
		long lv4 = 9134567890123456789L;

		
		//type long is out of range
		//long lv4 = 12345678901234567890L;
		
		System.out.println("intmin : " + intmin);
		System.out.println("intmax : " + intmax);
		System.out.println("longval : " + longval);
		System.out.println("lv1 : " + lv1);
		System.out.println("lv2 : " + lv2);
		System.out.println("lv3 : " + lv3);
		//System.out.println("lv4 : " + lv4);

		long minone = intmin - 1;
		long maxone = intmax + 1;
		System.out.println("minone : " + minone);
		System.out.println("maxone : " + maxone);
		


	}

}
