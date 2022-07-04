package threedprinter;

public class Plastic3DPrinter {
	private Plastic material;
	
	public void printing() {
		this.material.doPrinter();
	}
	
	public void setMaterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return this.material;
	}
	
}
