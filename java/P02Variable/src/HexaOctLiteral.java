/*
 * 16진수(Hexa Decimal)
 *   - 0 ~ 15
 *   - 10(A), 11(B), 12(C), 13(D), 14(E), 15(F)
 *   - 0x00, 0x01, 0x02, 0x03, 0x04, ... 0x0A, 0x0C, 0x0F
 * --------------------------------------------------------
 * 8진수(Oct)
 *   - 0 ~ 7
 *   - 00, 01, 02, 03, 04, 05, 06, 07
 */
public class HexaOctLiteral {

	public static void main(String[] args) {
		//8진수
		int oct0 = 00;
		int oct1 = 01;
		int oct7 = 07;
		
		System.out.printf("oct0: (%d), (%o), (0x%x)\n", oct0, oct0, oct0);
		System.out.printf("oct0: (%d), (%o), (0x%x)\n", oct1, oct1, oct1);
		System.out.printf("oct0: (%d), (%o), (0x%x)\n", oct7, oct7, oct7);

		//16진수
		int dc = 10;
		int ha = 0x0a;
		System.out.printf("dc: (%d), (0%o), (0x%x)\n", dc, dc, dc);
		System.out.printf("ha: (%d), (0%o), (0x%x)\n", ha, ha, ha);
		
		//1바이트 최댓값
		int dec = 255;
		int oct = 0377; // 377
		int hex = 0xff; // 1111 1111
		
		System.out.printf("dec: (%d), (0%o), (0x%x)\n", dec, dec, dec);
		System.out.printf("oct: (%d), (0%o), (0x%x)\n", oct, oct, oct);
		System.out.printf("hex: (%d), (0%o), (0x%x)\n", hex, hex, hex);
		
	}

}
