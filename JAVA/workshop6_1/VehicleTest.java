package workshop6_1;

public class VehicleTest {
	public static void main(String[] args) {
		System.out.println("최대적재중량  오일탱크크기  잔여오일량  현재적재중량  연비");
		Truck car = new Truck(1000, 100.0, 5.0);
		System.out.println(car.toString());
		// 50L 주유
		car.addOil(50);
		System.out.println("50L 주유");
		System.out.println(car.toString());
		
		// 50Km 주행
		car.moving(50);
		System.out.println("50Km 주행");
		System.out.println(car.toString());
		
		// 100Kg 적재
		car.addWeight(100);
		System.out.println("100Kg 적재");
		System.out.println(car.toString());
		
		// 30Km 주행
		car.moving(30);
		System.out.println("30Km 주행");
		System.out.println(car.toString());
		
		// 100Kg 탐재 및 30Km 주행 시 요금 출력
		System.out.println("요금");
		System.out.println(car.getCost(30));
		
	}
}
