package workshop8_4;

public class Cruise extends Ship {
	public Cruise() {}
	
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override // 1 운행 시 연료 13 감소
	public void sail(int dist) {
		fuelTank -= dist * 13;
	}

	@Override // 1 주유 시 연료 8 증가
	public void refuel(int fuel) {
		fuelTank += fuel * 8;
	}

}
