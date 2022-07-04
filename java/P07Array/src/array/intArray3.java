/*
 * 배열복사: System.arraycopy(...)
 * 
 * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 		- Object src  : 복사할 배열의 원본
 * 		- int srcPos  : 복사할 배열의 원본 시작 위치
 * 		- Object dest : 복사될 배열의 사본
 * 		- int destPos : 복사될 배열의 사본의 시작위치
 * 		- int length  : 복사될 배열의 크기(요소의 갯수)
 * ----------------------------------------------------------------
 *  조건: 복사될 배열의 사본은 복사될 요소의 크기만큼 미리 확보되어 있어야 한다.
 */
package array;

public class intArray3 {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 1차원 배열(0번째부터 9번째까지)
		int[] list2 = new int[list1.length];
		int[] list3 = new int[list2.length];
		
		System.out.println("[list1에서 list2로 복사] list1 * 2");	
		for(int index=0; index < list1.length; index++) {
			list2[index] = list1[index] * 2 ;
		}
		System.out.println("[list2의 데이터]");
		for(int index=0; index < list2.length; index++){
			System.out.printf("[%d] %d%n", index, list2[index]);
		}
		
		System.out.println("[lists2에서 list3로 복사]");	
		System.arraycopy(list2, 0, list3, 0, list3.length);
		for(int index=0; index < list2.length; index++){
		System.out.printf("[%d] %d%n", index, list3[index]);
		}

	}
}
