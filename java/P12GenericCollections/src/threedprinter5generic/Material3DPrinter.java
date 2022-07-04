package threedprinter5generic;

public class Material3DPrinter<T> {
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return this.material;
	}

	public void printing() {
		if(this.material instanceof Material) {
			Material mx = (Material)this.material;
					mx.doPrinter();
		}
		
	}
	
}
