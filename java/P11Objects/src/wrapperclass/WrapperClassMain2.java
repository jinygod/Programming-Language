package wrapperclass;

public class WrapperClassMain2 {

	public static void main(String[] args) {
		// 값을 할당하면 컴파일러가 자동으로 해당하는 타입의 객체를 생성
		Byte objByte = 15;
		Character objChar = 'ㅁ';
		Short objShort = 32767;
		Integer objInteger = 123456;
		Long objLong = 1234567890L;
		Float objFloat = 3.14159f;
		Double objDouble = 3.1415927;
		Boolean objBool = true;
		
		System.out.println(objByte);
		System.out.println(objChar);
		System.out.println(objShort);
		System.out.println(objInteger);
		System.out.println(objLong);
		System.out.println(objFloat);
		System.out.println(objDouble);
		System.out.println(objBool);

	}

}
