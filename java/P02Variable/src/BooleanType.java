/*
 * 논리타입(boolean)
 * 논리값(true, false)
 */
public class BooleanType {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		
		System.out.println(">  참 : " + t);
		System.out.println(">거짓 : " + f);
		
		boolean tf = f;
		System.out.println(">tf? : " + tf);
		
		System.out.printf("t: (%b)\n", t);
		System.out.printf("f: (%b)\n", f);
		System.out.printf("tf: (%b)\n", tf);
		
		System.out.println("tf: (" + tf + ")");
		
	}

}
