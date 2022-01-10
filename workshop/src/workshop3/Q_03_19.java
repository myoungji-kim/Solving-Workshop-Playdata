package workshop3;

import java.util.Scanner;

public class Q_03_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드 삼각형");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println(" ".repeat(n-i+1)+"*".repeat(i*2-1));
		}
	}
}
