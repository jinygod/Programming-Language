package forstmt;

public class ForStmt04Break5 {

	public static void main(String[] args) {
		final int MAX_YEAR = 365;
		final int MAX_HOUR = 24;
		
		
ALLSTOP: 
		while(true) {
		for(int year = 1; year <= MAX_YEAR ; year++){
			System.out.printf("[%d] ", year);
			
			for(int hour = 1; hour <= MAX_HOUR; hour++) {
				if(year >= 100 && hour >= 12) {
					break ALLSTOP;
				}
				System.out.printf("%d ", hour);

					}
					System.out.println();
				}
		}		
			System.out.println("작업 종료");
			}
		}

