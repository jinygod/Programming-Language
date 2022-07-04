/*
 * StringBuilder: 스트링 처리
 * 1. String : 단일 문자열 처리, 저장된 문자열을 수정할 수 없다.
 * 2. StringBuilder : 다중 문자열 처리, 단일 스레드 환경에서 사용
 * 3. StringBuffer : 다중 문자열 처리, 멀티 스레드 환경에서 사용
 */
package strings;

import java.util.StringTokenizer;

public class StringBuilderRun4answer {

	public static void main(String[] args) {
		StringBuilder filepath = new StringBuilder("/home/ezen/workspace/ac.txt");
	//	StringBuilder filepath = new StringBuilder("da/abc.txt");
		System.out.println("[모든 폴더와 파일이름 각각 추출]");
		
		StringTokenizer st = new StringTokenizer(filepath.toString(), "/");
		int tokens = st.countTokens();
		
		System.out.println("tokens= " + tokens);
		
		for(int cnt=0; cnt < tokens; cnt++) {
			String filename = st.nextToken(); // 토큰을 꺼낸 후 삭제
			System.out.printf("countTokens(%s), filename(%s)%n" , st.countTokens(), filename);
		}
	
	}

 }
