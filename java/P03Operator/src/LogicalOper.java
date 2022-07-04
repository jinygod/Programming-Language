/*
 * 논리연산자: !, ||, &&
 * 	- 논리부정(!): true -> false, false -> true
 * 	- 논리합(||) : A or B, A, B가 하나라도 참이면 참
 *  - 논리곱(&&) : A and B, A, B가 모두 참이어야 참
 */
public class LogicalOper {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		
		// 논리부정
		// 참조되는 변수의 값 자신은 변경되지 않음
		boolean f1 = !t;    // true -> false;
		boolean t1 = !f;    // false -> true;
		
		System.out.printf("t(%b) -> f1(%b)\n", t, f1);
		System.out.printf("f(%b) -> t1(%b)\n", f, t1);
		
		// 토글(toggle) 스위치
		// 한 번 터치하면 사태가 반대로 바뀌는 스위치
		boolean onoff = false;
		System.out.printf("onoff: (%b)%n" , onoff);
		onoff = !onoff;
		System.out.printf("onoff: (%b)%n" , onoff);
		onoff = !onoff;
		System.out.printf("onoff: (%b)%n" , onoff);
		onoff = !onoff;
		System.out.printf("onoff: (%b)%n" , onoff);
		
	}

}
