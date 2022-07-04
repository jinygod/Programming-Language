package wrapperclass;

public class WrapperClassMain3 {

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

		byte b1 = objByte;	// 언박싱(자동으로 해당하는 값을 꺼냄)
		byte b2 = objByte.byteValue();
		byte b3 = (byte)(b1 + b2 + 1);
		
		System.out.printf("b1(%d), b2(%d), b3(%d)%n", b1, b2, b3);
		
		Byte b4 = (byte)(objByte + b3);
		System.out.printf("b4(%d)%n", b4);
		
		// 수동 언박싱
		char c = objChar.charValue();
		short s = objShort.shortValue();
		int i = objInteger.intValue();
		long l = objLong.longValue();
		float f = objFloat.floatValue();
		double d = objDouble.doubleValue();
		boolean b = objBool.booleanValue();
		System.out.printf("c(%c)%n", c);
		System.out.printf("s(%d)%n", s);
		System.out.printf("i(%d)%n", i);
		System.out.printf("l(%d)%n", l);
		System.out.printf("f(%f)%n", f);
		System.out.printf("d(%f)%n", d);
		System.out.printf("b(%b)%n", b);
		
		// 다른 타입으로 변환 
		// 기본 타입의 자료크기에 따라 잘림이 발생
		int f2i = objFloat.intValue();
		float i2f = objInteger.floatValue();
		
		objLong *= 2;
		int l2i = objLong.intValue();
		System.out.printf("(%f) -> f2i(%d)%n", objFloat, f2i);
		System.out.printf("(%d) -> i2f(%f)%n", objInteger, i2f);
		System.out.printf("(%d) -> f2i(%d)%n", objLong ,l2i);
		
	}

}
