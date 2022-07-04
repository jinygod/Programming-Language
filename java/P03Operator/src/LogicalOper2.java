/*
 * 논리연산자: !, ||, &&
 * 	- 논리부정(!): true -> false, false -> true
 * 	- 논리합(||) : A or B, A, B가 하나라도 참이면 참
 *  - 논리곱(&&) : A and B, A, B가 모두 참이어야 참
 */
public class LogicalOper2 {

	public static void main(String[] args) {
		
		// 논리합(||)
		boolean t = true;
		boolean f = false;
		
		boolean or1 = t || f;
		boolean or2 = t || t;
		boolean or3 = f || f;
		boolean or4 = f || t;
		
		System.out.printf("%b = t(%b) || f(%b)%n", or1, t, f);
		System.out.printf("%b = t(%b) || t(%b)%n", or2, t, t);
		System.out.printf("%b = f(%b) || f(%b)%n", or3, f, f);
		System.out.printf("%b = f(%b) || t(%b)%n", or4, f, t);

		
	}

}
