package threedprinter3;

import threedprinter5generic.Material;

public class Powder implements Material {
	@Override
	public void doPrinter() {
		System.out.println("[Powder] doPrinter...");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
