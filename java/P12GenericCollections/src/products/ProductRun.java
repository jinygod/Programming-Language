package products;

public class ProductRun {

	public static void main(String[] args) {
		Product<Car, String> proCar = new Product<>();
		proCar.setKind(new Car("소나타"));
		proCar.setModel("NF");
		proCar.setPd(2005);
		
		Car car = proCar.getKind();
		String model = proCar.getModel();
		int pd = proCar.getPd();
		
		System.out.println("자동차 종류: " + car.name);
		System.out.println("자동차 모델: " + model);
		System.out.println("생산연도: " + pd);
	}

}
