package genericmethod;

public class ProductRun2 {
	public static void main(String[] args) {	
		ProductRun2 run = new ProductRun2();
		run.productCar();
		run.productTv();
	}
	
	// 제네릭 메소드
	public static <K, M> void productionCar(Product<K,M> product) {
	
		Car kind = (Car)product.getKind();
		String model = (String)product.getModel();
		int pd = product.getPd();
		
		System.out.println("[자동차]");
		System.out.println("종류: " + kind.name);
		System.out.println("모델: " + model);
		System.out.println("연도: " + pd);
		
	}
	public static void productionTv(Product<Tv, String> proTv2) {
		Product<Tv, String> proTv = new Product<>(new Tv("SMART-TV"), "SMTV22");
		
		Tv tv = (Tv)proTv.getKind();
		String model = (String)proTv.getModel();
		
		System.out.println("TV 종류: " + tv.name);
		System.out.println("TV 모델: " + model);
	}

	public void productCar() {
		Product<Car, String> proCar = new Product<>();
		proCar.setKind(new Car("소나타"));
		proCar.setModel("NF");
		proCar.setPd(2005);
		
		productionCar(proCar);
		
		
	}
	
	public void productTv() {
		Product<Tv, String> proTv = new Product<>(new Tv("SMART-TV"), "SMTV22",2022);
		productionTv(proTv);
	}

}
