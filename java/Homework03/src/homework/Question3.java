package homework;

public class Question3 {

	public static void main(String[] args) {
	    int oddSum = 0;
	    int evenSum = 0;
	    
	    for(int i = 0; i < 100; i++) {
	    	if((i + 1) % 2 != 0) {
	    		oddSum = oddSum + (i + 1);
	    	}
	    }
	    
	    for(int i = 0; i < 100; i++) {
	    	if((i + 1) % 2 == 0) {
	    		evenSum = evenSum + (i + 1);
	    	}
	    }
	    
	    System.out.printf("1부터 100까지의 홀수의 합 : [%d]%n", oddSum);
	    System.out.printf("1부터 100까지의 짝수의 합 : [%d]%n", evenSum);
	    
	    }

}
