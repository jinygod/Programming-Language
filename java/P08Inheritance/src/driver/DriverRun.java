package driver;

public class DriverRun {

	public static void main(String[] args) {
		Driver drvTaxi = new Driver("김기사",new Taxi());
		drvTaxi.drive();
		
		Driver drvBus = new Driver("김기사",new Bus());
		drvBus.drive();
		drvBus.drive();
		
		Driver drvTruck = new Driver("김기사",new Truck());
		drvTruck.drive();

	}

}
