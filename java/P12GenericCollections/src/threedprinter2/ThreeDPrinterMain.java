package threedprinter2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		Material3DPrinter powderPrinter = new Material3DPrinter();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		Material3DPrinter plasticPrinter = new Material3DPrinter();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		
	}

}
