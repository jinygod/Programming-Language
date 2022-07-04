/*
 * switch ~ case 
 */
package switchstmt;

public class SWStmt02 {

	public static void main(String[] args) {
		char grade = 'A';
		int score = 0;
		
		switch(grade) {
		case 'A':
			score = 90;
			break;
		case 'B':
			score = 80;
			break;
		case 'C':
			score = 70;
			break;
		case 'D':
			score = 60;
			break;
		default:
			score = 59;
			break;
		}

		System.out.printf("등급(%c), 기준점수(%d)\n" , grade , score);
	}

	}

