package driver2;

public class Bus extends Vehicle {
	int station; //정거장
	
	@Override
	public void run() {
		this.station++;
		System.out.printf("[Bus] 정거장(%d)버스가 달린다.%n", this.station);
	}
}