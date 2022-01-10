package workshop3;

import java.util.Scanner;

public class Q_03_07 {
	public static void main(String[] args) {
		System.out.println("한 자리 정수값을 입력하시오");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = 2;
		int sum = i;
		System.out.print(i);
		while (i*j<=100) {
			System.out.print("+" + i*j);
			sum += i*j;
			j ++;
		}
		System.out.println("="+sum);
	}
}
