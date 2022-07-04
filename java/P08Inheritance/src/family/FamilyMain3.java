package family;

public class FamilyMain3 {
	static void infoParent(Parent parent, String title) {
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
		Parent child2 = new Child();
		
		infoParent(parent, "parent");
		infoParent(child, "child");
		infoParent(child2, "child2");

		
		//The method infoChild(Child, String) in the type
		//FamilyMain2 is not applicable for the arguments (Parent, String)
		//infoChild(parent, "parent");
		
		//child2.sale(4000);
		child.sale(7000);
		infoChild(child, "child");
		
		// child2는 Child로 생성을 했으므로 다시 Child로 캐스팅 가능

		Child child2c = (Child)child2;

		infoChild(child2c, "child2");
		
		infoChild((Child)child2, "child2");
		
		//객체 생성을 부모(Parent)로 하고 자식(Child)으로 캐스팅을 할 수 있지만
		//원래 부모 객체는 자식 객체가 아니므로 실행 시간에 캐스팅 예외가 발생한다.
		//Child parent2c = (Child)parent;
		//infoChild((Child)parent, "parent");

		Child parent2 = (Child)parent;
		parent2.sale(7000);
	}


}
