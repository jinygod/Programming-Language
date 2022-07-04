/*
 * 논리연산자: !, ||, &&
 * 	- 논리부정(!): true -> false, false -> true
 * 	- 논리합(||) : A or B, A, B가 하나라도 참이면 참
 *  - 논리곱(&&) : A and B, A, B가 모두 참이어야 참
 */
public class LogicalOper3 {

	public static void main(String[] args) {
		
		// 논리곱(&&)
		boolean t = true;
		boolean f = false;
		
		boolean and1 = t && f;
		boolean and2 = t && t;
		boolean and3 = f && f;
		boolean and4 = f && t;
		
		System.out.printf("%b = t(%b) && f(%b)%n", and1, t, f);
		System.out.printf("%b = t(%b) && t(%b)%n", and2, t, t);
		System.out.printf("%b = f(%b) && f(%b)%n", and3, f, f);
		System.out.printf("%b = f(%b) && t(%b)%n", and4, f, t);

		
	}

}
