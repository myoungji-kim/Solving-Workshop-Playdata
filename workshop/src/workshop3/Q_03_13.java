package workshop3;

import java.util.Scanner;

public class Q_03_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isPositive = false;
		int n = 0;
		
		System.out.println("2자리의 정수를 입력하세요.");
		while (!isPositive) {
			System.out.print("입력 : ");
			n = scan.nextInt();
			if (n >= 10 && n <= 99) isPositive = true;
		}
		System.out.printf("입력값은 %d", n);
	}
}
