package family3;

public class ChildMain3 {

	public static void main(String[] args) {

		System.out.println("[parent]");
		Parent parent = new Parent();
		print("parent", parent);

		System.out.println("[child2]");
		Parent child = new Child(500, 600);
		print("child", child);
		
		System.out.println("[child2]");
		Child child2 = new Child(500, 600);
		print("child2", child2);
	}
	
	static void print(String title, Parent parent) {
		parent.print(title);
	}

}
