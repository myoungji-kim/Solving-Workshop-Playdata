package workshop6_1;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	Vehicle(){}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}


	// 최대 적재량, 오일탱크크기를 문자열로 리턴
	@Override
	public String toString() {
		return "Vehicle [maxWeight=" + maxWeight + ", oilTankSize=" + oilTankSize + ", efficiency=" + efficiency + "]";
	}
}
