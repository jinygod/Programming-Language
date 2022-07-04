package calc;

public class Calc implements Calcable {
	int tot;
	
	Calc(){
	}

	@Override
	public int add(int n1, int n2) {
		int x = n1 + n2;
		tot += x;
		return x;
	}

	@Override
	public int sub(int n1, int n2) {
		int x = n1 - n2;
		tot -= x;
		return x;
	}

	@Override
	public int mul(int n1, int n2) {
		int x = n1 * n2;
		tot *= x;
		return x;
	}

	@Override
	public int div(int n1, int n2) {
		int x = n1 / n2;
		tot /= x;
		return x;
	}
	
	// 구현 클래스에서는 접근 제한자를 public으로 지정해야 한다.
	public int tot() {
		return tot;
	}

}
