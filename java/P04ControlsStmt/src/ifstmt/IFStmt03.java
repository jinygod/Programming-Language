package ifstmt;

public class IFStmt03 {

	public static void main(String[] args) {
		boolean tf = false;
				
		if(tf == true) { //tf 값이 참이면 실행
			System.out.println("참:"+tf);
		}
		else { //tf 값이 거짓이면 실행
			System.out.println("거짓:"+tf);
			
		tf = true;
		if(tf != true) { //tf 값이 참이면 실행
				System.out.print("거짓"+tf);
				boolean b1 = tf != true;
				System.out.println("tf != ture : " + b1);
			}
		else { //tf 값이 거짓이면 실행
				System.out.print("참:"+tf);
				boolean b1 = tf != true;
				System.out.printf("tf(%b) != true : %b",tf, b1);
			}
		}
	}

}