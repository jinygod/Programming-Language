package family3;

public class ChildMain {

	public static void main(String[] args) {

		System.out.println("[child]");
		Child child = new Child();
		child.print();

		System.out.println("[child2]");
		Child child2 = new Child(500, 600);
		child2.print("child2");
	}

}
