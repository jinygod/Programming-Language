package whilestmt;

public class WhileStmt02Sum {

	public static void main(String[] args) {
		final int MAX_CNT = 10;
		int cnt = 0;
		int sum = 0;
		
		while(cnt < MAX_CNT) {
			cnt++;
			sum += cnt;
			System.out.printf("cnt=%d, sum=%d %n", cnt, sum);
			
		}

		System.out.println("sum=" + sum);
		
	}

}