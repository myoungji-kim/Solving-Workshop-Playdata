package workshop8_7;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Mobile> map = new HashMap<String, Mobile>();
		double sum = 0.0;
		
		// 4개의 Mobile 객체 생성
		Mobile m1 = new Mobile("LU68000", "Optimus 2X", 800000);
		Mobile m2 = new Mobile("SU66000", "Optimus Black", 900000);
		Mobile m3 = new Mobile("KU57000", "Optimus Big", 700000);
		Mobile m4 = new Mobile("SU76000", "Optimus Mach", 950000);
		
		// map에 4개의 객체를 code를 키 값으로 넣는다
		map.put("LU68000", m1);
		map.put("SU66000", m2);
		map.put("KU57000", m3);
		map.put("SU76000", m4);
		
		// Mobile 정보를 출력하고 합계를 계산
		for (String code : map.keySet()) {
			System.out.println(map.get(code).printInfo());
			sum += map.get(code).getPrice();
		}
		System.out.println("합계: "+sum);
		
		sum = 0.0;
		double newPrice = 0;
		// Mobile 객체의 가격 정보를 10% 증가시킴
		for (String code : map.keySet()) {
			newPrice = map.get(code).getPrice() + (map.get(code).getPrice() * 0.1);
			map.get(code).setPrice(newPrice);
		}
		
		// 변경된 정보를 출력
		System.out.println("\r가격 변경 후");
		for (String code : map.keySet()) {
			System.out.println(map.get(code).printInfo());
			sum += map.get(code).getPrice();
		}
		System.out.println("합계: "+sum);
	}
}
