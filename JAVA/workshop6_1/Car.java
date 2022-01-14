package workshop6_1;

public class Car extends Vehicle {
	private double restOil;
	private int carWeight;
	
	Car(){}
	Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		this.restOil = restOil;
		this.carWeight = carWeight;
	}
	
	// 현재 오일량에 추가 (오일탱크크기 넘어가면 안됨)
	public void addOil(int oil) {
		if (this.restOil+oil <= getOilTankSize()) {
			setRestOil(this.restOil+oil);
		} else {
			System.out.println("더이상 오일을 추가할 수 없습니다.");
		}
	}
	
	// 연비와 주행거리에 따라 오일량 감소시킴
	public void moving(int distance) {
		setRestOil(this.restOil - distance);
	}
	
	// 현재 적재량에 물건을 추가 (최대적재중량 넘어가면 안됨)
	public void addWeight(int weight) {
		if (this.carWeight+weight <= getMaxWeight()) {
			setCarWeight(this.carWeight+weight);
		} else {
			System.out.println("더이상 추가할 수 없습니다.");
		}
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCarWeight() {
		return carWeight;
	}

	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}
	
	// 부모의 toString에 잔여오일량과 현재적재중량을 추가하여 리턴
	@Override
	public String toString() {
		return super.toString() + restOil + "       " + carWeight;
	}
}
