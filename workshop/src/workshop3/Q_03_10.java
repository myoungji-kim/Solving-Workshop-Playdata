package workshop3;

import java.util.Scanner;

public class Q_03_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isPositive = false;
		int i = 0;
		int sum = 0;
		
		while (!isPositive) {
			System.out.println("1부터 n까지의 총합 구하기");
			i = scan.nextInt();
			if (i > 0) isPositive = true;
		}
		
		for (int n=1; n<=i; n++) sum += n;
		System.out.printf("1부터 %d 까지의 총합: %d", i, sum);
	}
}
