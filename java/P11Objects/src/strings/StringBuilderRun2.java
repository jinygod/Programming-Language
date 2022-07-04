/*
 * StringBuilder: 스트링 처리
 * 1. String : 단일 문자열 처리, 저장된 문자열을 수정할 수 없다.
 * 2. StringBuilder : 다중 문자열 처리, 단일 스레드 환경에서 사용
 * 3. StringBuffer : 다중 문자열 처리, 멀티 스레드 환경에서 사용
 */
package strings;

public class StringBuilderRun2 {

	public static void main(String[] args) {
		
		// 이미 할당된 영역에 활용하여 메모리 사용이 효율적
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Programming");
		sb.append(".");
		System.out.println("length: " + sb.length());
		System.out.println(sb);

		// 문자열 삽입
		sb.insert(5, "1.8, "); // insert(index, string)
		System.out.println(sb);
		
		// 문자열 지우기
		sb.delete(5, 10);   // delete(start, end)
		System.out.println(sb);
		
		// 문자열 교체 : replace(start, end, "교체할 문자열")
		sb.replace(5,  sb.length(), "Book");
		System.out.println(sb);
		
		// 문자열의 시작위치 찾기
		int pox = sb.indexOf("Book");
		System.out.printf("[%s] pox = %d %n", sb, pox);
		
		// 뒤에서 부터 가장 먼저 찾은 문자열의 위치
		// 위치값은 0부터
		int pol = sb.lastIndexOf("a");
		System.out.printf("[%s] pol = %d %n", sb, pol ); 
		
		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
	}

}
