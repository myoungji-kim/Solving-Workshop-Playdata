package workshop8_4;

import java.util.ArrayList;

public class ShipTest {
	public static void main(String[] args) {
		// 1: ArrayList를 만들어 각각의 Boat 객체와 Cruise 객체를 생성하여 넣는다
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01", 1000));
		
		// 2: 생성된 객체의 정보 출력 - for문 사용
		System.out.println("shipName   fuelTank");
		System.out.println("---------------------------------");
		for (Ship ship : list) {
			System.out.println(ship.getShipName()+"  "+ship.getFuelTank());
		}
		
		// 3: Boat인 경우에는 10 운항하고 Cruise인 경우에는 15 운항 후 객체 정보 출력 - for문 사용
		System.out.println();
		System.out.println("shipName   fuelTank");
		System.out.println("---------------------------------");
		for (Ship ship : list) {
			if (ship instanceof Boat) {
				ship.sail(10);
			} else if (ship instanceof Cruise) {
				ship.sail(15);
			}
			System.out.println(ship.getShipName()+"  "+ship.getFuelTank());
		}
		
		// 4: Boat인 경우에는 20 주유하고 Cruise인 경우에는 30 주유 후 객체 정보 출력 - for문 사용
		System.out.println();
		System.out.println("shipName   fuelTank");
		System.out.println("---------------------------------");
		for (Ship ship : list) {
			if (ship instanceof Boat) {
				ship.refuel(20);
			} else if (ship instanceof Cruise) {
				ship.refuel(30);
			}
			System.out.println(ship.getShipName()+"  "+ship.getFuelTank());
		}
	}
}
