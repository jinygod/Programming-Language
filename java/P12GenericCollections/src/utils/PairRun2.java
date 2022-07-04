package utils;

public class PairRun2 {

	public static void main(String[] args) {
		Pair<String, Box<String>> p1 = new Pair<>("망고", new Box<String>("망고", 5));
		Pair<String, Box<String>> p2 = new Pair<>("애플", new Box<>("애플",10));
		Pair<String, Box<String>> p3 = new Pair<>("망고", new Box<>("망고",5));
		Pair<String, Box<String>> p4 = new Pair<>("애플", new Box<>("애플",10));

		boolean b1 = Utils.<String, Box<String>>compare(p1, p2);
		boolean b2 = Utils.compare(p1, p3);
		boolean b3 = Utils.compare(p1, p4);
		boolean b4 = Utils.compare(p2, p4);
		
		System.out.println("b1 = " + b1); // false
		System.out.println("b2 = " + b2); // true
		System.out.println("b3 = " + b3); // false
		System.out.println("b4 = " + b4); // true
	}

}
