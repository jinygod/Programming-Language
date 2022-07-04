package singleton;

public class Company {
	//private static Company instance = new Company();
	private static Company instance = null;
	private int cnt = 0;
	private static int counter = 0;
	
	private Company() {
		System.out.printf("Company() : cnt=%d, _cnt=%d%n", ++cnt, ++counter);
	}
	
	public Company(String string, int i, int j) {

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
		cnt++;
		System.out.println("cnt= " + cnt);
	}
	
	public void counter() {
		counter++;
		System.out.println("coutner= " + counter);
	}

	public static Company createInstance(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
