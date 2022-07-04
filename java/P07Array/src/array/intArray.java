package array;

public class intArray {

	public static void main(String[] args) {
		int[] lists = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 1차원 배열(0번째부터 9번째까지)
		
		System.out.println("크기: " + lists.length);
		
		// index -1 out of bounds for length 10
		// int a = lists[-1]; **************
		// Index 10 out of bounds for length 10
		// int a = lists[10];
		
		// 맨 마지막 자료를 꺼내려면?
		System.out.printf("[%d]=%d%n", lists.length -1, lists[lists.length -1]);

		System.out.println("[전체데이터추출]");
		
		for(int index=0; index < lists.length; index++) {
			System.out.printf("[%d] %d%n", index, lists[index]);
		}
		
		// 배열(lists)에서 홀수번째 데이터를 추출
		System.out.println("[홀수번째 데이터 추출]");
		for(int index=0; index < lists.length; index++) {
			if(index % 2 ==1) {
			System.out.printf("[%d] %d%n", index, lists[index]);
			}
		}
		System.out.println("[홀수 데이터 추출]");
		for(int index=0; index < lists.length; index++) {
			if(index % 2 ==0) 
			System.out.printf("[%d] %d%n", index, lists[index]);
		}

		// 배열에 요소의 값을 변경
		lists[lists.length -1] = 99;
		
		// 맨 마지막 자료를 꺼내려면?
		System.out.printf("맨 마지막 요소 : [%d]=%d%n", lists.length -1, lists[lists.length -1]); 
		
	}

}
