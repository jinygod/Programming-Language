package wrapperclass;

public class WrapperClassMain {

	public static void main(String[] args) {
		
		// deprecated : 사용을 권고하지 않는다
		Byte objByte = new Byte((byte)15);
		Character objChar = new Character('a');
		Short objShort = new Short((short)32767);
		Integer objInteger = new Integer(123456);
		Long objLong = new Long(1234567890L);
		Float objFloat = new Float(3.14159f);
		Double objDouble = new Double(3.1415927);
		Boolean objBool = new Boolean(true);
		
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
