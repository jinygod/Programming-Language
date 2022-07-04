package finder;

public class FinderRun {

	public static void main(String[] args) {
		SearchFindable lf = new LookupFinder();
		SearchFindable.action(lf, "단어","문장","제목");
		
		//익명 구현 클래스:
		//SearchFinder가 추상 클래스이기 때문에 구현클래스를 통해서 객체화 할수 있다.
		//익명 구현 클래스를 만들어 객체화 할 수 있다.
		//익명 구현 클래스는 재활용이 안 되는 1회용 코드
		SearchFindable sf = new SearchFinder() {

			@Override
			public int lookup(String topic) {
				System.out.printf("[SearchFinder] 익명개체: lookup(%s)%n", topic);
				System.out.printf("\t line=%d%n"
						, SearchFindable.contents().lookup(topic));
				return 0;
			}
			
			
		};
		SearchFindable.action(sf, "단어2","문장2","제목2");	
	}
		

}