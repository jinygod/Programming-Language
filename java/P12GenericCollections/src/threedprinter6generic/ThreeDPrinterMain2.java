package threedprinter6generic;

public class ThreeDPrinterMain2 {

	public static void main(String[] args) {
		System.out.println("[threedprinter6 Generic]");
		
		Material3DPrinter<Powder> materialPrinter = new Material3DPrinter<>(); // 뒤에 괄호는 생략가능 앞에 명시된걸로 들어감
		materialPrinter.setMaterial(new Powder());
		materialPrinter.printing();
		printing(materialPrinter.getMaterial());
	}
	public static void printing(Material material) {
		material.doPrinter();
	}

}

