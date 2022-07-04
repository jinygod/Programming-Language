/*
 * 문자열 클래스 정보
 */
package xclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassRun2 {
	final static String SCLASS_NAME = "java.lang.String";
	public static void main(String[] args) {
		try {	
		// 클래스 정보
		Class<?> sclass = Class.forName(SCLASS_NAME);
		String str = (String)sclass.newInstance();
		str = "Hello, World";
		System.out.print("str= " + str);
		}
		catch(ClassNotFoundException e) {
			System.out.printf("class(%s)가 존재하지 않습니다.%n", SCLASS_NAME);
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}
}
