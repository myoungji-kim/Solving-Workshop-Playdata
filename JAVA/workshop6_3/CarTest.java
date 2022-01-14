package workshop6_3;

public class CarTest {
	public static void main(String[] args) {
		// Car type의 객체 배열 2개 생성
		Car[] car = new Car[2];
	
		// 배열에 사용데이터에서 제공된 2개의 Car객체 넣기
		car[0] = new L3("L3", 1500, 50, 25, 0);
		car[1] = new L5("L3", 2000, 70, 35, 0);
		
		// 생성된 자동차의 기본 정보 출력
		System.out.println("VN    ES     OT     OS     Distance     Temperature");
		System.out.println("------------------------------------------------------");
		System.out.println(car[0]);
		System.out.println(car[1]);
		
		// 각각의 자동차에 25씩 주유
		car[0].setOil(25);
		car[1].setOil(25);
		
		// 25씩 주유한 자동차의 정보 출력
		System.out.println("\r25씩 주유");
		System.out.println("VN    ES     OT     OS     Distance     Temperature");
		System.out.println("------------------------------------------------------");
		System.out.println(car[0]);
		System.out.println(car[1]);
		
		// 각각의 자동차에 80씩 주행
		car[0].go(80);
		car[1].go(80);
		
		// 80씩 주행한 정보를 출력하며 엔진온도 정보를 출력
		System.out.println("\r80씩 주행 및 엔진온도정보");
		System.out.println("VN    ES     OT     OS     Distance     Temperature");
		System.out.println("------------------------------------------------------");
		System.out.println(car[0]);
		System.out.println(car[1]);
	}
}
