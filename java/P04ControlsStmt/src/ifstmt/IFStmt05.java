package ifstmt;

public class IFStmt05 {

	public static void main(String[] args) {
		int n = 9;
		boolean tf = (n >= 9);
		
		System.out.printf("tf(%b) = (n >= 9) %n", tf, n);
		
		if(tf) {
			System.out.printf("n(%d)은 9보다 크거나 같다.%n", n);

		if(n >= 9) {
			System.out.printf("n(%d)은 9보다 크거나 같다.%n", n);
			}
		}
	}
}