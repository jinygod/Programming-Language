package forstmt;

public class ForStmt05Continue {

	public static void main(String[] args) {
		final int MAX_YEAR = 365;
		final int MAX_HOUR = 24;

		for(int year = 1; year <= MAX_YEAR ; year++){
			System.out.printf("[%d] ", year);
			
			if(year % 7 == 1 || year % 7 == 0) { //휴일
				System.out.println();
				continue;
			}
			
			for(int hour = 1; hour <= MAX_HOUR; hour++) {
				if(hour < 9 || hour > 18) {
					continue;
				}
				System.out.printf("%d ", hour);

					}
					System.out.println();
				}
			
			System.out.println("작업 종료");
	}	

}