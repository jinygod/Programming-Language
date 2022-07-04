/*
 * 127 : 0111 1111
 *     +         1
 *     ------------
 *       1000 0000 ( -128 )
 *       
 *  ----------------------------
 *     0 : 0000 0000
 *    -1 : 1111 1111
 *    -2 : 1111 1110
 *  -127 : 1000 0001
 *  -128 : 1000 0000
 */
public class ByteType2 {

	public static void main(String[] args) {
		byte minus = -128;
		byte plus = 127;
		
		System.out.println("minus: " + minus);
		System.out.println("plus: " + plus);
		
		//Type mismatch: cannot convert from int to byte
		//byte plus128 = 128;
		
		// 정수연산(byte, char, int) 연산은 무조건 int로 변환해서 처리를 한다.
		// 캐스팅 : (byte)(바이트값) : 다른 타입의 자료형으로 변환
		byte plusone = (byte)(plus + 1);
		System.out.println("plusone: " + plusone); // -128(1000 0000), 0x80
		
		//성능을 높이기위해 귀찮게함.
		

	}

}
