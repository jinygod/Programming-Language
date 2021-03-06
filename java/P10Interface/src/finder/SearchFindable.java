package finder;

public interface SearchFindable extends Searchable, Findable {
	
	public abstract int lookup(String topic);
	
	public static final Contents contents = new Contents();
	//인터페이스에서 멤버속성은 무조건 public static final 특성을 갖는다.
	//Contents contents = new Contents();
	//정적 멤버 속성

	public static Contents contents() {
		return SearchFindable.contents;
	}
	
	public static void action(SearchFindable findable, 
			String word, String statement, String topic) {
		System.out.println("[SearchFindable -> action]");
		findable.find(word);
		findable.search(statement);
		findable.lookup(topic);
		//정적 메소드
	}

}
