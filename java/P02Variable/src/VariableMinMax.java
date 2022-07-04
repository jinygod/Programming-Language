/*
 * 자바의 기본타입의 자료형의 크기
 */
public class VariableMinMax {

	public static void main(String[] args) {
		
		System.out.println("boolean : false=" + Boolean.FALSE);
		System.out.println("boolean : true=" + Boolean.TRUE);

		System.out.println("byte : min=" + Byte.MIN_VALUE);    //Byte : 클래스, Wrap
		System.out.println("byte : max=" + Byte.MAX_VALUE);

		System.out.println("short : min=" + Short.MIN_VALUE);
		System.out.println("short : max=" + Short.MAX_VALUE);
		
		System.out.println("char : min=" + Character.MIN_VALUE);
		System.out.println("char : max=" + Character.MAX_VALUE);
		
		System.out.println("int : min=" + Integer.MIN_VALUE);
		System.out.println("int : max=" + Integer.MAX_VALUE);
		
		System.out.println("long : min=" + Long.MIN_VALUE);
		System.out.println("long : max=" + Long.MAX_VALUE);
		
		System.out.println("float : min=" + Float.MIN_VALUE);
		System.out.println("float : max=" + Float.MAX_VALUE);

		System.out.println("double : min=" + Double.MIN_VALUE);
		System.out.println("double : max=" + Double.MAX_VALUE);		
		
	}

}
