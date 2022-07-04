/*
 * StringBuilder: 스트링 처리
 * 1. String : 단일 문자열 처리, 저장된 문자열을 수정할 수 없다.
 * 2. StringBuilder : 다중 문자열 처리, 단일 스레드 환경에서 사용
 * 3. StringBuffer : 다중 문자열 처리, 멀티 스레드 환경에서 사용
 */
package strings;

public class StringBuilderRun1 {

	public static void main(String[] args) {
		
		// 이미 할당된 영역에 활용하여 메모리 사용이 효율적
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Programming");
		sb.append(".");
		System.out.println("length: " + sb.length());
		System.out.println(sb);
		System.out.println(sb.toString());

		// 문자열은 내용이 변할 때마다 새로운 메모리 영역을 할당
		// 메모리 낭비가 심함
		String str = "Java ";
		str += "Programming";
		str += ".";
		System.out.println("length: " + str.length());
		System.out.println(str);
	}

}
