package threedprinter6generic;

public class Powder implements Material{
	@Override
	public void doPrinter() {
		System.out.println("[Powder] doPrinter...");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
