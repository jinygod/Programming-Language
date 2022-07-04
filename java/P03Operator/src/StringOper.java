/*
 * 문자열 연산: +
 * 	- String 변수 = "문자열";
 * 	- String 변수 = new String("문자열");
 * 	- 문자열을 붙임(연결)
 */
public class StringOper {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello" + "," + "World");
		
		String hello = "hello";
		String world = "world";
		String helloworld = hello + "," + world;
		System.out.println(helloworld);
	
		String ver = "버전";
		String ver4 = ver + 4; // 문자열 + 숫자 -> 문자열 + 문자열(숫자) -> 문자열
		System.out.println(ver4);
		
		// 문자열 = 문자열 + 문자열(실수)
		String ver4p1 = ver + 4.1f; 
		System.out.println(ver4p1);
		
		// Type mismatch: cannot convert from float to String
		// String verx = 5.1f;
		
	}

}
