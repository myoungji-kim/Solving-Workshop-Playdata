package workshop6_1;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	Vehicle(){}
	Vehicle(int maxWeight, double oilTankSize, double efficiency){
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	// 최대 적재량과 오일탱크크기
	@Override
	public String toString() {
		return maxWeight + "       " + oilTankSize + "       ";
	}
	
}
