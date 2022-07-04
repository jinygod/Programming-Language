package utils;

public class BoxRun2 {

	public static void main(String[] args) {
		Box<String> b1 = new Box<>("사과", 10);
		Box<Integer> b2 = new Box<>(99, 81);
		
		printBox(b1);
		printBox(b2);
	}
	
	public static void printBox(Box<?> box) {
		if(box.getName() instanceof String) {
		System.out.println("[문자열 상자]");
		}
		else if(box.getName() instanceof Integer) {
			System.out.println("[숫자 상자]");
		}
		System.out.println("이름: " + box.getName());
		System.out.println("갯수: " + box.getCount());
	}

}
