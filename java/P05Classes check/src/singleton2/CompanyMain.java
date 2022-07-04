package singleton2;

public class CompanyMain {

	public static void main(String[] args) {
		Company comp1 = Company.getInstance();
		Company comp2 = Company.getInstance();
		Company comp3 = Company.getInstance();
		Company comp4 = Company.createInstance("comp4");
		Company comp5 = Company.createInstance("comp5");
		
		System.out.println("comp1 == comp2 ?" + (comp1 == comp2));
		System.out.println("comp1 == comp3 ?" + (comp1 == comp3));
		System.out.println("comp1 == comp4 ?" + (comp1 == comp4));
		comp1.cnt();
		comp4.cnt();
		comp4.counter();
		
		comp5.cnt();
		comp5.counter();
		
		comp1.cnt();
		comp5.cnt();
		comp1.counter();
		comp5.counter();
	}

}
