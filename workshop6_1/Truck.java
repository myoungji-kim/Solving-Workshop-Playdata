package workshop6_1;

public class Truck extends Car {
	Truck(){}
	Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	// 현재 적재 중량 5KG 당 연비 0.2km 감소시킨 값을 리턴
	public double getEfficiency() {
		return super.getEfficiency()-(getCarWeight()/5)*0.2;
	}
	
	// calcOil()을 호출해 오일 감소량 획득, 잔여 오일량에서 감소량을 뺸 새로운 잔여오일량으로 재설정
	public void moving(int distance) {
		double useOil = calcOil(distance);
		setRestOil(getRestOil() - useOil);
	}
	
	// 거리를 연비로 나누어 오일 소모량을 추출하고 리턴
	public double calcOil(int distance) {
		return distance / getEfficiency();
	}
	
	// calcOil()을 호출해 오일 감소량 획득, 1L 당 3000원의 요금을 산정하여 리턴 (소수점 이하 버림)
	public int getCost(int distance) {
		double useOil = calcOil(distance);
		return 3000 * (int) useOil;
	}

	// 부모의 toString에 연비를 추가하여 리턴
	@Override
	public String toString() {
		return super.toString() + "         " + getEfficiency();
	}

	
}
