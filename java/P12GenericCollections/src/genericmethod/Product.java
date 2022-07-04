/*
 * 제네릭(Generic) : 멀티타입 파라미터
 * class<A, B, C, ... >
 */
package genericmethod;

public class Product<K, M> {

	private K kind; // 제품종류
	private M model; // 제품모델
	private int pd; //생산연도

	public Product() {}
	
	public Product(K kind, M model) {
		this.kind = kind;
		this.model = model;
		
		
	}
	public Product(K kind, M model, int pd) {
		this.kind = kind;
		this.model = model;
		this.pd = pd;
		
	}
	
	public K getKind() {
		return kind;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setModel(M model) {
		this.model = model;
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}
}
