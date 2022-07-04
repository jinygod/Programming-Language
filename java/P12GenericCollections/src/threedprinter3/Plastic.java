package threedprinter3;

import threedprinter5generic.Material;

public class Plastic implements Material {
	@Override
	public void doPrinter() {
		System.out.println("[Plastic] doPrinter...");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
}
