package utils;

public class UtilsRun2 {

	public static void main(String[] args) {
		// 제네릭 메소드의 자료형을 명시적으로 지정
		Box<Float> appleBox = Utils.boxing(3.14F);
		System.out.printf("[%.2f]\n", appleBox.getName(), appleBox.getCount());
	}

}
