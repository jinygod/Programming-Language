package singleton;

public class CompanyMain {

	public static void main(String[] args) {
		Company comp1 = Company.getInstance();
		Company comp2 = Company.getInstance();



		System.out.println("comp1 == comp2 ?" + (comp1 == comp2));
		comp1.cnt();
		comp2.cnt();
		
		comp1.counter();
		comp2.counter();
		comp2.counter();
		
		Company comp3 = Company.getInstance();
		comp3.cnt();
		comp3.counter();
		
		// private Company로 막혀있어서 생성안됨.
		// 가져오려면 위처럼 public 으로 열려있는 getInstance()로 가져와야함.
		//Company comp4 = new Company();
		//comp4.cnt();
		
	}

}
