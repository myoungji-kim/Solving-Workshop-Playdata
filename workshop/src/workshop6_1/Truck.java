package workshop6_1;

public class Truck extends Car{
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	Truck(){}
	Truck(int maxWeight, double oilTankSize, double efficiency){
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	// 현재 적재 중량 5kg 당 연비 0.2km 감소시킨 값을 리턴
	double getEfficiency() { 
		 return 0.0;
	}
	
	// calcOil을 호출하여 오일 감소량을 획득,
	// 잔여오일량에서 감소량을 뺀 새로운 잔여오일량으로 재설정
	void moving(int distance) {  
		this.oilTankSize = calcOil(50);
	}
	
	// 거리를 연비로 나누어 오일 소모량을 추출하고 리턴
	double calcOil(int distance) { 
		return 0.0;
	}
	
	// alcOil( )을 호출하여 오일 감소량을 획득하고,
	// 1L 당 3000원의 요금 을 산정하여 리턴, 소수점 이하 버림
	int getCost(int distance) { 
		return 0;
	}
	
	// 부모의 toString에 연비를 추가하여 리턴
	@Override
	public String toString() {
		return "Truck [maxWeight=" + maxWeight + ", oilTankSize=" + oilTankSize + ", efficiency=" + efficiency + "]";
	}
}
