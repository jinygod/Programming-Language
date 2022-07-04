package singleton2;

public class Company {
	//private static Company instance = new Company();
	private static Company instance = null;  //공유
	private static int counter = 0;			//공유
	
	private int cnt = 0;					//인스턴스별로 생성
	private String id = "공용";				//인스턴스별로 생성
	
	private Company() {
		System.out.printf("Company() : this=%s, cnt=%d, _cnt=%d%n", this, ++cnt, ++counter);
	}
	
	public Company(String id) {
		System.out.printf("Company(%s) : this=%s, cnt=%d, _cnt=%d%n", this,id,  ++cnt, ++counter);
		this.id = id;
	}
	
	public static Company createInstance(String id) {
		Company comp = new Company(id);
		return comp;

	}
	Company(String id, int cnt, int counter){
	this.id = id;
	this.cnt = cnt;
	this.counter = counter;
}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		
		System.out.println("1.getInstance() : instance=" + instance);
		}
		System.out.println("2.getInstance() : instance=" + instance);
		return instance;
	}
	public void cnt() {
		this.cnt++;
		System.out.printf("id=%s, cnt=%s %n" , this.id, this.cnt);
	}
	
	public void counter() {
		counter++;
		System.out.printf("id=%s, coutner=%s %n", id, counter);
	}
}
