package workshop6_2;

public class MobileTest {
	public static void main(String[] args) {
		// 각각의 Mobile 객체 생성
		Ltab m1 = new Ltab("Ltab", 500, "AP-01");
		Otab m2 = new Otab("Otab", 1000, "AND-20");
		
		// 생성된 객체 정보 출력
		System.out.println("Mobile     Battery    OS");
		System.out.println("---------------------------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		// 각각의 Mobile 객체에 10분씩 충전
		m1.charge(10);
		m2.charge(10);
		
		// 10분 충전 후 객체 정보 출력
		System.out.println("\r10분 충전");
		System.out.println("Mobile     Battery    OS");
		System.out.println("---------------------------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		// 각각의 Mobile 객체에 5분씩 통화
		m1.operate(5);
		m2.operate(5);
		
		// 5분 통화 후 객체 정보 출력
		System.out.println("\r5분 통화");
		System.out.println("Mobile     Battery    OS");
		System.out.println("---------------------------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
}
