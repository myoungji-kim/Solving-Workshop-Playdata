package workshop3;

import java.util.Scanner;

public class Q_03_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isPositive = false;
		int n = 0;
		System.out.println("양의 정수값의 자릿수 구하기");
		
		while (!isPositive) {
			System.out.print("정수값 : ");
			n = scan.nextInt();
			if (n > 0) isPositive = true;
		}
		
		String strN = Integer.toString(n); 
		System.out.printf("그 수는 %d자리입니다.", strN.length());
	}
}
