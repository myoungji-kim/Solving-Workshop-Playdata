package workshop3;

import java.util.Scanner;

public class Q_03_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----곱셈표-----");
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}