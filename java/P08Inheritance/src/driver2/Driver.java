/*
 * boolean = 객체 instanceof 자료형
 */
package driver2;

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
		if(this.vehicle instanceof Bus) {
			System.out.println("vehicle is Bus");
			run((Bus)vehicle);
		}
		else if(this.vehicle instanceof Taxi) {
			System.out.println("vehicle is Taxi");
			run((Taxi)vehicle);
		}
		else if(this.vehicle instanceof Truck) {
			System.out.println("vehicle is Truck");
			run((Truck)vehicle);
		}
		else {
			System.out.println("vehicle is Unknown!!!");
			System.out.println("알수없는 차량이므로 운행을 할 수 없습니다.%n");
		}
		}
	
	public void run(Bus bus) {
		System.out.printf("[Bus]운행시작: 기사이름(%s) !!!\n",this.name);
		for(int station=0; station < 5; station++) {
		bus.run();
		}
	}
	
	public void run(Truck truck) {
		System.out.printf("운행시작: 기사이름(%s) !!!\n",this.name);
		truck.run();
	}
	public void run(Taxi taxi) {
		System.out.printf("운행시작: 기사이름(%s) !!!\n",this.name);
		taxi.run();
	}
	
	
}
