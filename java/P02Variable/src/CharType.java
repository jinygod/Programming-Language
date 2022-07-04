/* 
 * 문자타입(char) : character(2byte, 16bit)
 *   - 하나의 문자 단위 처리 (UTF-16)
 *   - 범위: 0~65535, 0x0000~0xFFFF
 *   - 영문: ASCII(7Bit, 0~127), 확장 ASCII(0~255)
 *   - 유니코드(Unicode, UTF-16)
 *   - 작은따옴표(')로 양쪽을 감싼다.
 *   - ASCII 코드값이나 UNICODE값을 지정할 수 있다.
 */
public class CharType {

	public static void main(String[] args) {
		char chA = 'A';
		char cha = 'a';
		char hangeul = '한';
		
		System.out.printf("chA(%c)\n", chA);
		System.out.printf("cha(%c)\n", cha);
		System.out.printf("한(%d)\n", (int)hangeul); // 0xD55C
		
		char chA1 = 65; //ASCII 10진수
		char chA2 = 0x41; // ASCII 16진수
		char chA3 = 0x0041; //ASCII 16진수
		
		System.out.printf("chA1(%c)\n", chA1);
		System.out.printf("chA2(%c)\n", chA2);
		System.out.printf("chA3(%c)\n", chA3);
		
		// 유니코드 : '가'
		char ga = 0xac00; // '가'
		char ga1 = '\uac00'; // '가' 유니코드 표현 
		char han = 0xd55c; // '한'
		System.out.printf("(%c) -> (%d)(%x)\n", ga, (int)ga, (int)ga); //%c: 문자 %d: 숫자 %x: 16진수(hexa-d)
		System.out.printf("(%c) -> (%d)(%x)\n", ga1, (int)ga1, (int)ga1);
		System.out.printf("(%c) -> (%d)(%x)\n", han, (int)han, (int)han);
				
	}

}
