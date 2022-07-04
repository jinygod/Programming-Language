package family;

public class FamilyMain {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

		System.out.println("parent == child ? " + (parent == child));
		System.out.println("parent.asset = ? " + parent.asset);
		System.out.println("child.asset ? " + child.asset);
		
		System.out.println("child.money ? " + child.money);
		
		child.sale(5000);
		System.out.println("child.money ? " + child.money);
		System.out.println("parent.money = ? " + parent.money);
		
	}

}
