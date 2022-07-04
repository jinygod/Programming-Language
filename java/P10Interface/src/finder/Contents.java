/*
 * 기사의 내용을 담고있는 클래스
 */
package finder;

public class Contents {
	String content;
	
	public Contents() {}
	
	public Contents(String content){
		this.content = content;
	}
	
	public void setContents(String content){
		this.content = content;
	}
	
	public int find(String word) {
		System.out.printf("[Contents] word(%s)%n", word);
		return 77;
	}
	public int search(String statement) {
		System.out.printf("[Contents] search(%s)%n", statement);
		return 88;
	}
	public int lookup(String topic) {
		System.out.printf("[Contents] lookup(%s)%n", topic);
		return 99;
	}
}
