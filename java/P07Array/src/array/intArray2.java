/*
 * 배열복사: 수동
 */
package array;

public class intArray2 {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 1차원 배열(0번째부터 9번째까지)
		int[] list2 = new int[list1.length];
		
		System.out.println("[lists에서 list2로 복사]");	
		for(int index=0; index < list1.length; index++) {
			list2[index] = list1[index];
		}
		System.out.println("[list2의 데이터]");
		for(int index=0; index < list2.length; index++){
			System.out.printf("[%d] %d%n", index, list2[index]);
		}
		
	}

}
