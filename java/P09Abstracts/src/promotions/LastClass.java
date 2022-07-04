package promotions;

//Exception in thread "main" java.lang.Error: 
//Unresolved compilation problem:
//FinalClass는 final로 지정되어 상속을 할 수 없다.
//public class LastClass extends FinalClass {
//	public static void main(String[] args) {
//		System.out.println("클래스 상속 테스트");
//	}
//}

public class LastClass{
	public static void main(String[] args) {
		System.out.println("[마지막 클래스 상속 테스트]");
		
		FinalClass finalclass = new FinalClass();
		
		//FinalClass.MIN_VALUE = 88;
		//FinalClass.MAX_VALUE = 999;
		//FinalClass.VERSION = "99";
		System.out.println("FinalClass.MIN_VALUE: " + FinalClass.MIN_VALUE);
		System.out.println("FinalClass.MAX_VALUE: " + FinalClass.MAX_VALUE);
		System.out.println("FinalClass.VERSION: " + FinalClass.VERSION);
		System.out.println();
		System.out.println("FinalClass.min(): " + FinalClass.min());
		System.out.println("FinalClass.max(): " + FinalClass.max());
		System.out.println("FinalClass.version(): " + FinalClass.version());
		
		System.out.println();
		FinalClass.value = 77;
		System.out.println("FinalClass.value: " + FinalClass.value);
		System.out.println("FinalClass.value(): " + FinalClass.value());
		System.out.println("FinalClass.version(99): " + FinalClass.value(99));
		System.out.println("FinalClass.value: " + FinalClass.value);
	}
}