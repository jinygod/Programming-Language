package promotions;

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}
public class PromotionClass {

	public static void main(String[] args) {
		System.out.println("[Promotion Class]");

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		/*
		 * 자동타입변환:
		 * 상속된 자식클래스로 생성된 객체는
		 * 자동으로 부모 클래스 타입으로 변환된다.
		 */
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;	// B는 d 객체의 부모타입으로 자동 타입 변환
		C c1 = e;	// C는 e 객체의 부모타입으로 자동 타입 변환
		
		// 부모가 다름으로 자동 타입 변환이 되지 않는다.
		//B b2 = e; //	Type mismatch: cannot convert from E to B
		//C c2 = d; //	Type mismatch: cannot convert from D to C
		
		// 부모가 다르면 강제로도 타입 변환을 할 수 없다.
		//B b2 = (B)e; // Cannot cast from E to B
		//C c2 = (C)d; // Cannot cast from D to C
	}

}
