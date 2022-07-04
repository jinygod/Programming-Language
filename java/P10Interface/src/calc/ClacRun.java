package calc;

public class ClacRun {

	public static void main(String[] args) {
		// Cannot instantiate the type Calcable
		// Calcable calc = new Calcable();
		
		System.out.println("[Calc]");
		
		//Calc calc = new Calcable();
		//Type mismatch: cannot convert from Calcable to Calc
		//Cannot instantiate the type Calcable
		
		//Calc calc = new Calc();
		Calcable calc = new Calc();
		int tot = calc.add(1, 2);
		tot -= calc.sub(10, 5);
		tot *= calc.mul(4, 2);
		tot /= calc.div(6, 2);
		
		System.out.println("tot= " + tot);
		System.out.println("calc.tot= " + calc.tot());
	}

}
