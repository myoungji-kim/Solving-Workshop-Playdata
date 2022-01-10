package workshop6_1;

public class VehicleTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck car = new Truck(10000, 100, 5);
		System.out.println(car.toString());
		car.moving(50);
	}

}
