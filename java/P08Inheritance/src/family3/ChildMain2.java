package family3;

public class ChildMain2 {

	public static void main(String[] args) {

		System.out.println("[parent]");
		Parent parent = new Parent();
		parent.print("parent");

		System.out.println("[child2]");
		Child child2 = new Child(500, 600);
		child2.print("child2");
	}

	

}
