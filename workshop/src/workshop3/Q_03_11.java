package workshop3;

import java.util.Scanner;

public class Q_03_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isLarge = false;
		int b = 0;
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		while (!isLarge) {
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			
			if (b < a) System.out.println("a보다 큰 값을 입력하세요!");
			else isLarge = true;
		}
		
		System.out.printf("b-a는 %d입니다.", b-a);
	}
}
