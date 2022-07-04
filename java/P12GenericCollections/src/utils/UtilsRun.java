package utils;

public class UtilsRun {

	public static void main(String[] args) {
		// 제네릭 메소드의 자료형을 명시적으로 지정
		Box<String> appleBox = Utils.<String>boxing("사과상자");
		System.out.printf("[%s] count = %d\n", appleBox.getName(), appleBox.getCount());

		// 제네릭 메소드 자료형을 생략 가능
		// T로 전달되는 타입으로 형을 결정("파인애플" -> String)
		Box<String> pineApple = Utils.boxing("파인애플", 12);
		System.out.printf("[%s] count = %d\n", pineApple.getName(), pineApple.getCount());

	}

}
