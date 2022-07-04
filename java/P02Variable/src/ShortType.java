/*
 * 단정도 정수(short) : 정수(2byte, 16bit)
 *   - 범위 : -32768 ~ 32767
 */
public class ShortType {

	public static void main(String[] args) {
		short minshort = -32768;
		short maxshort = 32767; // +32767
		short abc = 12345;
		
		System.out.println("minshort: " + minshort);
		System.out.println("maxshort: " + maxshort);
		System.out.println("abc: " + abc);
		
		//Type mismatch: cannot convert from int to short
		//short maxone = maxshort + 1;
		
		//short maxone = (short)(maxshort + 1);
		short maxone = (short)(maxshort + 1);
		System.out.println("maxone: " + maxone);

	}

}
