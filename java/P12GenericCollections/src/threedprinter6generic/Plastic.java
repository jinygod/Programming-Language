package threedprinter6generic;

public class Plastic implements Material{
	@Override
	public void doPrinter() {
		System.out.println("[Plastic] doPrinter...");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
}
