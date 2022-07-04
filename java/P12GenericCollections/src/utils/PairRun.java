package utils;

public class PairRun {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("호박", 5);
		Pair<String, Integer> p2 = new Pair<>("애플", 10);
		Pair<String, Integer> p3 = new Pair<>("참외", 12);
		Pair<String, Integer> p4 = new Pair<>("애플", 10);
		
	//	Pair<Integer, String> p5 = new Pair<>(10, "애플");

		boolean b1 = Utils.<String, Integer>compare(p1,p2);
		boolean b2 = Utils.<String, Integer>compare(p1,p3);
		boolean b3 = Utils.<String, Integer>compare(p1,p4);
		boolean b4 = Utils.<String, Integer>compare(p2,p4);
		//boolean b5 = Utils.<String, Integer>compare(p1,p5);
		//The parameterized method <String, Integer>compare(Pair<String,Integer>, Pair<String,Integer>) 
		//of type Utils is not applicable for the arguments (Pair<String,Integer>, Pair<Integer,String>)
		//boolean b5 = Utils.compare(p1,p5);
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
	}

}
