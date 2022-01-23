package workshop8_4;

public class Boat extends Ship {
	public Boat() {}
	
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	
	@Override // 1 운행 시 연료 10 감소
	public void sail(int dist) {
		fuelTank -= dist * 10;
	}

	@Override // 1 주유 시 연료 10 증가
	public void refuel(int fuel) {
		fuelTank += fuel * 10;
	}
	
	
}
