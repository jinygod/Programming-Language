/*
 * switch ~ case 
 */
package switchstmt;

public class SWStmt02A {

	public static void main(String[] args) {
		char grade = 'A';
		int score = 0;
		
		switch(grade) {  // if(grade =='A' || if grade =='a') { score = 90; }
		case 'A':
		case 'a':
			score = 90;
			break;
		case 'B':
		case 'b':
			score = 80;
			break;
		case 'C':
		case 'c':
			score = 70;
			break;
		case 'D':
		case 'd':
			score = 60;
			break;
		default:
			score = 59;
			break;
		}

		System.out.printf("등급(%c), 기준점수(%d)\n" , grade , score);
	}

}

