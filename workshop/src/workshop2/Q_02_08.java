package workshop2;

import java.util.Scanner;

public class Q_02_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 정수 입력");
		int a = scan.nextInt();
		System.out.println("2. 정수 입력");
		int b = scan.nextInt();
		System.out.printf("정수 %d 과 정수 %d 의 합계 : %d", a, b, a+b);
	}
}
