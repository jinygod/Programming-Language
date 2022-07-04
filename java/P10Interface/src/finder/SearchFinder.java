/*
 * 추상메소드로 만드는 이유: 
 * 	1. 해당 메소드에서 기능을 명확하게 확정할 수 없는 경우
 * 	2. 사용성이 동적인 경우(가변)
 *  3. 실제로 사용하는 클래스에서 처리 내용을 정하라.
 */
package finder;

public abstract class SearchFinder implements SearchFindable {
	
	public abstract int lookup(String topic);
	
	@Override
	public int find(String word) {
		System.out.printf("[SearchFinder] find(%s)%n", word);
		System.out.printf("\t line=%d%n"
				, SearchFindable.contents().find(word));
		return 0;
	}

	@Override
	public int search(String statement) {
		System.out.printf("[SearchFinder] search(%s)%n", statement);
		System.out.printf("\t line=%d%n"
				, SearchFindable.contents().search(statement));
		return 0;
	}

	/*
	@Override
	public int lookup(String topic) {
		// TODO Auto-generated method stub
		return 0;
	}
*/

}
