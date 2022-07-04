package promotions;

class A1{}

class B1 extends A1 {}
class B11 extends B1 {}
class B12 extends B1 {}

class C1 extends A1 {}
class C11 extends C1 {}
class C12 extends C1 {}
public class PromotionClass2 {

	public static void main(String[] args) {
		System.out.println("[Promotion Class]");

		B1 b1 = new B1();
		C1 c1 = new C1();
		
		B11 b11 = new B11();
		B12 b12 = new B12();
		
		C11 c11 = new C11();
		C12 c12 = new C12();
		
		// A1은 모든 클래스의 조상으로서 자동 타입 변환 가능
		A1 a1 = b1;
		A1 a2 = c1;
		A1 a3 = b11;
		A1 a4 = b12;
		A1 a5 = c11;
		A1 a6 = c12;
		
		// B1은 B11, B12의 부모로서 자동 타입 변환 가능
		B1 b1a = b11;
		B1 b1b = b12;
		
		// C1은 C11, C12의 부모로서 자동 타입 변환 가능
		C1 c1a = c11;
		C1 c1b = c12;
		
		// B1, C1은 같은 부모(A1)를 갖는 형제관계이지만
		// 그 후손은 타입을 변환할 수 없다.
		//B1 b1x = c1;
		//C1 b1x = b1;
		
		// 사촌관계: 부모가 다름으로 타입 변환을 할 수 없다.
		//B11 b11x = c11;
		//C11 c11x = b11;
		
		// 삼촌에게 입양 불가
		//B1 b1xx = c11;
		//C1 b1xx = b11;
		
	}

}
