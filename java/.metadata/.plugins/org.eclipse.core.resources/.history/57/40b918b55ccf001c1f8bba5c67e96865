package threedprinter2;

public class Material3DPrinter {
	private Object material;
	
	public void printing() {
		if(material instanceof Powder) {
			Powder powder = (Powder)this.material;
			powder.doPrinter();
	}
		else if(material instanceof Plastic) {
			Plastic plastic = (Plastic)this.material;
			plastic.doPrinter();
	}
	}
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return this.material;
	}
	
}
