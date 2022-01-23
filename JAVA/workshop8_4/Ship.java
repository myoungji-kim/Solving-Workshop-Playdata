package workshop8_4;

public abstract class Ship {
	String shipName;
	int fuelTank;

	public Ship() {}
	
	public Ship(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}

	public abstract void sail(int dist);   // 일정 거리 운항, 연료 소모
	public abstract void refuel(int fuel); // 일정 연료 주유

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	
}
