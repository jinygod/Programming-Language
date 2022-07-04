package family4;

public class ChildMain {

	public static void main(String[] args) {

		System.out.println("[parent]");
		Parent parent = new Parent();
		print("parent", parent);

		System.out.println("[child2]");
		Parent child = new Child(500, 600);
		print("child", child);
		
		System.out.println("[child2]");
		Child child2 = new Child(500, 600);
		/*The operator + is undefined for the argument type(s) String, void
		System.out.println("result=" + child2.print("child2")); */
	}
	
	static void print(String title, Parent parent) {
		parent.print(title);
	}

}
