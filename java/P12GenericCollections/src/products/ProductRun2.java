package products;

public class ProductRun2 {

	public static void main(String[] args) {
		Product<Tv, String> proTv = new Product<>(new Tv("SMART-TV"), "SMTV22");
		
		Tv tv = proTv.getKind();
		String model = proTv.getModel();
		
		System.out.println("TV 종류: " + tv.name);
		System.out.println("TV 모델: " + model);
	}

}
