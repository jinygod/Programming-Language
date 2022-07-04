/*
 * switch ~ case 
 */
package switchstmt;

public class SWStmt02B {

	public static void main(String[] args) {
		char grade = 'e'; // 범위: A~E
		int score = 0;
		
		switch(grade) { 
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
			if(grade >= 'A' && grade <= 'E' ||
			   grade >= 'a' && grade <= 'e') { 
			score = 59;
		
		}
			else {
			score = 0;
		}
		System.out.printf("등급(%c), 기준점수(%d)\n" , grade , score);
	}

}

}