/*
 * switch ~ case 
 * ---------------------------
 * switch(변수){
 * case 값1:
 * case 값2:
 * default:
 * }
 * ---------------------------
 * 1. 스위치 문에 들어가는 변수는 정수, 문자, 문자열만 저장할 수 있다.
 * 	- 정수: byte, short, int, long
 * 	- 문자: char
 * 	- 문자열: String
 */
package switchstmt;

public class SWStmt01 {

	public static void main(String[] args) {
		int sw = 1;
		String msg;
		
		switch(sw) {
		case 1:
			msg = "GOLD";
			break;
		case 2:
			msg = "SILVER";
			break;
		case 3:
			msg = "IRON";
			break;
		default:
			msg = "NONE";
			break;
		}

		System.out.println("msg= " +msg);
	}

	}

