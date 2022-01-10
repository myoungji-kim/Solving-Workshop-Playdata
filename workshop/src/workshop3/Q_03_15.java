package workshop3;

import java.util.Scanner;

public class Q_03_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) System.out.println("*".repeat(i));
	}
}
