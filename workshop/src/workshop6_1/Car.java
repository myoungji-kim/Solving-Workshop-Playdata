package workshop6_1;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	
	Car(){}




	void addOil(int oil) { // 현재 오일량 추가, 단 오일탱크 크기 넘으면 안됨

	}
	
	void moving(int distance) { // 연비와 주행거리에 따라 오일량을 감소시킴
		
	}
	
	void addWeight(int weight) { // 현재 적재량에 물건을 추가. 단 최대 적재중량을 넘어서면 안 됨
		
	}

	// 부모의 toString()에 잔여오일량과 현재적재중량을 추가하여 리턴
	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + "]";
	}

	
}
