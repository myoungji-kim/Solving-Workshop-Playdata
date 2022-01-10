package workshop3;

import java.util.Scanner;

public class Q_03_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("왼쪽 위가 직각인 삼각형");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = scan.nextInt();
		for (int i=n; i>=1; i--) System.out.println("*".repeat(i));
	}
}
