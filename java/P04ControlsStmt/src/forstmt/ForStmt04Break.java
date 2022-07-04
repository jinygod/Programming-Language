package forstmt;

public class ForStmt04Break {

	public static void main(String[] args) {
		final int MAX_YEAR = 365;
		final int MAX_HOUR = 24;
		
		for(int year = 1; year <= MAX_YEAR; year++){
			System.out.println("year:" + year);
			
			for(int hour = 1; hour <= MAX_HOUR; hour++) {
				System.out.println("hour:" + hour);
				/*
				for(int minute = 1; minute <= MAX_MINUTE; minute++) {
					System.out.printf("minute[%d]", minute);
*/
					}
					System.out.println();
				}
			}
		}

