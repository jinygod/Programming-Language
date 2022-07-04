/*
 * 문자열 클래스 정보
 */
package xclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassRun {
	final static String SCLASS_NAME = "java.lang.String";
	public static void main(String[] args) {
		try {	
		// 클래스 정보
		Class sclass = Class.forName(SCLASS_NAME);
		
		// 생성자 정보
		System.out.println("[생성자 정보]");
		Constructor<?>[] scons = sclass.getConstructors();
		for(Constructor<?> scon : scons) {
			System.out.println(scon);
		}
		
		// 멤버 필드 정보
		System.out.println("[멤버 필드 정보]");
		Field[] fields = sclass.getFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		// 멤버 메서드 정보
		System.out.println("[멤버 메소드 정보]");
		Method[] methods = sclass.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		}
		catch(ClassNotFoundException e) {
			System.out.printf("class(%s)가 존재하지 않습니다.%n", SCLASS_NAME);
		}
	}

}
