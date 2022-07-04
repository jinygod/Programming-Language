package calc;

public class ClacRun2 {

	public static void main(String[] args) {
		// Cannot instantiate the type Calcable
		// Calcable calc = new Calcable();
		
		System.out.println("[Calc2]");
		
		//Calc calc = new Calcable();
		//Type mismatch: cannot convert from Calcable to Calc
		//Cannot instantiate the type Calcable

		Calcable calc = new Calc2Impl();
		int tot = calc.add(90, 10);
		tot -= calc.sub(10, 0);
		tot *= calc.mul(2, 2);
		tot /= calc.div(2, 2);
		
		System.out.println("tot= " + tot);
		
		printTot(calc);
		printAvg(calc);
	}
	
	public static void printTot(Calcable calc) {
		System.out.println("calc.tot= " + calc.tot());
	}
	public static void printAvg(Calcable calc) {
		float avg = (calc instanceof Calc2) ? ((Calc2)calc).avg() : 0.0f;
		
		Calc2 calc2 = (Calc2)calc;
		float avg2 = calc2.avg();
		System.out.println("calc2.avg= " + avg2);
		
		System.out.println("calc.avg= " + avg);
	}

}
