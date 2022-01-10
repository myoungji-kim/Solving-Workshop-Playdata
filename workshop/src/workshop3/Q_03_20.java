package workshop3;

import java.util.Scanner;

public class Q_03_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간 입력 : ");
		int time = scan.nextInt();
		System.out.print("월급 입력 : ");
		int money = scan.nextInt();
		int bonus = 0;
		System.out.println("=============");
		
		if (time >= 25) bonus = money;
		else if (time >= 20) bonus += money*0.8;
		else if (time >= 18) bonus += money*0.5;
		
		System.out.printf("보너스 : %d\r", bonus);
		System.out.printf("지급될 급여 : %d", bonus+money);
		
	}
}
