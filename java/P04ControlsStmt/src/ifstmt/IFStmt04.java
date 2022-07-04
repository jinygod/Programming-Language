package ifstmt;

public class IFStmt04 {

	public static void main(String[] args) {
		//boolean tf = false;
		boolean tf = true;
		boolean b1 = !tf;
		
		System.out.printf("%b = tf(%b) %n", b1, tf);

		if(!tf) {
			System.out.print("tf가 거짓이면 참 : ");
			System.out.println(tf);
		}	
		else {
			System.out.print("tf가 참이면 거짓 : ");
			System.out.println(tf);
			
			
		}
	}

}