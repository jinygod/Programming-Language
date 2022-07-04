package utils;

public class Box<Tx> {
	private Tx name;		// 내용물의 이름
	private int count;	// 내용물의 갯수
	
	public Box() {
	}
	
	public Box(Tx name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public void set(Box<Tx> box) {
		this.name = box.getName();
		this.count = box.getCount();
	}
	
	public void set(Tx name) {
		this.name = name;
	}
	
	public Box<Tx> get(){
		return this;
	}
	
	public Tx getName() {
		return this.name;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setName(Tx name) {
		this.name = name;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Box) {
			if(this.hashCode() == obj.hashCode()) {
			Box<Tx> box = (Box<Tx>)obj;
			if(this.name.equals(box.name) && this.count == box.count)  {
				return true;
				}
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
