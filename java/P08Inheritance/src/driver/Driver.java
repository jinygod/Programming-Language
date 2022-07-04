package driver;

public class Driver {
	String name;
	Vehicle vehicle;
	
	public Driver() {
	}
	
	public Driver(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	
	public void drive() {
		if(this.vehicle != null) {
			this.run(this.vehicle);
		}
		else {
			System.out.printf("운전자에게 차량이 배정되지 않았습니다.%n");
		}
	}
	
	public void run(Vehicle vehicle) {
		System.out.printf("운행시작: 기사이름(%s) !!!\n",this.name);
		vehicle.run();
	}
	
}
