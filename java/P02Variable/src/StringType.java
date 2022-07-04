/*
 * 문자열(String) : 기본타입은 아니지만 기본타입처럼 사용
 * 	- 문자열을 다루도록 기본적으로 제공하는 클래스
 *  - 문자열은 문자(char)의 집합
 *  - 큰따옴표(")로 양쪽을 묶어서 선언
 *  - 예 : "한글", "홍길동", "alphabetic"
 *  ------------------------------------------------------------
 *  - String은 참조타입, 참조변수
 *  - String은 변수의 각 문자 즉 문자단위로 바꿀 수가 없다.
 */
public class StringType {

	public static void main(String[] args) {
		String empty = ""; //빈 문자열
		String name = "홍길동";
		String alphabet = "ABCDEF";
		
		System.out.printf("(%s)(%s)(%s)\n", empty, name, alphabet);
		System.out.println("empty: " +  empty);
		
		name = "name: " + name;
		System.out.println(name);
		System.out.println("alpahbet: " +  alphabet);
	}

}
