/*
 * Class: 클래스 정보를 가지고 있는 클래스 객체
 * 	- 변수(멤버 속성) 정보
 * 	- 메소드 정보
 */
package xclass;

public class XClass {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("World");

		Class c1 = s1.getClass();
		Class<?> c2 = s2.getClass();
		Class c3 = s1.getClass();
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
	}

}
