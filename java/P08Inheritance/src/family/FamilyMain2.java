package family;

public class FamilyMain2 {
	static void info(Parent parent, String title) {
		System.out.println("[info]" + title);
		System.out.println("asset ? " + parent.asset);
		System.out.println("money ? " + parent.money);
	}
	
	static void infoChild(Child child, String title) {
		System.out.println("[InfoChild]" + title);
		System.out.println("asset ? " + child.asset);
		System.out.println("money ? " + child.money);
	}

	public static void main(String[] args) {

		
		Parent parent = new Parent();
		Child child = new Child();
		
		info(parent, "parent");
		info(child, "child");

		
		//The method infoChild(Child, String) in the type
		//FamilyMain2 is not applicable for the arguments (Parent, String)
		//infoChild(parent, "parent");
		infoChild(child, "child");
		//infoChild(child2, "child2");
	}


}
