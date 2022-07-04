package threedprinter3;

import threedprinter5generic.Material;

public class Material3DPrinter {
	private Material material;
	
	public void printing() {
		/*
		if(material instanceof Powder) {
			Powder powder = (Powder)this.material;
			powder.doPrinter();
	}
		else if(material instanceof Plastic) {
			Plastic plastic = (Plastic)this.material;
			plastic.doPrinter();
	}
	*/
	material.doPrinter();
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public Material getMaterial() {
		return this.material;
	}
	
}
